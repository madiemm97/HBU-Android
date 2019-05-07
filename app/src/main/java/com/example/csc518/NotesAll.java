package com.example.csc518;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.List;

public class NotesAll extends AppCompatActivity
{
    private ListView notesLV;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notes_all);

        this.notesLV = (ListView)findViewById(R.id.notesLV);

        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(
                this,
                android.R.layout.simple_list_item_1,
                Core.listOfNotes );

        this.notesLV.setAdapter(arrayAdapter);
    }
}
