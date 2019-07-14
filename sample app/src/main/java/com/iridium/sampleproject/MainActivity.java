package com.iridium.sampleproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();


        Button to_website = findViewById(R.id.to_website);
        to_website.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                toNextActivity(WebActivity.class);
            }
        });

        Button toProfile = findViewById(R.id.to_profile);
        toProfile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                toNextActivity(ProfileActivity.class);
            }
        });


    }

    private void toNextActivity(Class myActivity) {
        Intent intent = new Intent(this, myActivity);
        startActivity(intent);
        finish();
    }
}
