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
<<<<<<< HEAD
        final String antResult = getIntent().getStringExtra("ENTER");

=======
        final String antResult = getIntent().getStringExtra("ANT");
>>>>>>> b7c9b8ef2a4dfb0d5e44806e87c9cc52eb91ba79

        browser = (WebView)findViewById(R.id.webView);
        browser.setWebContentsDebuggingEnabled(true);
        browser.setWebChromeClient(new WebChromeClient());
        WebSettings webView = browser.getSettings();
        webView.setJavaScriptEnabled(true);
        webView.setAllowUniversalAccessFromFileURLs(true);
        webView.setDomStorageEnabled(true);
        //browser.setWebViewClient(new WebViewClient() {public void onPageFinished(WebView view, String url) {browser.evaluateJavascript("getAnt('"+antResult+"')",null);}
        //});
<<<<<<< HEAD
        //if(antResult.equals("website")){
            browser.loadUrl("https://antclassifier.herokuapp.com/#"); // for enter site
        //}
        //else {
          //  browser.loadUrl("https://antclassifier.herokuapp.com/about.html");
        //}
        // // for about button
=======
        browser.loadUrl("https://antclassifier.herokuapp.com/#"); // for enter site
        browser.loadUrl("https://antclassifier.herokuapp.com/about.html"); // for about button
>>>>>>> b7c9b8ef2a4dfb0d5e44806e87c9cc52eb91ba79
    }
}
