package com.example.csc518;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.List;

import static com.example.csc518.Core.database;

public class NotesRandomActivity extends AppCompatActivity
{
    private EditText randomET;
    private ListView randomNotesLV;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notes_random);

        this.randomET = (EditText)findViewById(R.id.randomET);
        this.randomNotesLV = (ListView)findViewById(R.id.randomNotesLV);

        Core.database = FirebaseDatabase.getInstance();
        DatabaseReference notesRef = database.getReference("notes").child("gratitude");

        //this allows us to delete an entry
        this.randomNotesLV.setClickable(true);
        this.randomNotesLV.setOnItemClickListener(new AdapterView.OnItemClickListener()
        {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long row_id)
            {
                String temp = Core.listOfRandomThings.get(position);
                Core.listOfRandomThings.remove(temp);
                randomNotesLV.invalidateViews();
                //remember to remove from database
            }
        });
    }

    public void onAddButtonPressed(View v)
    {
        String randomNote = this.randomET.getText().toString();

        // Instanciating an array list (you don't need to do this,
        // you already have yours).

        Core.listOfRandomThings.add(randomNote);
        Core.listOfNotes.add(randomNote);


        // This is the array adapter, it takes the context of the activity as a
        // first parameter, the type of list view as a second parameter and your
        // array as a third parameter.
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(
                this,
                android.R.layout.simple_list_item_1,
                Core.listOfRandomThings );

        randomNotesLV.setAdapter(arrayAdapter);
        this.randomET.setText("");

    }
}
