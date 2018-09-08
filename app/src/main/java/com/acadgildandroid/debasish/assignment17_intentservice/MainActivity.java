package com.acadgildandroid.debasish.assignment17_intentservice;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private Button startMusic,stopMusic;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        startMusic=(Button)findViewById(R.id.startmusic);
        stopMusic=(Button)findViewById(R.id.stopmusic);

        startMusic.setOnClickListener(this);
        stopMusic.setOnClickListener(this);
    }
    @Override
     public void onClick(View view){

        if(view==startMusic){
            startService(new Intent(this,IntentMusicService.class));
        }
        else if(view==stopMusic){

            stopService(new Intent(this,IntentMusicService.class));
        }
     }
}

