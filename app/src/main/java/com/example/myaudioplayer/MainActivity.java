package com.example.myaudioplayer;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    MediaPlayer my_Player;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        my_Player = MediaPlayer.create(this,R.raw.piano);


    }

    public void goPlay(View v){
        my_Player.start();
    }
    public void goStop(View v){
        my_Player.stop();
    }
    public void goExit(View v){
        this.finish();
    }
}