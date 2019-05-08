package com.example.csc518;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class MedsPage2 extends AppCompatActivity {

    private Button addMedButton;
    private EditText nameOfMedET;
    private EditText dosageOfMedET;
    private ListView medsLV;
    private RadioButton takenConsistently;
    private RadioButton emergencyPill;
    public String consistentlyORemergencyPill;
    private RadioGroup radioGroup;
    private EditText timeET;
    public String emergencyMeds;
    private Button saveButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_meds_page2);
        this.addMedButton = (Button)findViewById(R.id.addMedButton);
        this.nameOfMedET = (EditText)findViewById(R.id.medNameET);
        this.dosageOfMedET = (EditText) findViewById(R.id.dosageET);
        this.medsLV = (ListView) findViewById(R.id.medsLV);
        this.takenConsistently = (RadioButton)findViewById(R.id.takenConsistentlyRB);
        this.emergencyPill = (RadioButton)findViewById(R.id.emergencyRB);
        this.radioGroup = (RadioGroup)findViewById(R.id.radioGroup);
        this.timeET = (EditText)findViewById(R.id.timeET);
        this.saveButton = (Button)findViewById(R.id.saveButton);

        Core.emergencyPills = emergencyMeds;

    }


    //Core.database = FirebaseDatabase.getInstance();


/*
        this.medsLV.setClickable(true);
        this.medsLV.setOnItemClickListener(new AdapterView.OnItemClickListener()
    {
        @Override
        public void onItemClick(AdapterView<?> adapterView, View view, int position, long row_id)
        {
            String temp = Core.listOfGoals.get(position);
            Core.listOfGoals.remove(temp);
            goalLV.invalidateViews();
            //remember to remove from database
        }
    }); */

    public String getEmergencyMeds() {
        return emergencyMeds;
    }

    public void setEmergencyMeds(String emergencyMeds) {
        this.emergencyMeds = emergencyMeds;
    }

    public void onTakenConsistentlyRBPressed (View v)
    {
        consistentlyORemergencyPill = "Taken Consistently";
        emergencyPill.setSelected(false);
    }

    public void onEmergencyPillRBPressed (View v)
    {
        consistentlyORemergencyPill = "Emergency Pill";
        takenConsistently.setSelected(false);
        //takenConsistently = false;
    }


    public void onAddGoalButtonPressed(View v)
    {
        String meds = this.nameOfMedET.getText().toString() +
                " " + this.dosageOfMedET.getText().toString() + " mg " + "(" + consistentlyORemergencyPill
                + ")" + " Taken every: " + this.timeET.getText().toString() + " hours.";

        Core.listOfMeds.add(meds);

        // This is the array adapter, it takes the context of the activity as a
        // first parameter, the type of list view as a second parameter and your
        // array as a third parameter.
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(
                this,
                android.R.layout.simple_list_item_1,
                Core.listOfMeds );


        if(consistentlyORemergencyPill.equals("Emergency Pill"));
        {
            emergencyMeds = ( "*" + this.nameOfMedET.getText().toString() + "\n") + emergencyMeds;
            System.out.println(emergencyMeds + "!!!!!!!!");
        }
        medsLV.setAdapter(arrayAdapter);
        this.nameOfMedET.setText("");
        this.dosageOfMedET.setText("");
        this.timeET.setText("");
        System.out.println(consistentlyORemergencyPill);


    }

    public void onSavePressed(View v)
    {
        Intent i = new Intent(this, MedsPage.class);
        this.startActivity(i);
        System.out.println(emergencyMeds + "^^^^^^^^^^^^^^^^");
        Core.emergencyPills =emergencyMeds;
    }
}


