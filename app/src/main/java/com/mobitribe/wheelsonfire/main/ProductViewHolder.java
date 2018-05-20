package com.mobitribe.wheelsonfire.main;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import com.mobitribe.wheelsonfire.R;
import com.mobitribe.wheelsonfire.databinding.ProductListItemBinding;
import com.mobitribe.wheelsonfire.model.Product;
import com.mobitribe.wheelsonfire.main.MainActivity;
import com.squareup.picasso.Picasso;


public class ProductViewHolder extends RecyclerView.ViewHolder {
    private ProductListItemBinding binding;
    private MainActivity activity;
    public ProductViewHolder(ProductListItemBinding productListItemBinding, MainActivity activity){
        super(productListItemBinding.getRoot());
        this.binding = productListItemBinding;
        this.activity = activity;
    }

    public void bindData(final Product product) {
        binding.name.setText(product.getName());

       binding.price.setText("RS. " +product.getPrice());
       Picasso.with(activity).
                load(product.getImages().get(0).getSrc()).
                placeholder(R.drawable.y_profile_photo).fit().
                into(binding.businessImage);
        binding.addToCart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                activity.cartProducts.add(product);
            }
        });
        binding.productCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(activity ,ProductActivity.class);
                v.getContext().startActivity(intent);
            }
        });
    }
}
