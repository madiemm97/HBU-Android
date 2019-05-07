package com.example.csc518;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.google.firebase.database.FirebaseDatabase;

import java.util.ArrayList;

public class MealsPage3 extends AppCompatActivity {


    private Button drink0;
    private Button drink1;
    private Button drink2;
    private Button drink3;
    private Button drink4;
    private Button drink5;
    private Button drink6;
    private Button drink7;
    private Button drink8;
    private Button drink9ormore;
    private int totalDrinks;
    private MealsPage3 MealsPage3Activity;

    String numOfMeals;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_meals_page3);


        this.drink0 = (Button)findViewById(R.id.drink0);
        this.drink1 = (Button)findViewById(R.id.drink1);
        this.drink2 = (Button)findViewById(R.id.drink2);
        this.drink3 = (Button)findViewById(R.id.drink3);
        this.drink4 = (Button)findViewById(R.id.drink4);
        this.drink5 = (Button)findViewById(R.id.drink5);
        this.drink6 = (Button)findViewById(R.id.drink6);
        this.drink7 = (Button)findViewById(R.id.drink7);
        this.drink8 = (Button)findViewById(R.id.drink8);
        this.drink9ormore = (Button)findViewById(R.id.drink9ormore);
        this.MealsPage3Activity = this;

        Core.mealsRef = FirebaseDatabase.getInstance().getReference().child("Meals");

        this.numOfMeals = getIntent().getExtras().getString("numOfMeals");

    }


    public void drink0Pressed(View v)
    {
        drink0.setBackgroundColor(Color.WHITE);
        totalDrinks = 0;
    }

    public void drink1Pressed(View v)
    {
        drink1.setBackgroundColor(Color.WHITE);
        totalDrinks = 1;
    }

    public void drink2Pressed(View v)
    {
        drink2.setBackgroundColor(Color.WHITE);
        totalDrinks = 2;
    }

    public void drink3Pressed(View v)
    {
        drink3.setBackgroundColor(Color.WHITE);
        totalDrinks = 3;
    }

    public void drink4Pressed(View v)
    {
        drink4.setBackgroundColor(Color.WHITE);
        totalDrinks = 4;
    }

    public void drink5Pressed(View v)
    {
        drink5.setBackgroundColor(Color.WHITE);
        totalDrinks = 5;
    }

    public void drink6Pressed(View v)
    {
        drink6.setBackgroundColor(Color.WHITE);
        totalDrinks = 6;
    }

    public void drink7Pressed(View v)
    {
        drink7.setBackgroundColor(Color.WHITE);
        totalDrinks = 7;
    }

    public void drink8Pressed(View v)
    {
        drink8.setBackgroundColor(Color.WHITE);
        totalDrinks = 8;
    }

    public void drink9ormorePressed(View v)
    {
        drink9ormore.setBackgroundColor(Color.WHITE);
        totalDrinks = 9;
    }

    public void submitButtonPressed(View v)
    {
        Intent i = new Intent(this, MainActivity.class);
        System.out.println(totalDrinks);
        if(totalDrinks > 2)
        {
            Toast.makeText(MealsPage3Activity, "Make sure you wait a while to take your meds!", Toast.LENGTH_LONG).show();

        }
        ArrayList<String> whileEating = new ArrayList<>();
        whileEating = getIntent().getExtras().getStringArrayList("whileEating");
        System.out.println(numOfMeals);


        GettingCurrentDate date = new GettingCurrentDate();
        String currDate = date.getCurrentDate();
        MealsObject mealsObject = new MealsObject(currDate, totalDrinks, numOfMeals, whileEating);

        //still need to store object in database
        //change abc123 to be Core.currentUser.getUID().push().setValue(sleepObject);
        Core.mealsRef.child("abc123").push().setValue(mealsObject);
        //.child(this key) instead of .push() when we are editing

        this.startActivity(i);


    }


}
