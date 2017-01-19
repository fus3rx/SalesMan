package com.imaginers.tonmo.salesman.login;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.imaginers.tonmo.salesman.database.Contact;
import com.imaginers.tonmo.salesman.database.DatabaseHelper;
import com.imaginers.tonmo.salesman.R;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    EditText etUname, etPass;
    Button loginBTN, Signup;
    DatabaseHelper databaseHelper = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        databaseHelper = new DatabaseHelper(getApplicationContext());
        etUname = (EditText) findViewById(R.id.etUname);
        etPass = (EditText) findViewById(R.id.etPass);
        loginBTN = (Button) findViewById(R.id.Login);
        Signup = (Button) findViewById(R.id.Signup);
        loginBTN.setOnClickListener(this);
        Signup.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {


        switch (v.getId()) {

            case R.id.Login:

                String uname = etUname.getText().toString().trim();
                String pass = etPass.getText().toString().trim();
                Contact c = new Contact(uname, pass);
                c.setUser(uname);
                c.setPassword(pass);

                boolean val = databaseHelper.loginData(c);
                if (val) {
                    Intent i = new Intent(getApplicationContext(), HomeActivity.class);
                    startActivity(i);
                } else {
                    Toast.makeText(getApplicationContext(), "loginBTN Failed", Toast.LENGTH_SHORT).show();
                }

                break;


            case R.id.Signup:

                Intent i = new Intent(this, SignupActivity.class);
                startActivity(i);

                break;

        }


    }
}
