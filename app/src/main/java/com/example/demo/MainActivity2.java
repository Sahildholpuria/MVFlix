package com.example.demo;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.khizar1556.mkvideoplayer.MKPlayerActivity;

public class MainActivity2 extends AppCompatActivity {


    private String url = "http://techslides.com/demos/sample-videos/small.mp4";
//    private String url = "https://majorproject.blob.core.windows.net/videos/file_example_MP4_1280_10MG.mp4";

//    private Button playButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

//        playButton = findViewById(R.id.button);

//        playButton.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                MKPlayerActivity.configPlayer(MainActivity2.this).play(url);
//            }
//        });
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        MenuInflater  m = getMenuInflater();
        m.inflate(R.menu.items,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case R.id.live:
                Toast.makeText(this, "Something went wrong", Toast.LENGTH_SHORT).show();
                break;
            case R.id.covid:
                Intent i = new Intent(MainActivity2.this,MainActivity3.class);
                startActivity(i);
                break;
            case R.id.chat:
//                Toast.makeText(this, "All Executive are busy right now contact after some time.", Toast.LENGTH_SHORT).show();
                Intent i1 = new Intent(MainActivity2.this,MainActivity4.class);
                startActivity(i1);
                break;
            case R.id.share:
                Intent sendIntent = new Intent();
                sendIntent.setAction(Intent.ACTION_SEND);
                sendIntent.putExtra(Intent.EXTRA_TEXT, "https://drive.google.com/drive/folders/1ItkgQ6ou1UH5kVJuiPahLw8XdaaqjrbT?usp=sharing");
                sendIntent.setType("text/plain");

                Intent shareIntent = Intent.createChooser(sendIntent, null);
                startActivity(shareIntent);
                break;

            case R.id.about:
                Intent intent = new Intent(MainActivity2.this,about.class);
                startActivity(intent);
                break;
        }
        return super.onOptionsItemSelected(item);
    }

    public void playnow(View view) {
        MKPlayerActivity.configPlayer(MainActivity2.this).play(url);
    }
}