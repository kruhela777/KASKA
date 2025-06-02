package com.cscorner.kaska;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        // Detect taps anywhere on the screen
        View rootView = findViewById(R.id.main);  // Ensure 'main' is the ID of the root layout
        rootView.setOnClickListener(view -> {
            Intent intent = new Intent(MainActivity.this, OCRActivity.class);
            startActivity(intent);
            finish(); // Optional: Closes MainActivity so the back button won't return here
        });
    }
}
