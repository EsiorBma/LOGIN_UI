package com.example.pharmaexpress.ui.home.account;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import com.example.pharmaexpress.R;
import com.google.firebase.auth.FirebaseAuth;

public class account_info extends AppCompatActivity {

    private EditText firstName_input, name_input, email_input, dateNais_input, phone_input;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_account_info);
        firstName_input = findViewById(R.id.Input_firtsName);
        name_input = findViewById(R.id.Input_Name);
        email_input = findViewById(R.id.Input_Mail);
        dateNais_input = findViewById(R.id.Input_Naissance);
        phone_input = findViewById(R.id.Input_Phone);

        findViewById(R.id.info_back).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });


    }
}