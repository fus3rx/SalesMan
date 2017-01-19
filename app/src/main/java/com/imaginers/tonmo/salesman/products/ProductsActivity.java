package com.imaginers.tonmo.salesman.products;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import com.imaginers.tonmo.salesman.R;

import java.util.ArrayList;

public class ProductsActivity extends AppCompatActivity {

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
    }
}
