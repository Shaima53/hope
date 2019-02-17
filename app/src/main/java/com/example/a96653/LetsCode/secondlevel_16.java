package com.example.a96653.LetsCode;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class secondlevel_16 extends AppCompatActivity {
    MediaPlayer secondlevel_16;
    voice voice16_secondlevel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_secondlevel_16);
        //create MediaPLayer to play the voice
        secondlevel_16= MediaPlayer.create(secondlevel_16.this,R.raw.secondlevel_16_voice);
        voice16_secondlevel=new voice( secondlevel_16);
        voice16_secondlevel.play();
    }


    @Override
    protected void onPause() {
        super.onPause();
        voice16_secondlevel.pause();
    }

    public void play(View view) {
        voice16_secondlevel.play();
    }//end play method
}
