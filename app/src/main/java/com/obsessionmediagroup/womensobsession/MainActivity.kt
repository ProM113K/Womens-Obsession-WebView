package com.obsessionmediagroup.womensobsession

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient
import androidx.core.view.WindowInsetsCompat

@SuppressLint("SetJavaScriptEnabled")
class MainActivity : AppCompatActivity() {

    private lateinit var webView: WebView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        webView = findViewById(R.id.wo_webView)

        WindowInsetsCompat.Type.navigationBars()

        webView.webViewClient = WebViewClient()

        webView.loadUrl(WEB_URL)

        webView.settings.javaScriptEnabled = true

        webView.settings.setSupportZoom(true)
    }

    @Deprecated("Deprecated in Java")
    override fun onBackPressed() {
        if (webView.canGoBack()) {
            webView.goBack()
        } else {
            super.onBackPressed()
        }
    }

    companion object {
        private const val WEB_URL = "https://www.womensobsession.com/"
    }
}