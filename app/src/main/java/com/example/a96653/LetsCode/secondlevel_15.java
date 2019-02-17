package com.example.a96653.LetsCode;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class secondlevel_15 extends AppCompatActivity {
    MediaPlayer secondlevel_15;
    voice voice15_secondlevel;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_secondlevel_15);

        //create MediaPLayer to play the voice
        secondlevel_15= MediaPlayer.create(secondlevel_15.this,R.raw.secondlevel_15_voice);
        voice15_secondlevel=new voice( secondlevel_15);
        voice15_secondlevel.play();
    }

    @Override
    protected void onPause() {
        super.onPause();
        voice15_secondlevel.pause();
    }

    public void play(View view) {
        voice15_secondlevel.play();
    }//end play method
}
