package com.imaginers.tonmo.salesman.products;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import com.imaginers.tonmo.salesman.R;

import java.util.ArrayList;

public class ProductsActivity extends AppCompatActivity implements AdapterView.OnItemClickListener{
    ArrayList<ProductInformation> productInformations;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_products);
        ArrayList<ProductInformation> productInformations = new ArrayList<>();

        productInformations.add(new ProductInformation(R.drawable.pic1, "Shampoo", "10"));
        productInformations.add(new ProductInformation(R.drawable.pic2, "Milo", "20"));
        productInformations.add(new ProductInformation(R.drawable.pic3, "Johnson Powder", "17"));
        productInformations.add(new ProductInformation(R.drawable.pic4, "AEDA Soap", "100"));
        productInformations.add(new ProductInformation(R.drawable.pic5, "7-UP", "50"));
        productInformations.add(new ProductInformation(R.drawable.pic6, "Lipton Drink", "200"));


        ProductListAdapter adapter = new ProductListAdapter(this, productInformations);


        ListView productListView = (ListView) findViewById(R.id.listView_ID);
        productListView.setAdapter(adapter);
        productListView.setOnItemClickListener(this);
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        productInformations = new ArrayList<>();
        Intent toProductDetails = new Intent(ProductsActivity.this, ProductDetailsActivity.class);
        toProductDetails.putExtra("testt", productInformations);
        toProductDetails.putExtra("poss", position);

        this.startActivity(toProductDetails);
        Toast.makeText(this,"clicked "+position,Toast.LENGTH_SHORT).show();

    }
}
