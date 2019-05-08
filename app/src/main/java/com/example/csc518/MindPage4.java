package com.example.csc518;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MindPage4 extends AppCompatActivity {


    private Button nextPageMP4;
    private TextView zeroTV;
    private TextView oneTV;
    private TextView twoTV;
    private  TextView threeTV;
    private TextView fourTV;
    private TextView fiveTV;
    int placesGone;
    private MindPage4 MindPage4Activity;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mind_page4);

        this.zeroTV = (TextView)(findViewById(R.id.zeroTV));
        this.oneTV = (TextView)(findViewById(R.id.oneTV));
        this.twoTV = (TextView)(findViewById(R.id.twoTV));
        this.threeTV = (TextView)(findViewById(R.id.threeTV));
        this.fourTV = (TextView)(findViewById(R.id.fourTV));
        this.fiveTV = (TextView)(findViewById(R.id.fiveTV));
        this.MindPage4Activity = this;
        this.nextPageMP4 = (Button) (findViewById(R.id.nextPageMP4Button));


    }

    public void onZeroTVPressed(View v)
    {
        zeroTV.setTextColor(Color.RED);
        oneTV.setTextColor(Color.WHITE);
        twoTV.setTextColor(Color.WHITE);
        threeTV.setTextColor(Color.WHITE);
        fourTV.setTextColor(Color.WHITE);
        fiveTV.setTextColor(Color.WHITE);
        placesGone = 0;
        //Toast.makeText(MindPage4Activity, "Try going for a walk or calling up a friend!", Toast.LENGTH_LONG).show();

    }

    public void onOneTVPressed(View v)
    {
        zeroTV.setTextColor(Color.WHITE);
        oneTV.setTextColor(Color.RED);
        twoTV.setTextColor(Color.WHITE);
        threeTV.setTextColor(Color.WHITE);
        fourTV.setTextColor(Color.WHITE);
        fiveTV.setTextColor(Color.WHITE);
        placesGone = 1;
        //Toast.makeText(MindPage4Activity, "Try going for a walk or calling up a friend!", Toast.LENGTH_LONG).show();

    }

    public void onTwoTVPressed(View v)
    {
        zeroTV.setTextColor(Color.WHITE);
        oneTV.setTextColor(Color.WHITE);
        twoTV.setTextColor(Color.RED);
        threeTV.setTextColor(Color.WHITE);
        fourTV.setTextColor(Color.WHITE);
        fiveTV.setTextColor(Color.WHITE);
        placesGone = 2;

    }

    public void onThreeTVPressed(View v)
    {
        zeroTV.setTextColor(Color.WHITE);
        oneTV.setTextColor(Color.WHITE);
        twoTV.setTextColor(Color.WHITE);
        threeTV.setTextColor(Color.RED);
        fourTV.setTextColor(Color.WHITE);
        fiveTV.setTextColor(Color.WHITE);
        placesGone = 3;

    }

    public void onFourTVPressed(View v)
    {
        zeroTV.setTextColor(Color.WHITE);
        oneTV.setTextColor(Color.WHITE);
        twoTV.setTextColor(Color.WHITE);
        threeTV.setTextColor(Color.WHITE);
        fourTV.setTextColor(Color.RED);
        fiveTV.setTextColor(Color.WHITE);
        placesGone = 4;

    }

    public void onFiveTVPressed(View v)
    {
        zeroTV.setTextColor(Color.WHITE);
        oneTV.setTextColor(Color.WHITE);
        twoTV.setTextColor(Color.WHITE);
        threeTV.setTextColor(Color.WHITE);
        fourTV.setTextColor(Color.WHITE);
        fiveTV.setTextColor(Color.RED);
        placesGone = 5;

    }


    public void onNextButtonPressedMP4(View v)
    {
        Intent i = new Intent(this, MindPage5.class);
        startActivity(i);
        if(placesGone < 3)
        {
            Toast.makeText(MindPage4Activity, "Try going for a walk or calling up a friend!", Toast.LENGTH_LONG).show();

        }
        else if (placesGone > 3)
        {
            Toast.makeText(MindPage4Activity, "Make sure you take some time to relax today!", Toast.LENGTH_LONG).show();

        }
        else
        {

        }

    }

}
