package com.example.aman2.block5;

import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.RadioGroup;
import android.widget.RelativeLayout;

public class MainActivity extends AppCompatActivity {
    RelativeLayout layout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        layout=(RelativeLayout)findViewById(R.id.layout);
        RadioGroup radioGroup=(RadioGroup)findViewById(R.id.colo);
        final SharedPreferences preferences=getSharedPreferences("color_pref", Context.MODE_PRIVATE);
        final SharedPreferences.Editor editor=preferences.edit();
        if(preferences.contains("colorId"))
            layout.setBackgroundColor(preferences.getInt("colorId",0));
        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                int colorCode=0;
                switch (checkedId) {
                    case (R.id.button_blue):
                        colorCode=Color.BLUE;
                        break;
                    case (R.id.button_magenta):
                        colorCode=Color.MAGENTA;;
                        break;
                    case (R.id.button_yellow):
                        colorCode=Color.YELLOW;
                        break;
                }
                editor.putInt("colorId",colorCode);
                editor.commit();
                layout.setBackgroundColor(colorCode);
            }
        });

    }
}
