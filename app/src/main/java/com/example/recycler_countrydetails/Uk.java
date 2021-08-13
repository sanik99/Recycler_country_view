package com.example.recycler_countrydetails;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class Uk extends AppCompatActivity {

    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_uk);
        getSupportActionBar().setTitle("United Kingdom");

        textView = findViewById(R.id.home4);

        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Uk.this, MainActivity.class);
                startActivity(intent);
                Toast.makeText(Uk.this,"Returning Home Page", Toast.LENGTH_SHORT).show();
            }
        });
    }
}