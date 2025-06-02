package com.cscorner.kaska;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView; // 🔹 Import ImageView for Back Button
import android.widget.TextView;
import android.widget.Toast; // 🔹 Import Toast

import androidx.appcompat.app.AppCompatActivity;

public class LoginActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        // Find views
        Button btnLogin = findViewById(R.id.btnLogin);
        TextView signUp = findViewById(R.id.txtSignUp);
        ImageView btnBack = findViewById(R.id.btnBack); // 🔹 Back Button

        // Show a message when clicking Sign Up
        signUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(LoginActivity.this, "Sign Up feature is coming soon!", Toast.LENGTH_SHORT).show();
            }
        });

        // Navigate back to WelcomeActivity when clicking the Back button
        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LoginActivity.this, WelcomeActivity.class);
                startActivity(intent);
                finish(); // Close LoginActivity
            }
        });

        // Login Button Click (No Logic Yet)
        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO: Handle Login Logic
            }
        });
    }

    // 🔹 Handle system back button press
    @Override
    public void onBackPressed() {
        Intent intent = new Intent(LoginActivity.this, WelcomeActivity.class);
        startActivity(intent);
        finish();
    }
}
