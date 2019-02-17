package com.example.a96653.LetsCode;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

public class secondlevel_5 extends AppCompatActivity {
    MediaPlayer secondlevel_5_voice;
    voice voice5_secondlevel;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_secondlevel_5);

        final MySQLliteHelper m=new MySQLliteHelper(this);


        //create MediaPLayer to play the voice
        secondlevel_5_voice= MediaPlayer.create(secondlevel_5.this,R.raw.secondlevel_5_voice);
        voice5_secondlevel=new voice( secondlevel_5_voice);
        voice5_secondlevel.play();





        //scoreBox display
        TextView scoredisplay=(TextView) findViewById(R.id.scoreBox_firstlevel5);
        scoredisplay.setText(m.getChildScore()+"" );

        ImageButton homebtn12=(ImageButton)findViewById(R.id.homebtn12);

        homebtn12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent gohome=new Intent (getApplicationContext(),MainActivity.class);
                startActivity(gohome);
            }
        });


        ImageView previous6=(ImageView) findViewById(R.id.previous6);
        previous6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                GoToprevious();
            }
        });


        ImageView next6=(ImageView)findViewById(R.id.next6);
        next6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                GoNext();

            }
        });


    }
    public void  GoNext(){
        Intent gonext=new Intent(getApplicationContext(),secondlevel_6.class);
        startActivity(gonext);
    }


    public void GoToprevious (){
        Intent goback=new Intent(getApplicationContext(),secondlevel_4.class);
        startActivity(goback);
    }


    @Override
    protected void onPause() {
        super.onPause();
        voice5_secondlevel.pause();
    }

    public void play(View view) {
        voice5_secondlevel.play();
    }//end play method
}
////
