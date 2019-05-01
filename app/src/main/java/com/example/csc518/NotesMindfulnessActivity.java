package com.example.csc518;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;

public class NotesMindfulnessActivity extends AppCompatActivity
{
    private EditText eatET, familyET, whenImDownET;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notes_mindfulness);

        this.eatET = (EditText)findViewById(R.id.eatingET);
        this.familyET = (EditText)findViewById(R.id.familyET);
        this.whenImDownET = (EditText)findViewById(R.id.whenImDownET);
    }
}
