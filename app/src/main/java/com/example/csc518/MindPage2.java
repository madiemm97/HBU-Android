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
    private ArrayList<String> todayFeelings = new ArrayList();
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

        System.out.println(todayFeelings);
        if(happy == 1)
        {
            todayFeelings.add("happy");
            System.out.println(todayFeelings);
        }

        Intent i = new Intent(this, MindPage3.class);
        this.startActivity(i);
    }


    public void onHappyButtonPressed (View v)
    {

       happy =+1;

       happyButton.setTextColor(Color.RED);
        pleasedButton.setTextColor(Color.BLACK);
        terribleButton.setTextColor(Color.BLACK);
        indifferentButton.setTextColor(Color.BLACK);
        notGreatButton.setTextColor(Color.BLACK);
        worstdayeverButton.setTextColor(Color.BLACK);

    }

    public void onPleasedButtonPressed (View v)
    {
        pleasedButton.setTextColor(Color.RED);
        terribleButton.setTextColor(Color.BLACK);
        indifferentButton.setTextColor(Color.BLACK);
        notGreatButton.setTextColor(Color.BLACK);
        worstdayeverButton.setTextColor(Color.BLACK);
        happyButton.setTextColor(Color.BLACK);



        //todayFeelingValue = 1;


    }

    public void onIndifferentButton (View v)
    {
        //todayFeelingValue = 2;
        pleasedButton.setTextColor(Color.BLACK);
        terribleButton.setTextColor(Color.BLACK);
        indifferentButton.setTextColor(Color.RED);
        notGreatButton.setTextColor(Color.BLACK);
        worstdayeverButton.setTextColor(Color.BLACK);
        happyButton.setTextColor(Color.BLACK);

    }

    public void onTerribleButton (View v)
    {
        //todayFeelingValue = 3;
        pleasedButton.setTextColor(Color.BLACK);
        terribleButton.setTextColor(Color.RED);
        indifferentButton.setTextColor(Color.BLACK);
        notGreatButton.setTextColor(Color.BLACK);
        worstdayeverButton.setTextColor(Color.BLACK);
        happyButton.setTextColor(Color.BLACK);

    }

    public void onNotGreatButton (View v)
    {
        //todayFeelingValue = 3;
        pleasedButton.setTextColor(Color.BLACK);
        terribleButton.setTextColor(Color.BLACK);
        indifferentButton.setTextColor(Color.BLACK);
        notGreatButton.setTextColor(Color.RED);
        worstdayeverButton.setTextColor(Color.BLACK);
        happyButton.setTextColor(Color.BLACK);

    }

    public void onWorstDayEverButton (View v)
    {
        //todayFeelingValue = 4;
        pleasedButton.setTextColor(Color.BLACK);
        terribleButton.setTextColor(Color.BLACK);
        indifferentButton.setTextColor(Color.BLACK);
        notGreatButton.setTextColor(Color.BLACK);
        worstdayeverButton.setTextColor(Color.RED);
        happyButton.setTextColor(Color.BLACK);

    }



}
