package com.example.helloworld;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView; //importing textview from widget package

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main); //related to activity_main.xml file


    }
    public void onBtnClick (View view){
        TextView txtFirstName = findViewById(R.id.FirstName);
        TextView txtLastName = findViewById(R.id.LastName);
        TextView txtEmail = findViewById(R.id.Email);

        EditText lastName = findViewById(R.id.lastName);
        EditText firstName = findViewById(R.id.firstName);
        EditText email = findViewById(R.id.emailText);

        txtFirstName.setText(firstName.getText().toString());
        txtLastName.setText(lastName.getText().toString());
        txtEmail.setText(email.getText().toString());
    }

}