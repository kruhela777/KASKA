package com.cscorner.kaska;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class MicroLearningActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_micro_learning);

        // Find the Get Started button
        Button btnGetStarted = findViewById(R.id.btnGetStarted);

        // Set click listener to navigate to QuizSplashActivity
        btnGetStarted.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MicroLearningActivity.this, QuizSplashActivity.class);
                startActivity(intent);
            }
        });
    }
}
