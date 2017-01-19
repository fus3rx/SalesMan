package com.imaginers.tonmo.salesman.products;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import com.imaginers.tonmo.salesman.R;
import com.imaginers.tonmo.salesman.sales.SalesActivity;

import java.util.ArrayList;

public class ProductDetailsActivity extends AppCompatActivity  {
    ArrayList<ProductInformation> productInformations;
    ImageView img;
    EditText mAmount,mQuantity,mCustomer;
    TextView mProductName;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_product_details);
        img=(ImageView)findViewById(R.id.productIMG);
        mAmount=(EditText)findViewById(R.id.paymentET);
        mQuantity=(EditText)findViewById(R.id.amountET);
        mCustomer=(EditText)findViewById(R.id.customerNameET);
        mProductName=(TextView) findViewById(R.id.productName);

        Intent intent = getIntent();
        productInformations = (ArrayList<ProductInformation>) intent.getSerializableExtra("testt");
        int position = intent.getIntExtra("poss", 0);

        //mAmount.setText(productInformations.get(position).get);
        //img.setImageResource(productInformations.get(position).getImages());
        mProductName.setText(productInformations.get(position).getProductName());

    }

    public void sellProClick(View view) {
        Intent i=new Intent(this,SalesActivity.class);
        startActivity(i);
    }
}
