package com.cscorner.kaska;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class HomeActivity extends AppCompatActivity {

    private ImageView kaskaLogo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        // Find the Kaska logo
        kaskaLogo = findViewById(R.id.kaskaLogo);

        // Navigate to UploadDocumentActivity when clicking the logo
        kaskaLogo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomeActivity.this, UploadDocumentsActivity.class);
                startActivity(intent);
            }
        });
    }
}
