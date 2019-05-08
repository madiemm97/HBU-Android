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

    private int numOfMeals;


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

        this.numOfMeals = getIntent().getExtras().getInt("numberOfMeals");

    }


    public void drink0Pressed(View v)
    {
        drink0.setTextColor(Color.RED);
        drink1.setTextColor(Color.BLACK);
        drink2.setTextColor(Color.BLACK);
        drink3.setTextColor(Color.BLACK);
        drink4.setTextColor(Color.BLACK);
        drink5.setTextColor(Color.BLACK);
        drink6.setTextColor(Color.BLACK);
        drink7.setTextColor(Color.BLACK);
        drink8.setTextColor(Color.BLACK);
        drink9ormore.setTextColor(Color.BLACK);
        totalDrinks = 0;
    }

    public void drink1Pressed(View v)
    {
        drink0.setTextColor(Color.BLACK);
        drink1.setTextColor(Color.RED);
        drink2.setTextColor(Color.BLACK);
        drink3.setTextColor(Color.BLACK);
        drink4.setTextColor(Color.BLACK);
        drink5.setTextColor(Color.BLACK);
        drink6.setTextColor(Color.BLACK);
        drink7.setTextColor(Color.BLACK);
        drink8.setTextColor(Color.BLACK);
        drink9ormore.setTextColor(Color.BLACK);



        totalDrinks = 1;
    }

    public void drink2Pressed(View v)
    {

        drink0.setTextColor(Color.BLACK);
        drink1.setTextColor(Color.BLACK);
        drink2.setTextColor(Color.RED);
        drink3.setTextColor(Color.BLACK);
        drink4.setTextColor(Color.BLACK);
        drink5.setTextColor(Color.BLACK);
        drink6.setTextColor(Color.BLACK);
        drink7.setTextColor(Color.BLACK);
        drink8.setTextColor(Color.BLACK);
        drink9ormore.setTextColor(Color.BLACK);

        totalDrinks = 2;
    }

    public void drink3Pressed(View v)
    {
        drink0.setTextColor(Color.BLACK);
        drink1.setTextColor(Color.BLACK);
        drink2.setTextColor(Color.BLACK);
        drink3.setTextColor(Color.RED);
        drink4.setTextColor(Color.BLACK);
        drink5.setTextColor(Color.BLACK);
        drink6.setTextColor(Color.BLACK);
        drink7.setTextColor(Color.BLACK);
        drink8.setTextColor(Color.BLACK);
        drink9ormore.setTextColor(Color.BLACK);
        totalDrinks = 3;
    }

    public void drink4Pressed(View v)
    {
        drink0.setTextColor(Color.BLACK);
        drink1.setTextColor(Color.BLACK);
        drink2.setTextColor(Color.BLACK);
        drink3.setTextColor(Color.BLACK);
        drink4.setTextColor(Color.RED);
        drink5.setTextColor(Color.BLACK);
        drink6.setTextColor(Color.BLACK);
        drink7.setTextColor(Color.BLACK);
        drink8.setTextColor(Color.BLACK);
        drink9ormore.setTextColor(Color.BLACK);
        totalDrinks = 4;
    }

    public void drink5Pressed(View v)
    {
        drink0.setTextColor(Color.BLACK);
        drink1.setTextColor(Color.BLACK);
        drink2.setTextColor(Color.BLACK);
        drink3.setTextColor(Color.BLACK);
        drink4.setTextColor(Color.BLACK);
        drink5.setTextColor(Color.RED);
        drink6.setTextColor(Color.BLACK);
        drink7.setTextColor(Color.BLACK);
        drink8.setTextColor(Color.BLACK);
        drink9ormore.setTextColor(Color.BLACK);
        totalDrinks = 5;
    }

    public void drink6Pressed(View v)
    {
        drink0.setTextColor(Color.BLACK);
        drink1.setTextColor(Color.BLACK);
        drink2.setTextColor(Color.BLACK);
        drink3.setTextColor(Color.BLACK);
        drink4.setTextColor(Color.BLACK);
        drink5.setTextColor(Color.BLACK);
        drink6.setTextColor(Color.RED);
        drink7.setTextColor(Color.BLACK);
        drink8.setTextColor(Color.BLACK);
        drink9ormore.setTextColor(Color.BLACK);
        totalDrinks = 6;
    }

    public void drink7Pressed(View v)
    {
        drink0.setTextColor(Color.BLACK);
        drink1.setTextColor(Color.BLACK);
        drink2.setTextColor(Color.BLACK);
        drink3.setTextColor(Color.BLACK);
        drink4.setTextColor(Color.BLACK);
        drink5.setTextColor(Color.BLACK);
        drink6.setTextColor(Color.BLACK);
        drink7.setTextColor(Color.RED);
        drink8.setTextColor(Color.BLACK);
        drink9ormore.setTextColor(Color.BLACK);
        totalDrinks = 7;
    }

    public void drink8Pressed(View v)
    {
        drink0.setTextColor(Color.BLACK);
        drink1.setTextColor(Color.BLACK);
        drink2.setTextColor(Color.BLACK);
        drink3.setTextColor(Color.BLACK);
        drink4.setTextColor(Color.BLACK);
        drink5.setTextColor(Color.BLACK);
        drink6.setTextColor(Color.BLACK);
        drink7.setTextColor(Color.BLACK);
        drink8.setTextColor(Color.RED);
        drink9ormore.setTextColor(Color.BLACK);
        totalDrinks = 8;
    }

    public void drink9ormorePressed(View v)
    {
        drink0.setTextColor(Color.BLACK);
        drink1.setTextColor(Color.BLACK);
        drink2.setTextColor(Color.BLACK);
        drink3.setTextColor(Color.BLACK);
        drink4.setTextColor(Color.BLACK);
        drink5.setTextColor(Color.BLACK);
        drink6.setTextColor(Color.BLACK);
        drink7.setTextColor(Color.BLACK);
        drink8.setTextColor(Color.BLACK);
        drink9ormore.setTextColor(Color.RED);
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
        System.out.println("***" + numOfMeals);


        GettingCurrentDate date = new GettingCurrentDate();
        String currDate = date.getCurrentDate();

        MealsObject mealsObject = new MealsObject(currDate, totalDrinks, numOfMeals, whileEating);

        //change abc123 to be Core.currentUser.getUID().push().setValue(sleepObject);
        Core.mealsRef.child("abc123").push().setValue(mealsObject);
        //.child(this key) instead of .push() when we are editing

        this.startActivity(i);


    }


}
