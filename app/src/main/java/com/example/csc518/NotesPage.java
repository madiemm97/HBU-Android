package com.example.csc518;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class NotesPage extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notes_page);
    }

    public void onMindfulnessButtonPressed(View v)
    {
        Intent i = new Intent(this, NotesMindfulnessActivity.class);
        this.startActivity(i);
    }

    public void onPrideButtonPressed(View v)
    {
        Intent i = new Intent(this, NotesPrideActivity.class);
        this.startActivity(i);
    }

    public void onImproveButtonPressed(View v)
    {
        Intent i = new Intent(this, NotesImproveActivity.class);
        this.startActivity(i);
    }

    public void onGoalsButtonPressed(View v)
    {
        Intent i = new Intent(this, NotesGoalsActivity.class);
        this.startActivity(i);
    }

    public void onGratitudeButtonPressed(View v)
    {
        Intent i = new Intent(this, NotesGratitudeActivity.class);
        this.startActivity(i);
    }

    public void onRandomButtonPressed(View v)
    {
        Intent i = new Intent(this, NotesRandomActivity.class);
        this.startActivity(i);
    }
}
