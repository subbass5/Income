package com.kritsana_dev.income

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebChromeClient
import android.webkit.WebView
import android.webkit.WebViewClient
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportActionBar?.hide()

    }

    override fun onResume() {
        super.onResume()
        webview.webViewClient = WebViewClient()
        webview.settings.javaScriptEnabled = true
        webview.loadUrl("file:///android_asset/index.html")
    }
}