package com.example.csc518;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MindPage2 extends AppCompatActivity {

    private Button happyButton;
    private Button pleasedButton;
    private Button indifferentButton;
    private Button terribleButton;
    private Button worstdayeverButton;
    private Button nextButton;
    int todayFeelingValue = 0;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mind_page);


        this.happyButton = (Button)(findViewById(R.id.happyButton));
        this.pleasedButton = (Button)(findViewById(R.id.pleasedButton));
        this.indifferentButton = (Button)(findViewById(R.id.indifferentButton));
        this.terribleButton = (Button)(findViewById(R.id.terribleButton));
        this.worstdayeverButton = (Button)(findViewById(R.id.worstdayeverButton));
        this.nextButton = (Button)(findViewById(R.id.nextButton1));



    }

    public void onNextButtonPressed (View v)
    {
        Intent i = new Intent(this, MealsPage3.class);
        this.startActivity(i);
        System.out.println(todayFeelingValue);
    }


    public void onHappyButtonPressed (View v)
    {
        todayFeelingValue = 0;
    }

    public void onPleasedButtonPressed (View v)
    {
        todayFeelingValue = 1;
    }

    public void onIndifferentButton (View v)
    {
        todayFeelingValue = 2;
    }

    public void onTerribleButton (View v)
    {
        todayFeelingValue = 3;
    }

    public void onWorstDayEverButton (View v)
    {
        todayFeelingValue = 4;
    }

}
