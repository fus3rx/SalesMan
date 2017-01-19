package com.imaginers.tonmo.salesman.customer;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import com.imaginers.tonmo.salesman.R;

import java.util.ArrayList;

public class CustomerActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {

    String[] mCustomers = {"Rafi", "Tusher", "Ishayat", "Shohag", "Armaan"};
    ListView mCustomerList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_customer);
        //bind the listview id to this class
        mCustomerList = (ListView) findViewById(R.id.customersLV);
        //to create adapter and pass context,built-in simple list item &
        // array data to the adapter
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, mCustomers);
        //adapter needed to attached to the listview
        //to set the listview data to a simple view
        mCustomerList.setAdapter(adapter);
        //set for listening to the clicks on the row
        //need to implement OnItemClickListner
        mCustomerList.setOnItemClickListener(this);
    }

    //onItemClick implementation overrides this onItemClick method as
    //interfaces rules are to override them
    //AdapterView is the ListView,View is the row,position is
    // the position of textview and id is id of textview

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {


        ArrayList<CustomerDetails> customerDetails = new ArrayList<>();
        customerDetails.add(new CustomerDetails(R.drawable.customer1, mCustomers[0], "01711934", "3S Shopping Mall", "House # 2, Road # 9, Sector # 1,Uttara", "A12"));
        customerDetails.add(new CustomerDetails(R.drawable.customer2, mCustomers[1], "948798", "Alams General Store", "Road # 5, Dhanmondi, Mirpur Road", "B12"));
        customerDetails.add(new CustomerDetails(R.drawable.customer3, mCustomers[2], "874576", "3S Shopping Mall", "House # 2, Road # 9, Sector # 1,Uttara", "C12"));
        customerDetails.add(new CustomerDetails(R.drawable.customer4, mCustomers[3], "98987987", "3S Shopping Mall", "House # 2, Road # 9, Sector # 1,Uttara", "D12"));
        customerDetails.add(new CustomerDetails(R.drawable.customer5, mCustomers[4], "09887", "3S Shopping Mall", "House # 2, Road # 9, Sector # 1,Uttara", "E12"));


        Intent toCustomerDetailsIntent = new Intent(CustomerActivity.this, CustomerDetailsActivity.class);
        toCustomerDetailsIntent.putExtra("test", customerDetails);
        toCustomerDetailsIntent.putExtra("pos", position);

        CustomerActivity.this.startActivity(toCustomerDetailsIntent);
        Toast.makeText(this, mCustomers[position] , Toast.LENGTH_SHORT).show();


    }
}
