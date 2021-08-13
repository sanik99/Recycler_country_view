package com.example.recycler_countrydetails;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView textView, textView2, textView3, textView4, textView5;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().setTitle("Countries");

        textView = findViewById(R.id.btn_Nepal);
        textView2 = findViewById(R.id.btn_usa);
        textView3 = findViewById(R.id.btn_france);
        textView4 = findViewById(R.id.btn_uk);
        textView5 = findViewById(R.id.btn_dubai);


        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Nepal.class);
                startActivity(intent);
                Toast.makeText(MainActivity.this, "You Clicked Nepal", Toast.LENGTH_SHORT).show();
            }
        });

        textView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, America.class);
                startActivity(intent);
                Toast.makeText(MainActivity.this, "You Clicked America", Toast.LENGTH_SHORT).show();

            }
        });

        textView3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, France.class);
                startActivity(intent);
                Toast.makeText(MainActivity.this, "You Clicked France", Toast.LENGTH_SHORT).show();

            }
        });

        textView4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Uk.class);
                startActivity(intent);
                Toast.makeText(MainActivity.this, "You Clicked Britain", Toast.LENGTH_SHORT).show();

            }
        });

        textView5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Dubai.class);
                startActivity(intent);
                Toast.makeText(MainActivity.this, "You Clicked Dubai", Toast.LENGTH_SHORT).show();

            }
        });
    }
}