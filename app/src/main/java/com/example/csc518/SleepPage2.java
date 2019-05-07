package com.example.csc518;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.CheckBox;

import com.google.firebase.database.FirebaseDatabase;

import java.util.ArrayList;
import java.util.Date;

public class SleepPage2 extends AppCompatActivity
{
    public CheckBox napped, feltTired, sleptThroughClass, feltEnergized, wantedToGoBackToSleep, neededCoffee, wokeUpBeforeAlarm;
    ArrayList<String> howTheyFelt;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sleep_page2);

        this.napped = (CheckBox)findViewById(R.id.checkBox7);
        this.feltTired = (CheckBox)findViewById(R.id.checkBox8);
        this.sleptThroughClass = (CheckBox)findViewById(R.id.checkBox9);
        this.feltEnergized = (CheckBox)findViewById(R.id.checkBox11);
        this.wantedToGoBackToSleep = (CheckBox)findViewById(R.id.checkBox12);
        this.neededCoffee = (CheckBox)findViewById(R.id.checkBox13);
        this.wokeUpBeforeAlarm = (CheckBox)findViewById(R.id.checkBox14);

        this.howTheyFelt = new ArrayList<>();

        Core.sleepDataRef = FirebaseDatabase.getInstance().getReference().child("Sleep");
    }

    public void onNextButtonPressed(View v)
    {
        Intent i = new Intent(this, MainActivity.class);

        GettingCurrentDate date = new GettingCurrentDate();
        String currentDate = date.getCurrentDate();

        this.howTheyFelt.clear();

        if(napped.isChecked())
        {
            this.howTheyFelt.add("Napped");
        }
        if(feltTired.isChecked())
        {
            this.howTheyFelt.add("Felt Tired");
        }
        if(sleptThroughClass.isChecked())
        {
            this.howTheyFelt.add("Slept through class");
        }
        if(feltEnergized.isChecked())
        {
            this.howTheyFelt.add("Felt energized");
        }
        if(wantedToGoBackToSleep.isChecked())
        {
            this.howTheyFelt.add("Wanted to go back to sleep");
        }
        if(wokeUpBeforeAlarm.isChecked())
        {
            this.howTheyFelt.add("Woke up before alarm clock");
        }

        int hoursSlept = getIntent().getExtras().getInt("totalSleep");
        //String hoursSlept = i.getStringExtra("totalSleep");

        SleepObject sleepObject = new SleepObject(currentDate, hoursSlept, howTheyFelt);

        //save to the database
        //Core.sleepDataRef.push().setValue(sleepObject);

        //change abc123 to be Core.currentUser.getUID().push().setValue(sleepObject);
        Core.sleepDataRef.child("abc123").push().setValue(sleepObject);

        this.startActivity(i);
    }
}
