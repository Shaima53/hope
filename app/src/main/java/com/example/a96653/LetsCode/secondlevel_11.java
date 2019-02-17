package com.example.a96653.LetsCode;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

public class secondlevel_11 extends AppCompatActivity {
    MediaPlayer secondlevel_11;
    voice voice11_secondlevel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_secondlevel_11);
        MySQLliteHelper m=new MySQLliteHelper(this);
        //create MediaPLayer to play the voice
        secondlevel_11= MediaPlayer.create(secondlevel_11.this,R.raw.secondlevel_6_voic);
        voice11_secondlevel=new voice( secondlevel_11);
        voice11_secondlevel.play();

        //TO VIEW SCORE ON BOX
        TextView textView = (TextView)findViewById(R.id.ScoreBox_secondlevel_11);
        textView.setText(m.getChildScore()+"" );


        //HOME BUTTON
        ImageButton homebtn3=(ImageButton)findViewById(R.id.homebtn_secondlevel11);
        homebtn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent HomePage=new Intent(getApplicationContext(),MainActivity.class);
                startActivity(HomePage);
            }
        });
        //PREVIOUS BUTTON
        ImageView previous = (ImageView)findViewById(R.id. previous_seconlevel_11);
        previous .setOnClickListener(
                new ImageView.OnClickListener(){
                    public void onClick(View v){

                        openPreviousActivity();
                    }

                }

        );


    }//END onCREATE

    public void openPreviousActivity(){

        Intent intent=new Intent(this,secondlevel_10_feedback.class);
        startActivity(intent);

    }
    @Override
    protected void onPause() {
        super.onPause();
        voice11_secondlevel.pause();
    }

    public void play(View view) {
        voice11_secondlevel.play();
    }//end play method


}

