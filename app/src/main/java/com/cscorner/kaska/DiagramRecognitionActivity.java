package com.cscorner.kaska;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class DiagramRecognitionActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_diagram_recognition);

        // Find buttons
        Button btnNext = findViewById(R.id.btnNext);
        Button btnSkip = findViewById(R.id.btnSkip);

        // Set click listener for Next button (Navigate to MicroLearningActivity)
        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(DiagramRecognitionActivity.this, MicroLearningActivity.class);
                startActivity(intent);
            }
        });

        // Set click listener for Skip button (Navigate to WelcomeActivity)
        btnSkip.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(DiagramRecognitionActivity.this, WelcomeActivity.class);
                startActivity(intent);
            }
        });
    }
}
