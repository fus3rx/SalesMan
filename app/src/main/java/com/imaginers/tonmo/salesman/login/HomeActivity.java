package com.imaginers.tonmo.salesman.login;


import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.imaginers.tonmo.salesman.R;
import com.imaginers.tonmo.salesman.customer.CustomerActivity;
import com.imaginers.tonmo.salesman.login.MainActivity;
import com.imaginers.tonmo.salesman.products.ProductsActivity;
import com.imaginers.tonmo.salesman.sales.SalesActivity;
import com.imaginers.tonmo.salesman.statistics.StatisticsActivity;

/**
 * Created by tonmo on 16-10-2016.
 */
public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
    }

    public void sellClick(View view) {
        Intent myIntent = new Intent(this, ProductsActivity.class);
        startActivity(myIntent);
    }

    public void customerClick(View view) {
        Intent myIntent = new Intent(this, CustomerActivity.class);
        startActivity(myIntent);
    }

    public void statClick(View view) {
        Intent myIntent = new Intent(this, StatisticsActivity.class);
        startActivity(myIntent);
    }

    public void salesClick(View view) {
        Intent myIntent = new Intent(this, SalesActivity.class);
        startActivity(myIntent);
    }

    public void logoutClick(View view) {
        Intent myIntent = new Intent(this, MainActivity.class);
        startActivity(myIntent);
    }
}
