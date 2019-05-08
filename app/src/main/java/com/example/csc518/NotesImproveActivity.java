package com.example.csc518;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import com.google.firebase.database.FirebaseDatabase;

public class NotesImproveActivity extends AppCompatActivity
{
    private EditText thing1, thing2, thing3, thing4, thing5;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notes_improve);

        this.thing1 = (EditText)findViewById(R.id.thing1);
        this.thing2 = (EditText)findViewById(R.id.thing2);
        this.thing3 = (EditText)findViewById(R.id.thing3);
        this.thing4 = (EditText)findViewById(R.id.thing4);
        this.thing5 = (EditText)findViewById(R.id.thing5);

        Core.database = FirebaseDatabase.getInstance();
        Core.improvementsRef = FirebaseDatabase.getInstance().getReference("Notes");

        //populate current fields from information saved in database

    }

    public void onSaveButtonPressed(View v)
    {
        //save to the database
        if(!this.thing1.equals(""))
        {
            Core.listOfNotes.add("What I am want to improve on: " + thing1.getText().toString());
            Core.listOfImprovements.add("What I am want to improve on: " + thing1.getText().toString());
            GettingCurrentDate date = new GettingCurrentDate();
            String currDate = date.getCurrentDate();
            GoalObject goalObject = new GoalObject(currDate, thing1.getText().toString());
            Core.improvementsRef.child("What I am want to improve on").child("abc123").push().setValue(goalObject);
        }
        if(!this.thing2.equals(""))
        {
            Core.listOfNotes.add("What I am want to improve on: " + thing2.getText().toString());
            Core.listOfImprovements.add("What I am want to improve on: " + thing1.getText().toString());
            GettingCurrentDate date = new GettingCurrentDate();
            String currDate = date.getCurrentDate();
            GoalObject goalObject = new GoalObject(currDate, thing2.getText().toString());
            Core.improvementsRef.child("What I am want to improve on").child("abc123").push().setValue(goalObject);
        }
        if(!this.thing3.equals(""))
        {
            Core.listOfNotes.add("What I am want to improve on: " + thing3.getText().toString());
            Core.listOfImprovements.add("What I am want to improve on: " + thing1.getText().toString());
            GettingCurrentDate date = new GettingCurrentDate();
            String currDate = date.getCurrentDate();
            GoalObject goalObject = new GoalObject(currDate, thing3.getText().toString());
            Core.improvementsRef.child("What I am want to improve on").child("abc123").push().setValue(goalObject);
        }
        if(!this.thing4.equals(""))
        {
            Core.listOfNotes.add("What I am want to improve on: " + thing4.getText().toString());
            Core.listOfImprovements.add("What I am want to improve on: " + thing1.getText().toString());
            GettingCurrentDate date = new GettingCurrentDate();
            String currDate = date.getCurrentDate();
            GoalObject goalObject = new GoalObject(currDate, thing4.getText().toString());
            Core.improvementsRef.child("What I am want to improve on").child("abc123").push().setValue(goalObject);
        }
        if(!this.thing5.equals(""))
        {
            Core.listOfNotes.add("What I am want to improve on: " + thing5.getText().toString());
            Core.listOfImprovements.add("What I am want to improve on: " + thing5.getText().toString());
            GettingCurrentDate date = new GettingCurrentDate();
            String currDate = date.getCurrentDate();
            GoalObject goalObject = new GoalObject(currDate, thing1.getText().toString());
            Core.improvementsRef.child("What I am want to improve on").child("abc123").push().setValue(goalObject);
        }

        Intent i = new Intent(this, NotesPage.class);
        this.startActivity(i);
    }
}
