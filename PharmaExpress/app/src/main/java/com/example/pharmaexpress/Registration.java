package com.example.pharmaexpress;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.google.firebase.auth.FirebaseAuth;

public class Registration extends AppCompatActivity {

    private EditText firstname_input, surname_input, email_input, location_input, password_input;
    private String firstname, surname, email, location, password
    private FirebaseAuth mAuth;
// ...


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration);
        // Initialize Firebase Auth
        mAuth = FirebaseAuth.getInstance();
        firstname_input = findViewById(R.id.edit_firtst_name);
        surname_input = findViewById(R.id.edit_surname);
        email_input = findViewById(R.id.edit_email);
        location_input = findViewById(R.id.edit_location);
        password_input = findViewById(R.id.edit_password);

        findViewById(R.id.btn_register).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Récupérer les données dans les champs de texte
                firstname = firstname_input.getText().toString();
                surname = surname_input.getText().toString();
                email = email_input.getText().toString();
                location = location_input.getText().toString();
                password = password_input.getText().toString();

                //Vérifier si les champs sont tous remplis

                if(firstname.isEmpty() || surname.isEmpty() || email.isEmpty() || location.isEmpty() || password.isEmpty()){
                    Toast.makeText(Registration.this, "Informations incomplètes . Tous les champs sont obligatoires", Toast.LENGTH_SHORT).show();
                }else{

                }

                startActivity(new Intent(Registration.this, MainActivity.class));
            }
        });
    }
}