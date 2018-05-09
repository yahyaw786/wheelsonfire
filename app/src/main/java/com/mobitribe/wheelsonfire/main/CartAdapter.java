package com.mobitribe.wheelsonfire.main;

import android.app.Activity;
import android.databinding.DataBindingUtil;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import com.mobitribe.wheelsonfire.R;
import com.mobitribe.wheelsonfire.databinding.ActivityCartBinding;
import com.mobitribe.wheelsonfire.databinding.ProductCartItemBinding;
import com.mobitribe.wheelsonfire.model.Category;
import com.mobitribe.wheelsonfire.model.Product;

import java.util.ArrayList;


public class CartAdapter extends RecyclerView.Adapter<CartViewHolder> {
    private ArrayList<Product> products;
    private CartActivity activity;


    public CartAdapter(ArrayList<Product> products, CartActivity activity) {
        this.products = products;
        this.activity = activity;
    }

    @Override
    public CartViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        ProductCartItemBinding databing =
                DataBindingUtil.inflate(LayoutInflater.from(activity), R.layout.product_cart_item,parent,false);
        return new CartViewHolder(databing, activity);

    }
    @Override
    public void onBindViewHolder(CartViewHolder holder, int position) {
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

        if (data==null) {
            data = new ArrayList<>();
        }
        products.addAll(data);
        notifyDataSetChanged();
    }


}
