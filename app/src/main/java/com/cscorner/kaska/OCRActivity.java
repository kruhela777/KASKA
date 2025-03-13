package com.cscorner.kaska;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class OCRActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ocractivity);  // Update if your XML file has a different name

        // Find the Skip button
        Button btnNext = findViewById(R.id.btnNext);
        Button btnSkip = findViewById(R.id.btnSkip);

        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(OCRActivity.this, DiagramRecognitionActivity.class);
                startActivity(intent);
            }
        });
        // Set click listener to navigate to WelcomeActivity
        btnSkip.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(OCRActivity.this, WelcomeActivity.class);
                startActivity(intent);
            }
        });
    }
}
