package com.cscorner.kaska;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
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
        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(QuizSplashActivity.this, WelcomeActivity.class);
                startActivity(intent);
            }
        });
    }
}
