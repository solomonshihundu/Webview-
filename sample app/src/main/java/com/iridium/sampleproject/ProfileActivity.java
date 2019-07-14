package com.iridium.sampleproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class ProfileActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);
        getSupportActionBar().hide();

        Button exitProfile = findViewById(R.id.back_from_profile);
        exitProfile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                toNextActivity(MainActivity.class);
            }
        });

    }



    private void toNextActivity(Class myActivity) {
        Intent intent = new Intent(this, myActivity);
        startActivity(intent);
        finish();
    }
}
