package com.example.aman2.block4;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.Switch;

public class MainActivity extends AppCompatActivity {
    MediaPlayer mMediaPlayer;
    Switch looping;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mMediaPlayer=MediaPlayer.create(this,R.raw.sleep);
        looping =(Switch)findViewById(R.id.looping);
        looping.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                mMediaPlayer.setLooping(isChecked);
            }
        });
    }
    public void onPlay(View v)
    {
        mMediaPlayer.start();
    }
    public void onPause(View v)
    {
        if(mMediaPlayer.isPlaying())
            mMediaPlayer.pause();
    }
}
