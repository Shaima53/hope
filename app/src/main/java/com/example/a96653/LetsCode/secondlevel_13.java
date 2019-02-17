package com.example.a96653.LetsCode;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;


public class secondlevel_13 extends AppCompatActivity {
    MediaPlayer secondlevel_13;
    voice voice13_secondlevel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_secondlevel_13);

        //create MediaPLayer to play the voice
        secondlevel_13= MediaPlayer.create(secondlevel_13.this,R.raw.secondlevel_exercise_feedback);
        voice13_secondlevel=new voice( secondlevel_13);
        voice13_secondlevel.play();

    }

    @Override
    protected void onPause() {
        super.onPause();
        voice13_secondlevel.pause();
    }

    public void play(View view) {
        voice13_secondlevel.play();
    }//end play method
}
