package com.example.csc518;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

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

        //populate current fields from information saved in database

    }

    public void onSaveButtonPressed(View v)
    {
        //save to the database
    }
}
