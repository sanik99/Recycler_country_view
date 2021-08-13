package com.example.recycler_countrydetails;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class France extends AppCompatActivity {

    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_france);
        getSupportActionBar().setTitle("France");

        textView = findViewById(R.id.home3);

        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(France.this, MainActivity.class);
                startActivity(intent);
                Toast.makeText(France.this, "Returning Home Page", Toast.LENGTH_SHORT).show();
            }
        });

    }
}