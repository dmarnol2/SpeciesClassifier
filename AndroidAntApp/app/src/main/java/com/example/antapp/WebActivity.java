package com.example.antapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class WebActivity extends AppCompatActivity {
    private WebView browser;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web);
        final Bundle antResult = getIntent().getExtras();//("ENTER");

        browser = (WebView)findViewById(R.id.webView);
        browser.setWebContentsDebuggingEnabled(true);
        browser.setWebChromeClient(new WebChromeClient());
        WebSettings webView = browser.getSettings();
        webView.setJavaScriptEnabled(true);
        webView.setAllowUniversalAccessFromFileURLs(true);
        webView.setDomStorageEnabled(true);

        browser.loadUrl("https://antclassifier.herokuapp.com/#"); // for enter site
        }
}

