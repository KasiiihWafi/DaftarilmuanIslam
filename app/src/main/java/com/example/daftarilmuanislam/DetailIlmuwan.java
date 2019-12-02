package com.example.daftarilmuanislam;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class DetailIlmuwan extends AppCompatActivity {

    WebView web;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_ilmuwan);

        web = findViewById(R.id.web);

        Intent intent = getIntent();
        String nama = intent.getStringExtra("putnama");
        String url  = intent.getStringExtra("puturl");

        getSupportActionBar().setTitle("Bio " + nama);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);


        WebView webView = findViewById(R.id.web);
        webView.setScrollBarStyle(View.SCROLLBARS_INSIDE_OVERLAY);
        webView.setWebViewClient(new WebViewClient());
        webView.loadUrl(url);

    }



}
