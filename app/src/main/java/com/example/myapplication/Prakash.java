package com.example.myapplication;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;


public class Prakash extends AppCompatActivity {

    EditText editTextName, editTextEmail, editTextPassword, editTextMobile;
    TextView textViewDisplayName, textViewDisplayEmail, textViewDisplayPassword, textViewDisplayMobile;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editTextName = findViewById(R.id.editTextName);
        editTextEmail = findViewById(R.id.editTextEmail);
        editTextPassword = findViewById(R.id.editTextPassword);
        editTextMobile = findViewById(R.id.editTextMobile);

        textViewDisplayName = findViewById(R.id.textViewDisplayName);
        textViewDisplayEmail = findViewById(R.id.textViewDisplayEmail);
        textViewDisplayPassword = findViewById(R.id.textViewDisplayPassword);
        textViewDisplayMobile = findViewById(R.id.textViewDisplayMobile);
        button=findViewById(R.id.buttonSignIn);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String name = editTextName.getText().toString();
                String email = editTextEmail.getText().toString();
                String password = editTextPassword.getText().toString();
                String mobile = editTextMobile.getText().toString();

                textViewDisplayName.setText("Display User Name: " + name);
                textViewDisplayEmail.setText("Display Email: " + email);
                textViewDisplayPassword.setText("Display Password: " + password);
                textViewDisplayMobile.setText("Display Mobile Number: " + mobile);
            }
        });
    }

}
