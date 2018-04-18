package com.cquereap.android.binaryapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class GoogleActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_google);

        WebView webview = new WebView(this);
        setContentView(webview);
        webview.loadUrl("http://www.geeksforgeeks.org/number-system-and-base-conversions/");

    }
}
