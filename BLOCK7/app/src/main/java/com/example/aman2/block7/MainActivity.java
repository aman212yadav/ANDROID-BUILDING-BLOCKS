package com.example.aman2.block7;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.NumberPicker;

public class MainActivity extends AppCompatActivity {
    NumberPicker numberPicker;
    WebView webView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        String[] possibilities={"UDEMY","COURSERA","UDACITY","CODECHEF"};
        numberPicker=(NumberPicker)findViewById(R.id.numberPicker);
        webView=(WebView)findViewById(R.id.webView);
        numberPicker.setDisplayedValues(possibilities);
        numberPicker.setMinValue(0);
        numberPicker.setMaxValue(possibilities.length-1);

    }
    public void navigate(View v){
        int choice=numberPicker.getValue();
        webView.setWebViewClient(new WebViewClient());
        if(choice==0)
        {
            webView.loadUrl("https://www.udemy.com");
        }
        else if(choice==1)
        {
            webView.loadUrl("https://www.coursera.org");
        }
        else if(choice==2)
        {
            webView.loadUrl("https://www.udacity.com");
        }
        else if(choice==3)
        {
            webView.loadUrl("https://www.codechef.com");
        }

    }
}
