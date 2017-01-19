package com.imaginers.tonmo.salesman.products;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.imaginers.tonmo.salesman.R;

import java.util.ArrayList;

/**
 * Created by tonmo on 1/18/2017.
 */

public class ProductListAdapter extends ArrayAdapter<ProductInformation> {
    ArrayList<ProductInformation> productInformations;
    Context context;


    public ProductListAdapter(Context context, ArrayList<ProductInformation> productInformations) {
        super(context, R.layout.product_row, productInformations);
        this.productInformations = productInformations;
        this.context = context;
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        ProductInformation productInformation = productInformations.get(position);
        convertView = LayoutInflater.from(context).inflate(R.layout.product_row, parent, false);

        TextView productName = (TextView) convertView.findViewById(R.id.productName_TV_ID);
        TextView productQuantity = (TextView) convertView.findViewById(R.id.productQuantity_TV_ID);
        ImageView productImage = (ImageView) convertView.findViewById(R.id.productImage_IV_ID);

        productName.setText(productInformation.getProductName());
        productQuantity.setText(String.valueOf(productInformation.getProductAvailability()));

        productImage.setImageResource(productInformation.getImages());

        return convertView;
    }
}
