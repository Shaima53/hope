package com.example.a96653.LetsCode;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

public class secondlevel_17 extends AppCompatActivity {
    MySQLliteHelper mySqliteOpenHelper;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_secondlevel_17);
        mySqliteOpenHelper=new MySQLliteHelper(this);
        //TO VIEW SCORE ON BOX
        TextView textView = (TextView)findViewById(R.id.scoreBox_secondleve_l7);
        textView.setText(mySqliteOpenHelper.getChildScore()+"" );

        ////
        SharedPreferences prefs = getSharedPreferences("prefs26", MODE_PRIVATE);
        boolean firstStart = prefs.getBoolean("firstStart", true);
        if (firstStart){
            //m.addLesson(l2);
            mySqliteOpenHelper.addQuestion(2);
            mySqliteOpenHelper.addQuestion(2);
            mySqliteOpenHelper.addQuestion(2);
            mySqliteOpenHelper.addQuestion(2);
            mySqliteOpenHelper.addQuestion(2);
            SharedPreferences pref = getSharedPreferences("prefs26", MODE_PRIVATE);
            SharedPreferences.Editor editor = prefs.edit();
            editor.putBoolean("firstStart", false);
            editor.apply();
        }

        ////



        //HOME BUTTON
        ImageButton homebtn3=(ImageButton)findViewById(R.id.homebtn_secondlevel7);
        homebtn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent HomePage=new Intent(getApplicationContext(),MainActivity.class);
                startActivity(HomePage);

            }
        });






    }



    public void previous(View view) {
        Intent gonext=new Intent(getApplicationContext(),secondlevel_16.class);
        startActivity(gonext);
    }
}
