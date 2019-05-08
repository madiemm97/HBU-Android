package com.example.csc518;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import static com.example.csc518.Core.database;

public class NotesGratitudeActivity extends AppCompatActivity
{
    private EditText gratitudeET;
    private Button addButton;
    private ListView gratitudeLV;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notes_gratitude);

        this.gratitudeET = (EditText)findViewById(R.id.gratitudeET);
        this.gratitudeLV = (ListView)findViewById(R.id.gratitudeLV);
        this.addButton = (Button)findViewById(R.id.addButton);

        Core.database = FirebaseDatabase.getInstance();
        Core.gratefulnessRef = FirebaseDatabase.getInstance().getReference("Notes");
        //.push.setValue() gives unique

        this.gratitudeLV.setClickable(true);
        this.gratitudeLV.setOnItemClickListener(new AdapterView.OnItemClickListener()
        {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long row_id)
            {
                String temp = Core.listOfGratitude.get(position);
                Core.listOfGratitude.remove(temp);
                gratitudeLV.invalidateViews();
                //remember to remove from database
            }
        });
    }

    public void onAddGratitudeButtonPressed(View v)
    {
        String goal = this.gratitudeET.getText().toString();

        Core.listOfGratitude.add(goal);
        Core.listOfNotes.add("I'm grateful for: " + goal);

        GettingCurrentDate date = new GettingCurrentDate();
        String currDate = date.getCurrentDate();

        GoalObject goalObject = new GoalObject(currDate, goal);
        Core.gratefulnessRef.child("Gratitude").child("abc123").push().setValue(goalObject);


        // This is the array adapter, it takes the context of the activity as a
        // first parameter, the type of list view as a second parameter and your
        // array as a third parameter.
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(
                this,
                android.R.layout.simple_list_item_1,
                Core.listOfGratitude );

        gratitudeLV.setAdapter(arrayAdapter);
        this.gratitudeET.setText("");

    }
}
