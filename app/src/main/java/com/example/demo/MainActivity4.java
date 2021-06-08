package com.example.demo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;

public class MainActivity4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);


        String summary = "<html><body><div class=\"chat\">\n" +
                "      <iframe\n" +
                "      src='https://webchat.botframework.com/embed/propro12?s=xGfRhE0Igu4.RNwNy8meJ4XLSxg2RHbUuP32QKF06wyuU482hhz9XYc' \n" +
                "        style=\"\n" +
                "        margin-left: 25%;\n" +
                "        margin-top: 8%;\n" +
                "          min-width: 300px;\n" +
                "          width: 50%;\n" +
                "          min-height: 500px;\"\n" +
                "      ></iframe>\n" +
                "    </div></body></html>";

        WebView webView = findViewById(R.id.webView);
//        webView.loadUrl("https://sahildholpuria.tech");
        webView.loadData(summary, "text/html", null);
    }
}