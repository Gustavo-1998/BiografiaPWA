package mx.edu.tesoem.isc.gol.biografia;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebBackForwardList;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        WebView view = (WebView) findViewById(R.id.webView);
        view.getSettings().setJavaScriptEnabled(true);
        view.getSettings().setBuiltInZoomControls(true);
        view.loadUrl("https://biografiagustavo.000webhostapp.com");

        view.setWebViewClient(new WebViewClient(){
            public boolean shouldOverriceUrlLoading(WebView view, String url){
                return false;
            }
        });

    }
}
