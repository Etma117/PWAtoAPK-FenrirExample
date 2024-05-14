package com.example.fenrirapk;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebSettings; // Import for enabling JavaScript
import android.webkit.WebViewClient;

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
        webView.setWebViewClient(new WebViewClient() {
            @Override
            public boolean shouldOverrideUrlLoading(WebView view, String url) {
                // Check if the URL belongs to your PWA domain
                if (url.startsWith("https://fenrir-master-v2.onrender.com/")) {
                    // Load the URL within the WebView
                    view.loadUrl(url);
                    return true; // Return true to prevent opening in the browser
                } else {
                    // Open the URL in the external browser
                    Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                    startActivity(intent);
                    return false; // Return false to allow opening in the browser
                }
            }
        });
        webView.loadUrl("https://fenrir-master-v2.onrender.com/");
    }
}

