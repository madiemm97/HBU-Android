package com.example.csc518;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import java.util.Date;

import com.google.firebase.database.FirebaseDatabase;

public class SleepPage extends AppCompatActivity {

    private Button sleep1;
    private Button sleep2;
    private Button sleep3;
    private Button sleep4;
    private Button sleep5;
    private Button sleep6;
    private Button sleep7;
    private Button sleep8;
    private Button sleep9ormore;
    private int totalSleep;
    private Button submitButton;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sleep_page);

        this.sleep1 = (Button)(findViewById(R.id.sleep1));
        this.sleep2 = (Button)(findViewById(R.id.sleep2));
        this.sleep3 = (Button)(findViewById(R.id.sleep3));
        this.sleep4 = (Button)(findViewById(R.id.sleep4));
        this.sleep5 = (Button)(findViewById(R.id.sleep5));
        this.sleep6 = (Button)(findViewById(R.id.sleep6));
        this.sleep7 = (Button)(findViewById(R.id.sleep7));
        this.sleep8 = (Button)(findViewById(R.id.sleep8));
        this.sleep9ormore = (Button)(findViewById(R.id.sleep9ormore));
        this.submitButton = (Button)(findViewById(R.id.submitButton));

        //Core.sleepDataRef = FirebaseDatabase.getInstance().getReference().child("Sleep").child("UID"); //.child("UID").child("Date").child("Number of Meals");


    }

    public void onSleep1ButtonPressed(View v)
    {
        sleep1.setBackgroundColor(Color.GRAY);

        totalSleep = 1;

    }

    public void onSleep2ButtonPressed(View v)
    {
        sleep2.setBackgroundColor(Color.GRAY);

        totalSleep = 2;
    }

    public void onSleep3ButtonPressed(View v)
    {
        sleep3.setBackgroundColor(Color.GRAY);

        totalSleep = 3;
    }

    public void onSleep4ButtonPressed(View v)
    {
        sleep4.setBackgroundColor(Color.GRAY);

        totalSleep = 4;
    }

    public void onSleep5ButtonPressed(View v)
    {
        sleep5.setBackgroundColor(Color.GRAY);

        totalSleep = 5;
    }

    public void onSleep6ButtonPressed(View v)
    {
        sleep6.setBackgroundColor(Color.GRAY);

        totalSleep = 6;
    }

    public void onSleep7ButtonPressed(View v)
    {
        sleep7.setBackgroundColor(Color.GRAY);

        totalSleep = 7;
    }

    public void onSleep8ButtonPressed(View v)
    {
        sleep8.setBackgroundColor(Color.GRAY);

        totalSleep = 8;
    }

    public void onSleep9ButtonPressed(View v)
    {
        sleep9ormore.setBackgroundColor(Color.GRAY);

        totalSleep = 9;
    }

    public void onSubmitButtonPressed(View v)
    {
        Intent i = new Intent(this, SleepPage2.class);
        System.out.println(totalSleep);
        i.putExtra("totalSleep", totalSleep);

        // This will set the total sleep a person slept to the current date and UID
        //Core.sleepDataRef.child(Core.currentUser.getUid()).push().setValue(totalSleep);

        this.startActivity(i);

    }


}
