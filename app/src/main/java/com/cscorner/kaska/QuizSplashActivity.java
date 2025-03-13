package com.cscorner.kaska;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class QuizSplashActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz_splash);

        // Find the Next button
        Button btnNext = findViewById(R.id.btnNextQuiz);

        // Set click listener to move to WelcomeActivity
        btnNext.setOnClickListener(v -> {
            startActivity(new Intent(QuizSplashActivity.this, WelcomeActivity.class));
            finish(); // Finish the current activity
        });
    }
}
