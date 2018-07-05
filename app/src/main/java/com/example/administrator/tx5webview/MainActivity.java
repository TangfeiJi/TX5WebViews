package com.example.administrator.tx5webview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        X5WebView webView=findViewById(R.id.webView);
        webView.loadUrl("http://192.168.1.120:8888/index.html");
    }
}
