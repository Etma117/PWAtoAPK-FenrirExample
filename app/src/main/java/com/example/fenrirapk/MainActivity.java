package com.example.fenrirapk;

import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebSettings; // Import for enabling JavaScript

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        WebView webView = findViewById(R.id.webView);

        // Enable JavaScript for the WebView (if needed by your website)
        WebSettings webSettings = webView.getSettings();
        webSettings.setJavaScriptEnabled(true); // Uncomment if necessary

        webView.loadUrl("https://fenrir-master-v2.onrender.com/");
    }
}