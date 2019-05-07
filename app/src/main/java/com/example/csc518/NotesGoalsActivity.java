package com.example.csc518;

import android.content.Intent;
import android.database.DataSetObserver;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListAdapter;
import android.widget.ListView;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.ArrayList;
import java.util.List;

import static com.example.csc518.Core.database;

public class NotesGoalsActivity extends AppCompatActivity
{
    private EditText goalET;
    private Button addButton;
    private ListView goalLV;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notes_goals);



        this.goalET = (EditText)findViewById(R.id.goalET);
        this.addButton = (Button)findViewById(R.id.addGoalButton);
        this.goalLV = (ListView)findViewById(R.id.goalsLV);

        Core.database = FirebaseDatabase.getInstance();
        DatabaseReference goalsRef = Core.database.getReference("Notes");


        this.goalLV.setClickable(true);
        this.goalLV.setOnItemClickListener(new AdapterView.OnItemClickListener()
        {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long row_id)
            {
                String temp = Core.listOfGoals.get(position);
                Core.listOfGoals.remove(temp);
                goalLV.invalidateViews();
                //remember to remove from database
            }
        });
    }

    public void onAddGoalButtonPressed(View v)
    {
        String goal = this.goalET.getText().toString();

        Core.listOfGoals.add(goal);
        Core.listOfNotes.add(goal);

        GettingCurrentDate date = new GettingCurrentDate();
        String currDate = date.getCurrentDate();

        GoalObject goalObject = new GoalObject(currDate, goal);

        DatabaseReference goalsRef = Core.database.getReference("Notes");
        Core.goalsRef.child("Goals").child("abc123").push().setValue(goalObject);


        // This is the array adapter, it takes the context of the activity as a
        // first parameter, the type of list view as a second parameter and your
        // array as a third parameter.
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(
                this,
                android.R.layout.simple_list_item_1,
                Core.listOfGoals );

        goalLV.setAdapter(arrayAdapter);
        this.goalET.setText("");

    }
}
