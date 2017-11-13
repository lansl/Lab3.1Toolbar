package my.edu.taruc.lab31toolbar;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class AboutActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);

        WebView webViewAbout1 = (WebView)findViewById(R.id.webViewAbout);
        //TODO: Set web address to the webView

        webViewAbout1.loadUrl("https://www.google.com");
    }
}
