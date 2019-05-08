package com.example.csc518;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;

import java.util.ArrayList;

public class MealsPage2 extends AppCompatActivity {

    private Button submitButton;
    private CheckBox atTheTable, withFamilyandFriends, inFrontOfTV, whileDoingWork, mindfullyWithNoDistractions;
    public ArrayList<String> whileEating;
    MealsPage2 myself;
    String numOfMeals;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_meals_page2);
        this.atTheTable = (CheckBox)findViewById(R.id.checkBox);
        this.withFamilyandFriends = (CheckBox)findViewById(R.id.checkBox2);
        this.inFrontOfTV = (CheckBox)findViewById(R.id.checkBox3);
        this.whileDoingWork = (CheckBox)findViewById(R.id.checkBox4);
        this.mindfullyWithNoDistractions = (CheckBox)findViewById(R.id.checkBox5);
        this.myself = this;

        this.whileEating = new ArrayList<>();
        this.submitButton = (Button)findViewById(R.id.submitButton);

        this.numOfMeals = getIntent().getExtras().getString("numOfMeals");

    }


    public void onSubmitButtonPressed(View v)
    {
        //Core.mealsRef.setValue(numberOfMealsET.getText().toString());
        Intent i = new Intent(this, MealsPage3.class);

        this.whileEating.clear();

        if(this.atTheTable.isChecked())
        {
            whileEating.add("At the table");
        }
        if(this.withFamilyandFriends.isChecked())
        {
            whileEating.add("With Family and Friends");
        }
        if(this.inFrontOfTV.isChecked())
        {
            whileEating.add("In front of the TV");
        }
        if(this.whileDoingWork.isChecked())
        {
            whileEating.add("While doing work");
        }
        if(this.mindfullyWithNoDistractions.isChecked())
        {
            whileEating.add("Mindfully with no distractions");
        }

        //i.putExtra("whileEating", whileEating);
        i.putStringArrayListExtra("whileEating", whileEating);
        //String numOfMeals = getIntent().getExtras().getString("numOfMeals");
        i.putExtra("numOfMeals", myself.numOfMeals);
        System.out.println(myself.numOfMeals);


        //set numberOfMeals to firebase
        System.out.println("*** reached button");
        //Core.mealsRef.addListenerForSingleValueEvent();
        this.startActivity(i);

    }


}
