package com.example.aman2.block1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button pink,blue;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        pink=(Button)findViewById(R.id.pink_toast);
        blue=(Button)findViewById(R.id.blue_invisible);
        pink.setOnClickListener(this);
        blue.setOnClickListener(this);
    }
    //this method is called when any of the button(BLUE OR PINK) is pressed
    public void toDo(View v){
        if(v.equals(pink))                                                       //checking whether Pink button is pressed or Blue
        {
            Toast.makeText(getApplicationContext(),"to do to do to do",Toast.LENGTH_SHORT).show();
        }
        else{
            blue.setVisibility(View.INVISIBLE);                            //Setting Visibility of blue button equal to Invisible
        }
    }

    @Override
    public void onClick(View v) {
        toDo(v);
    }
}
