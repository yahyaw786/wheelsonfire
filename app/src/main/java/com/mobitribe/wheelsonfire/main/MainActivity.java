package com.mobitribe.wheelsonfire.main;

import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.os.Handler;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.SubMenu;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.AbsListView;
import android.widget.ProgressBar;
import android.widget.Toast;

import com.mobitribe.wheelsonfire.R;
import com.mobitribe.wheelsonfire.databinding.ActivityMainBinding;
import com.mobitribe.wheelsonfire.model.Billing;
import com.mobitribe.wheelsonfire.model.Category;
import com.mobitribe.wheelsonfire.model.Product;
import com.mobitribe.wheelsonfire.network.NetworkContants;
import com.mobitribe.wheelsonfire.network.RestClient;

import java.util.ArrayList;
import java.util.HashMap;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {
    public ArrayList<Product> cartProducts;
    int page =1;
    ActivityMainBinding binding;
    private ProductAdapter adapter;
    Boolean isScrolling = false;
    int currentItems,scrollOutItems,totalItems;
    ProgressBar progressBar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // setContentView(R.layout.activity_main);
        binding = DataBindingUtil.setContentView(this,R.layout.activity_main);
        cartProducts = new ArrayList<>();
        setSupportActionBar(binding.appBarMain.toolbar);
        progressBar = (ProgressBar)findViewById(R.id.progress);


        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Bundle b = new Bundle();
                Intent i = new Intent(MainActivity.this,CartActivity.class);
                b.putSerializable("Cart", cartProducts);

                i.putExtras(b);
                startActivity(i);
            }
        });

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(this, drawer, binding.appBarMain.toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

        fetchCategory();
        initializeRecyclerView();

        fetchData();
    }

    private void fetchCategory(){

        HashMap params = new HashMap();
        params.put("consumer_key", NetworkContants.CONSUMER_KEY);
        params.put("consumer_secret",NetworkContants.CONSUMER_SECRET);
        params.put("per_page",50);
        RestClient.getRestAdapter().getListOfCategory(params).enqueue(new Callback<ArrayList<Category>>() {
            NavigationView navigationView= (NavigationView)findViewById(R.id.nav_view);
            @Override
            public void onResponse(Call<ArrayList<Category>> call, Response<ArrayList<Category>> response) {

                if (response.isSuccessful()) {

                    Menu m = navigationView.getMenu();
                    for (Category category : response.body()) {
                        if (category.getParent() == 0) {
                            m.add(category.getName());
                        }

                    }


                }


                }


            @Override
            public void onFailure(Call<ArrayList<Category>> call, Throwable t) {

            }
        });
    }
    private void fetchData() {
        progressBar.setVisibility(View.VISIBLE);
        final HashMap params = new HashMap();
        params.put("consumer_key", NetworkContants.CONSUMER_KEY);
        params.put("consumer_secret",NetworkContants.CONSUMER_SECRET);
        params.put("per_page",15);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                params.put("page",page);
                RestClient.getRestAdapter().getListOfProducts(params).enqueue(new Callback<ArrayList<Product>>() {
                    @Override
                    public void onResponse(Call<ArrayList<Product>> call, Response<ArrayList<Product>> response) {
                        if (response.isSuccessful())
                        {
                            adapter.swap(response.body());
                        }
                        page++;
                        progressBar.setVisibility(View.GONE);
                    }

                    @Override
                    public void onFailure(Call<ArrayList<Product>> call, Throwable t) {

                    }
                });
            }
        },5000);


    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    /**
     * @usage It initialize the recycler view
     */
    private void initializeRecyclerView() {
        final GridLayoutManager manager = new GridLayoutManager(this, 3);
        binding.appBarMain.contentMain.productList.setLayoutManager(manager);
        adapter = new ProductAdapter(new ArrayList<Product>(), this);
        binding.appBarMain.contentMain.productList.setAdapter(adapter);
        binding.appBarMain.contentMain.productList.addOnScrollListener(new RecyclerView.OnScrollListener() {
            @Override
            public void onScrollStateChanged(RecyclerView recyclerView, int newState) {
                super.onScrollStateChanged(recyclerView, newState);
                if(newState== AbsListView.OnScrollListener.SCROLL_STATE_TOUCH_SCROLL){
                    isScrolling= true;
                }
            }

            @Override
            public void onScrolled(RecyclerView recyclerView, int dx, int dy) {
                super.onScrolled(recyclerView, dx, dy);
                currentItems= manager.getChildCount();
                totalItems = manager.getItemCount();
                scrollOutItems = manager.findFirstCompletelyVisibleItemPosition();
                if(isScrolling && (currentItems + scrollOutItems == totalItems)){
                    isScrolling = false;
                    fetchData();
                }
            }
        });
    }

//    @Override
//    public boolean onCreateOptionsMenu(Menu menu) {
//        // Inflate the menu; this adds items to the action bar if it is present.
////        getMenuInflater().inflate(R.menu.main, menu);
//        return true;
//    }
//
//    @Override
//    public boolean onOptionsItemSelected(MenuItem item) {
//        // Handle action bar item clicks here. The action bar will
//        // automatically handle clicks on the Home/Up button, so long
//        // as you specify a parent activity in AndroidManifest.xml.
//        int id = item.getItemId();
//        //noinspection SimplifiableIfStatement
//        if (id == R.id.action_settings) {
//            return true;
//        }
//
//        return super.onOptionsItemSelected(item);
//    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
   public boolean onNavigationItemSelected(MenuItem item) {
//        // Handle navigation view item clicks here.
//        int id = item.getItemId();
//
//        if (id == R.id.nav_camera) {
//            // Handle the camera action
//        } else if (id == R.id.nav_gallery) {
//
//        } else if (id == R.id.nav_slideshow) {
//
//        } else if (id == R.id.nav_manage) {
//
//        } else if (id == R.id.nav_share) {
//
//        } else if (id == R.id.nav_send) {
//
//        }

//        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
//        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}
