package com.example.csc518;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MindPage3 extends AppCompatActivity {

    private TextView tiredTV;
    private TextView stressTV;
    private TextView livelyTV;
    private TextView eagernessTV;
    private TextView fearTV;
    private TextView joyTV;
    private TextView anxiousnessTV;
    int experienceValue;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mind_page3);

        this.tiredTV = (TextView)(findViewById(R.id.tiredTV));
        this.stressTV = (TextView)(findViewById(R.id.stressTV));
        this.livelyTV = (TextView)(findViewById(R.id.livelyTV));
        this.eagernessTV = (TextView)(findViewById(R.id.eagernessTV));
        this.fearTV = (TextView)(findViewById(R.id.fearTV));
        this.joyTV = (TextView)(findViewById(R.id.joyTV));
        this.anxiousnessTV = (TextView)(findViewById(R.id.anxiousnessTV));



    }

    public void tiredTVPressed (View v)
    {

        tiredTV.setTextColor(Color.WHITE);
        experienceValue = 3;

    }

    public void stressTVPressed(View V)
    {
        experienceValue = 3;
        stressTV.setTextColor(Color.WHITE);
    }

    public void livelyTVPressed(View V)
    {
        experienceValue = 0;
        livelyTV.setTextColor(Color.WHITE);
    }

    public void eagernessTVPressed(View V)
    {
        experienceValue = 2;
        eagernessTV.setTextColor(Color.WHITE);
    }

    public void fearTVPressed(View V)
    {
        experienceValue = 4;
        fearTV.setTextColor(Color.WHITE);
    }

    public void joyTVPressed(View V)
    {
        experienceValue = 0;
        joyTV.setTextColor(Color.WHITE);
    }

    public void anxiousnessTVPressed(View V)
    {
        experienceValue = 5;
        anxiousnessTV.setTextColor(Color.WHITE);
    }


    public void onNextButtonPressed(View v)
    {
        Intent i = new Intent(this, MindPage4.class);
        this.startActivity(i);
    }

}
