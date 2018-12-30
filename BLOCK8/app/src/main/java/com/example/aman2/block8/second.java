package com.example.aman2.block8;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import java.util.zip.Inflater;

public class second extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        Intent intent=getIntent();
        double rating=intent.getDoubleExtra("Rating",0);
        String m="you selected "+rating+" rating";
        TextView message=(TextView)findViewById(R.id.message);
        message.setText(m);
    }
}
