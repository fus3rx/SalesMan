package com.imaginers.tonmo.salesman.customer;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import com.imaginers.tonmo.salesman.R;

import java.util.ArrayList;

public class CustomerDetailsActivity extends AppCompatActivity {
    ImageView customerImage;
    EditText customerFullName;
    EditText customerMobile;
    EditText customerShopName;
    EditText customerAddress;
    TextView customerShopID;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_customer_details);

        customerImage = (ImageView) findViewById(R.id.customerImage_ID);
        customerFullName = (EditText) findViewById(R.id.customerNameET_ID);
        customerMobile = (EditText) findViewById(R.id.customerMobileET_ID);
        customerShopName = (EditText) findViewById(R.id.shopNameET_ID);
        customerAddress = (EditText) findViewById(R.id.shopAddressET_ID);
        customerShopID = (TextView) findViewById(R.id.shopIdTV_ID);

        Intent intent = getIntent();
        ArrayList<CustomerDetails> customerDetails = (ArrayList<CustomerDetails>) intent.getSerializableExtra("test");
        int position = intent.getIntExtra("pos", 0);

        customerImage.setImageResource(customerDetails.get(position).getCustomerImage());
        customerFullName.setText(customerDetails.get(position).getCustomerFullName());
        customerMobile.setText(customerDetails.get(position).getCustomerMobile());
        customerShopName.setText(customerDetails.get(position).getCustomerShopName());
        customerAddress.setText(customerDetails.get(position).getCustomerShopAddress());
        customerShopID.setText(customerDetails.get(position).getCustomerShopID());

    }
}
