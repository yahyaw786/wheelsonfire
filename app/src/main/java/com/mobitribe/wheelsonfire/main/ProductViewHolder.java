package com.mobitribe.wheelsonfire.main;

import android.app.Activity;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import com.mobitribe.wheelsonfire.R;
import com.mobitribe.wheelsonfire.databinding.ProductListItemBinding;
import com.mobitribe.wheelsonfire.model.Product;
import com.squareup.picasso.Picasso;

/**
 * Author: Uzair Qureshi
 * Date:  11/9/17.
 * Description:
 */

public class ProductViewHolder extends RecyclerView.ViewHolder {
    private ProductListItemBinding binding;
    private Activity activity;

    public ProductViewHolder(ProductListItemBinding productListItemBinding, Activity activity){
        super(productListItemBinding.getRoot());
        this.binding = productListItemBinding;
        this.activity = activity;
    }

    public void bindData(Product product) {
       binding.name.setText(product.getName());
       binding.price.setText("RS. " +product.getPrice());
       Picasso.with(activity).
                load(product.getImages().get(0).getSrc()).
                placeholder(R.drawable.y_profile_photo).fit().
                into(binding.businessImage);

    }
}
