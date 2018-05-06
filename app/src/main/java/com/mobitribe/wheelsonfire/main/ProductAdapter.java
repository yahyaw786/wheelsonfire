package com.mobitribe.wheelsonfire.main;

import android.app.Activity;
import android.databinding.DataBindingUtil;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import com.mobitribe.wheelsonfire.R;
import com.mobitribe.wheelsonfire.databinding.ProductListItemBinding;
import com.mobitribe.wheelsonfire.model.Category;
import com.mobitribe.wheelsonfire.model.Product;

import java.util.ArrayList;


public class ProductAdapter extends RecyclerView.Adapter<ProductViewHolder> {
    private ArrayList<Product> products;
    private Activity activity;


    public ProductAdapter(ArrayList<Product> products, Activity activity) {
        this.products = products;
        this.activity = activity;
    }

    @Override
    public ProductViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        ProductListItemBinding databing =
                DataBindingUtil.inflate(LayoutInflater.from(activity), R.layout.product_list_item,parent,false);
        return new ProductViewHolder(databing, activity);

    }

    @Override
    public void onBindViewHolder(ProductViewHolder holder, int position) {
        holder.bindData(products.get(position));
    }

    @Override
    public int getItemCount() {
        return products.size();
    }

    /*
     * @usage Swap the previous data with new one : onRefresh
     * @param data
     */
    public void swap(ArrayList<Product> data) {

        if (data==null)
        {
            data = new ArrayList<>();
        }
        products.addAll(data);
        notifyDataSetChanged();
    }


}
