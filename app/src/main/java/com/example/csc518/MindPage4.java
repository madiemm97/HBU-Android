package com.example.csc518;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MindPage4 extends AppCompatActivity {

    private TextView zeroTV;
    private TextView oneTV;
    private TextView twoTV;
    private  TextView threeTV;
    private TextView fourTV;
    private TextView fiveTV;
    int placesGone;


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


    }

    public void onZeroTVPressed(View v)
    {
        zeroTV.setTextColor(Color.LTGRAY);
        oneTV.setTextColor(Color.WHITE);
        twoTV.setTextColor(Color.WHITE);
        threeTV.setTextColor(Color.WHITE);
        fourTV.setTextColor(Color.WHITE);
        fiveTV.setTextColor(Color.WHITE);
        placesGone = 5;

    }

    public void onOneTVPressed(View v)
    {
        zeroTV.setTextColor(Color.WHITE);
        oneTV.setTextColor(Color.LTGRAY);
        twoTV.setTextColor(Color.WHITE);
        threeTV.setTextColor(Color.WHITE);
        fourTV.setTextColor(Color.WHITE);
        fiveTV.setTextColor(Color.WHITE);
        placesGone = 4;

    }

    public void onTwoTVPressed(View v)
    {
        zeroTV.setTextColor(Color.WHITE);
        oneTV.setTextColor(Color.WHITE);
        twoTV.setTextColor(Color.LTGRAY);
        threeTV.setTextColor(Color.WHITE);
        fourTV.setTextColor(Color.WHITE);
        fiveTV.setTextColor(Color.WHITE);
        placesGone = 3;

    }

    public void onThreeTVPressed(View v)
    {
        zeroTV.setTextColor(Color.WHITE);
        oneTV.setTextColor(Color.WHITE);
        twoTV.setTextColor(Color.WHITE);
        threeTV.setTextColor(Color.LTGRAY);
        fourTV.setTextColor(Color.WHITE);
        fiveTV.setTextColor(Color.WHITE);
        placesGone = 1;

    }

    public void onFourTVPressed(View v)
    {
        zeroTV.setTextColor(Color.WHITE);
        oneTV.setTextColor(Color.WHITE);
        twoTV.setTextColor(Color.WHITE);
        threeTV.setTextColor(Color.WHITE);
        fourTV.setTextColor(Color.LTGRAY);
        fiveTV.setTextColor(Color.WHITE);
        placesGone = 0;

    }

    public void onFiveTVPressed(View v)
    {
        zeroTV.setTextColor(Color.WHITE);
        oneTV.setTextColor(Color.WHITE);
        twoTV.setTextColor(Color.WHITE);
        threeTV.setTextColor(Color.WHITE);
        fourTV.setTextColor(Color.WHITE);
        fiveTV.setTextColor(Color.LTGRAY);
        placesGone = 0;

    }

}
