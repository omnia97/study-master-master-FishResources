package com.mohamed.mozkra;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class study extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_study);
        WebView webView = (WebView)findViewById(R.id.web);
        webView.loadUrl(getIntent().getExtras().getString("url"));
    }
}
