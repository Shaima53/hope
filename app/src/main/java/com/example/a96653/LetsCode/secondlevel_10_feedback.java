package com.example.a96653.LetsCode;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

public class secondlevel_10_feedback extends AppCompatActivity {
    MediaPlayer secondlevel_10;
    voice voice10_secondlevel;

    @SuppressLint("ResourceAsColor")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_secondlevel_10_feedback);
        MySQLliteHelper m=new MySQLliteHelper(this);



        //create MediaPLayer to play the voice
        secondlevel_10= MediaPlayer.create(secondlevel_10_feedback.this,R.raw.secondlevel_feedback2);
        voice10_secondlevel=new voice( secondlevel_10);
        voice10_secondlevel.play();


        ///to show result
        TextView ResultBox=(TextView)findViewById(R.id.ResultBox_secondlevel_10);
        ResultBox.setText("X");
        ResultBox.setTextColor(R.color.Shadwo_purple);


        //TO VIEW SCORE ON BOX
        TextView textView = (TextView)findViewById(R.id.ScoreBox_secondlevel_10);
        textView.setText(m.getChildScore()+"" );


        //HOME BUTTON
        ImageButton homebtn3=(ImageButton)findViewById(R.id.homebtn_secondlevel10);
        homebtn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent HomePage=new Intent(getApplicationContext(),MainActivity.class);
                startActivity(HomePage);
            }
        });
        //PREVIOUS BUTTON
        ImageView previous = (ImageView)findViewById(R.id. previous_seconlevel_10);
        previous .setOnClickListener(
                new ImageView.OnClickListener(){
                    public void onClick(View v){

                        openPreviousActivity();
                    }

                }

        );


    }//END onCREATE

    public void openPreviousActivity(){

        Intent intent=new Intent(this,secondlevel_9.class);
        startActivity(intent);

    }

    @Override
    protected void onPause() {
        super.onPause();
        voice10_secondlevel.pause();
    }

    public void play(View view) {
        voice10_secondlevel.play();
    }//end play method


}

