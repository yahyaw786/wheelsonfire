package com.mobitribe.wheelsonfire.main;

import android.app.Activity;
import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.Toolbar;
import android.view.View;

import com.mobitribe.wheelsonfire.R;
import com.mobitribe.wheelsonfire.databinding.ActivityCartBinding;
import com.mobitribe.wheelsonfire.model.Billing;
import com.mobitribe.wheelsonfire.model.Billing.LineItem;
import com.mobitribe.wheelsonfire.model.Product;

import java.util.ArrayList;

public class CartActivity extends AppCompatActivity {
    CartAdapter adapter;
    ArrayList<Product> products;
    private ActivityCartBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this,R.layout.activity_cart);

        products= (ArrayList<Product>) getIntent().getExtras().getSerializable("Cart");
        adapter = new CartAdapter(products,this);
        initializeRecyclerView();
        adapter.swap(products);

    }
    private void initializeRecyclerView() {
        binding.cartList.setLayoutManager(new LinearLayoutManager(this));
        binding.cartList.setAdapter(adapter);
    }

}
