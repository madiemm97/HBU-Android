package com.example.csc518;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class NotesPrideActivity extends AppCompatActivity
{
    private EditText thing1, thing2, thing3, thing4, thing5;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notes_pride);

        this.thing1 = (EditText)findViewById(R.id.thing1);
        this.thing2 = (EditText)findViewById(R.id.thing2);
        this.thing3 = (EditText)findViewById(R.id.thing3);
        this.thing4 = (EditText)findViewById(R.id.thing4);
        this.thing5 = (EditText)findViewById(R.id.thing5);

        //populate current fields from information saved in database

        Core.database = FirebaseDatabase.getInstance();
        Core.goalsRef = Core.database.getReference("Notes").child("Things To Be Proud Of").child("abc123");

        Core.goalsRef.addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                // ...
                System.out.println("***" + dataSnapshot);
                DataSnapshot ttbpo = dataSnapshot.child("Things To Be Proud Of");
                for(DataSnapshot ds : ttbpo.getChildren())
                {
                    //break up ds to get your pieces
                    //DataSnapshot { key = abc123, value = {Things To Be Proud Of={abc123={-LeMwtma8vFT1SW7NI75={date=05/08/19, goal=lol}}}} }
                }
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {
                // ...
                System.out.println(databaseError.toString());
            }
        });
    }

    public void onSaveButtonPressed(View v)
    {
        //save to the database

        if(!this.thing1.getText().toString().equals(""))
        {
            Core.listOfNotes.add("What I am proud of: " + thing1.getText().toString());
            GettingCurrentDate date = new GettingCurrentDate();
            String currDate = date.getCurrentDate();
            GoalObject goalObject = new GoalObject(currDate, thing1.getText().toString());
            Core.goalsRef.child("Things To Be Proud Of").child("abc123").push().setValue(goalObject);

        }
        if(!this.thing2.getText().toString().equals(""))
        {
            Core.listOfNotes.add("What I am proud of: " + thing2.getText().toString());
            GettingCurrentDate date = new GettingCurrentDate();
            String currDate = date.getCurrentDate();
            GoalObject goalObject1 = new GoalObject(currDate, thing2.getText().toString());
            Core.goalsRef.child("Things To Be Proud Of").child("abc123").push().setValue(goalObject1);
        }
        if(!this.thing3.getText().toString().equals(""))
        {
            Core.listOfNotes.add("What I am proud of: " + thing3.getText().toString());
            GettingCurrentDate date = new GettingCurrentDate();
            String currDate = date.getCurrentDate();
            GoalObject goalObject2 = new GoalObject(currDate, thing3.getText().toString());
            Core.goalsRef.child("Things To Be Proud Of").child("abc123").push().setValue(goalObject2);
        }
        if(!this.thing4.getText().toString().equals(""))
        {
            Core.listOfNotes.add("What I am proud of: " + thing4.getText().toString());
            GettingCurrentDate date = new GettingCurrentDate();
            String currDate = date.getCurrentDate();
            GoalObject goalObject3 = new GoalObject(currDate, thing4.getText().toString());
            Core.goalsRef.child("Things To Be Proud Of").child("abc123").push().setValue(goalObject3);
        }
        if(!this.thing5.getText().toString().equals(""))
        {
            Core.listOfNotes.add("What I am proud of: " + thing5.getText().toString());
            GettingCurrentDate date = new GettingCurrentDate();
            String currDate = date.getCurrentDate();
            GoalObject goalObject4 = new GoalObject(currDate, thing5.getText().toString());
            Core.goalsRef.child("Things To Be Proud Of").child("abc123").push().setValue(goalObject4);
        }


        Intent i = new Intent(this, NotesPage.class);
        this.startActivity(i);
    }
}
