package com.example.demo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity3 extends AppCompatActivity {

    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        textView = findViewById(R.id.textView14);

        getSupportActionBar().hide();


        textView.setOnClickListener(v ->{

            Intent implicit = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.mohfw.gov.in"));
            startActivity(implicit);

        });
    }
}