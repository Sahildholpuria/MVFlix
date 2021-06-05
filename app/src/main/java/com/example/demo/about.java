package com.example.demo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.widget.TextView;

public class about extends AppCompatActivity {

    private TextView textView;

    private String URL = "https://sahildholpuria.tech";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);

        textView = findViewById(R.id.textView8);

//        getSupportActionBar().hide();


        textView.setOnClickListener(v ->{
            Intent url = new Intent(Intent.ACTION_VIEW);
            url.setData(Uri.parse(URL));
            startActivity(url);
        });

    }
}