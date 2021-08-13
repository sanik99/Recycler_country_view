package com.example.recycler_countrydetails;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class Nepal extends AppCompatActivity {

    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nepal);
        getSupportActionBar().setTitle("Nepal");


        textView = findViewById(R.id.home);

        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Nepal.this, MainActivity.class);
                startActivity(intent);
                Toast.makeText(Nepal.this,"Returning Home",Toast.LENGTH_SHORT).show();
            }
        });

    }
}