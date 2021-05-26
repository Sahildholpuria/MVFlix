package com.example.demo;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import com.khizar1556.mkvideoplayer.MKPlayerActivity;

public class MainActivity2 extends AppCompatActivity {


    private String url = "https://majorproject01.s3.ap-south-1.amazonaws.com/BigBuckBunny.mp4";
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
            case R.id.share:
                Intent sendIntent = new Intent();
                sendIntent.setAction(Intent.ACTION_SEND);
                sendIntent.putExtra(Intent.EXTRA_TEXT, "https://sahildholpuria.tech");
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