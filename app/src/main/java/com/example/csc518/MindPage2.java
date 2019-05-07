package com.example.csc518;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;

public class MindPage2 extends AppCompatActivity {

    private Button happyButton;
    private Button pleasedButton;
    private Button indifferentButton;
    private Button terribleButton;
    private Button worstdayeverButton;
    private Button nextButton;
    private Button notGreatButton;
    private ArrayList todayFeelings;
    int happy;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mind_page2);


        this.happyButton = (Button)(findViewById(R.id.happyButton));
        this.pleasedButton = (Button)(findViewById(R.id.pleasedButton));
        this.indifferentButton = (Button)(findViewById(R.id.indifferentButton));
        this.terribleButton = (Button)(findViewById(R.id.terribleButton));
        this.worstdayeverButton = (Button)(findViewById(R.id.worstdayeverButton));
        this.notGreatButton = (Button)(findViewById(R.id.notgreatButton));
        this.nextButton = (Button)(findViewById(R.id.nextButton1));



    }

    public void onNextButtonPressed (View v)
    {
        Intent i = new Intent(this, MindPage3.class);
        this.startActivity(i);
        System.out.println(todayFeelings);
        if(happy == 1)
        {
            todayFeelings.add("happy");
            System.out.println(todayFeelings);
        }
    }


    public void onHappyButtonPressed (View v)
    {

       happy =+1;

       happyButton.setTextColor(Color.RED);


    }

    public void onPleasedButtonPressed (View v)
    {
        pleasedButton.setTextColor(Color.RED);
        //todayFeelingValue = 1;


    }

    public void onIndifferentButton (View v)
    {
        //todayFeelingValue = 2;
        indifferentButton.setTextColor(Color.RED);
    }

    public void onTerribleButton (View v)
    {
        //todayFeelingValue = 3;
    }

    public void onNotGreatButton (View v)
    {
        //todayFeelingValue = 3;
    }

    public void onWorstDayEverButton (View v)
    {
        //todayFeelingValue = 4;
    }



}
