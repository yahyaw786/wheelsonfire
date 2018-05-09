package com.mobitribe.wheelsonfire.main;

import android.app.Activity;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import com.mobitribe.wheelsonfire.R;
import com.mobitribe.wheelsonfire.databinding.ActivityCartBinding;
import com.mobitribe.wheelsonfire.databinding.ProductCartItemBinding;
import com.mobitribe.wheelsonfire.model.Product;
import com.squareup.picasso.Picasso;


public class CartViewHolder extends RecyclerView.ViewHolder {
    private ProductCartItemBinding binding;
    private CartActivity activity;
    public CartViewHolder(ProductCartItemBinding cartActivityBinding, CartActivity activity){
        super(cartActivityBinding.getRoot());
        this.binding = cartActivityBinding;
        this.activity = activity;
    }

    public void bindData( Product product) {
        binding.name.setText(product.getName());

        binding.price.setText("RS. " +product.getPrice());
        Picasso.with(activity).
                load(product.getImages().get(0).getSrc()).
                placeholder(R.drawable.y_profile_photo).fit().
                into(binding.businessImage);

    }
}
