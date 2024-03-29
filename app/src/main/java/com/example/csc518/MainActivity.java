package com.example.csc518;

import android.app.ActionBar;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity
{



    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_main);

    }

    public void onMealsButtonPressed(View v)
    {
        Intent i = new Intent(this, MealsPage.class);
        this.startActivity(i);
    }

    public void onSleepButtonPressed(View v)
    {
        Intent i = new Intent(this, SleepPage.class);
        this.startActivity(i);
    }

    public void onNotesButtonPressed(View v)
    {
        Intent i = new Intent(this, NotesPage.class);
        this.startActivity(i);
    }

    public void onMedsButtonPressed(View v)
    {
        Intent i = new Intent(this, MedsPage.class);
        this.startActivity(i);
    }

    public void onMindButtonPressed(View v)
    {
        Intent i = new Intent(this, MindPage.class);
        this.startActivity(i);
    }

    public void onSettingsButtonPressed(View v)
    {
        Intent i = new Intent(this, Settings.class);
        this.startActivity(i);
    }

    public void onInformationButtonPressed(View v)
    {
        Intent i = new Intent(this, Information.class);
        this.startActivity(i);
    }

    public void onHotlineButtonPressed(View v)
    {
        Intent i = new Intent(this, Hotline.class);
        this.startActivity(i);
    }
}
