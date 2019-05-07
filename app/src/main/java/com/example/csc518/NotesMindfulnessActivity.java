package com.example.csc518;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import static com.example.csc518.Core.database;

public class NotesMindfulnessActivity extends AppCompatActivity
{
    private EditText eatET, familyET, whenImDownET;
    NotesMindfulnessActivity myself;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notes_mindfulness);

        this.eatET = (EditText)findViewById(R.id.eatingET);
        this.familyET = (EditText)findViewById(R.id.familyET);
        this.whenImDownET = (EditText)findViewById(R.id.whenImDownET);
        this.myself = this;

        Core.database = FirebaseDatabase.getInstance();
        //Core.mindfulnessRef.getDatabase().getReference(); //make sure this is right, and fix everywhere
        Core.mindfulnessRef = Core.database.getReference("Notes");
        DatabaseReference mindfulness2Ref, mindfulness3Ref, mindfulness4Ref, mindfulnessEatRef, mindfulnessFamilyRef, mindfulnessDownRef;
        mindfulness2Ref = Core.mindfulnessRef.child("Mindfulness");
        mindfulness3Ref = mindfulness2Ref.child("abc123");
        mindfulness4Ref = mindfulness3Ref.child(mindfulness3Ref.push().getKey());

        mindfulnessEatRef = mindfulness4Ref.child("eat");
        mindfulnessFamilyRef = mindfulness4Ref.child("family");
        mindfulnessDownRef = mindfulness4Ref.child("whenImDown");

//        this.eatET.setText(mindfulnessEatRef.toString());
//        this.familyET.setText(mindfulnessFamilyRef.getRef().toString());
//        this.whenImDownET.setText(mindfulnessDownRef.toString());
//
//        mindfulnessEatRef.addValueEventListener(new ValueEventListener() {
//            @Override
//            public void onDataChange(DataSnapshot dataSnapshot) {
//                for (DataSnapshot zoneSnapshot: dataSnapshot.getChildren()) {
//                    String value = dataSnapshot.getValue(String.class);
//                    myself.eatET.setText(zoneSnapshot.child("eat").getValue(String.class));
//                    myself.eatET.setText(value);
//                    //Log.i(TAG, zoneSnapshot.child("ZNAME").getValue(String.class);
//                }
//            }
//
//            @Override
//            public void onCancelled(DatabaseError databaseError) {
//                System.out.println("Error");
//                //Log.w(TAG, "onCancelled", databaseError.toException());
//            }
//        });


    }

    public void onSaveButtonPressed(View v)
    {
        if(!this.eatET.equals(""))
        {
            String eatMindful = this.eatET.getText().toString();

            Core.listOfMindfulness.add(eatMindful);
            Core.listOfNotes.add(eatMindful);
        }

        if(!this.familyET.equals(""))
        {
            String familyMindful = this.familyET.getText().toString();

            Core.listOfMindfulness.add(familyMindful);
            Core.listOfNotes.add(familyMindful);
        }

        if(!this.whenImDownET.equals(""))
        {
            String mindfulWhenImDown = this.whenImDownET.getText().toString();

            Core.listOfMindfulness.add(mindfulWhenImDown);
            Core.listOfNotes.add(mindfulWhenImDown);
        }

        GettingCurrentDate date = new GettingCurrentDate();
        String currDate = date.getCurrentDate();

        MindfulnessObject mindfulnessObject = new MindfulnessObject(currDate, eatET.getText().toString(), familyET.getText().toString(), whenImDownET.getText().toString());
        Core.mindfulnessRef.child("Mindfulness").child("abc123").push().setValue(mindfulnessObject);

        Intent i = new Intent(this, NotesPage.class);
        this.startActivity(i);
    }
}
