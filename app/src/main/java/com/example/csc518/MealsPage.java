package com.example.csc518;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import static com.example.csc518.Core.database;

public class MealsPage extends AppCompatActivity
{
    //private EditText numberOfMealsET;
    private Button submitButton;
    private MealsPage myself;
    private Button mealNumOne;
    private Button mealNumTwo;
    private Button mealNumThree;
    private Button mealNumFour;
    private Button mealNumFive;
    private Button mealNumSix;
    private Button mealNumSeven;
    private Button mealNumEight;
    private Button mealNumNine;
    private String numberOfMeals;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_meals_page);

        Core.database = FirebaseDatabase.getInstance();
        //Core.mealsRef = FirebaseDatabase.getInstance().getReference();
        //db.getreference(profiles).child(abc123).setValue("mike")
        //.push creates a unique identifier
        Core.mealsRef = database.getReference("meals");
        this.myself = this;



        //myRef.setValue("Hello, World!");

        //this.numberOfMealsET = (EditText)findViewById(R.id.numberOfMealsET);
        this.submitButton = (Button)findViewById(R.id.submitButton);
        this.mealNumOne = (Button)findViewById(R.id.mealNumOne);
        this.mealNumTwo = (Button)findViewById(R.id.mealNumTwo);
        this.mealNumThree = (Button)findViewById(R.id.mealNumThree);
        this.mealNumFour = (Button)findViewById(R.id.mealNumFour);
        this.mealNumFive = (Button)findViewById(R.id.mealNumFive);
        this.mealNumSix = (Button)findViewById(R.id.mealNumSix);
        this.mealNumSeven = (Button)findViewById(R.id.mealNumSeven);
        this.mealNumEight = (Button)findViewById(R.id.mealNumEight);
        this.mealNumNine = (Button)findViewById(R.id.mealNumNine);





//        submitButton.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Core.mealsRef.setValue(numberOfMealsET.getText().toString());
//            }
//        });
    }

    public void mealNumOnePressed(View v)
    {
        mealNumOne.setTextColor(Color.RED);
        mealNumTwo.setTextColor(Color.BLACK);
        mealNumThree.setTextColor(Color.BLACK);
        mealNumFour.setTextColor(Color.BLACK);
        mealNumFive.setTextColor(Color.BLACK);
        mealNumSix.setTextColor(Color.BLACK);
        mealNumSeven.setTextColor(Color.BLACK);
        mealNumEight.setTextColor(Color.BLACK);
        mealNumNine.setTextColor(Color.BLACK);




        numberOfMeals = "1";
    }

    public void mealNumTwoPressed(View v)
    {
        mealNumOne.setTextColor(Color.BLACK);
        mealNumTwo.setTextColor(Color.RED);
        mealNumThree.setTextColor(Color.BLACK);
        mealNumFour.setTextColor(Color.BLACK);
        mealNumFive.setTextColor(Color.BLACK);
        mealNumSix.setTextColor(Color.BLACK);
        mealNumSeven.setTextColor(Color.BLACK);
        mealNumEight.setTextColor(Color.BLACK);
        mealNumNine.setTextColor(Color.BLACK);
        numberOfMeals = "2";
    }

    public void mealNumThreePressed(View v)
    {
        mealNumOne.setTextColor(Color.BLACK);
        mealNumTwo.setTextColor(Color.BLACK);
        mealNumThree.setTextColor(Color.RED);
        mealNumFour.setTextColor(Color.BLACK);
        mealNumFive.setTextColor(Color.BLACK);
        mealNumSix.setTextColor(Color.BLACK);
        mealNumSeven.setTextColor(Color.BLACK);
        mealNumEight.setTextColor(Color.BLACK);
        mealNumNine.setTextColor(Color.BLACK);
        numberOfMeals = "3";
    }

    public void mealNumFourPressed(View v)
    {
        mealNumOne.setTextColor(Color.BLACK);
        mealNumTwo.setTextColor(Color.BLACK);
        mealNumThree.setTextColor(Color.BLACK);
        mealNumFour.setTextColor(Color.RED);
        mealNumFive.setTextColor(Color.BLACK);
        mealNumSix.setTextColor(Color.BLACK);
        mealNumSeven.setTextColor(Color.BLACK);
        mealNumEight.setTextColor(Color.BLACK);
        mealNumNine.setTextColor(Color.BLACK);
        numberOfMeals = "4";
    }

    public void mealNumFivePressed(View v)
    {
        mealNumOne.setTextColor(Color.BLACK);
        mealNumTwo.setTextColor(Color.BLACK);
        mealNumThree.setTextColor(Color.BLACK);
        mealNumFour.setTextColor(Color.BLACK);
        mealNumFive.setTextColor(Color.RED);
        mealNumSix.setTextColor(Color.BLACK);
        mealNumSeven.setTextColor(Color.BLACK);
        mealNumEight.setTextColor(Color.BLACK);
        mealNumNine.setTextColor(Color.BLACK);
        numberOfMeals = "5";
    }

    public void mealNumSixPressed(View v)
    {
        mealNumOne.setTextColor(Color.BLACK);
        mealNumTwo.setTextColor(Color.BLACK);
        mealNumThree.setTextColor(Color.BLACK);
        mealNumFour.setTextColor(Color.BLACK);
        mealNumFive.setTextColor(Color.BLACK);
        mealNumSix.setTextColor(Color.RED);
        mealNumSeven.setTextColor(Color.BLACK);
        mealNumEight.setTextColor(Color.BLACK);
        mealNumNine.setTextColor(Color.BLACK);
        numberOfMeals = "6";
    }

    public void mealNumSevenPressed(View v)
    {
        mealNumOne.setTextColor(Color.BLACK);
        mealNumTwo.setTextColor(Color.BLACK);
        mealNumThree.setTextColor(Color.BLACK);
        mealNumFour.setTextColor(Color.BLACK);
        mealNumFive.setTextColor(Color.BLACK);
        mealNumSix.setTextColor(Color.BLACK);
        mealNumSeven.setTextColor(Color.RED);
        mealNumEight.setTextColor(Color.BLACK);
        mealNumNine.setTextColor(Color.BLACK);
        numberOfMeals = "7";
    }

    public void mealNumEightPressed(View v)
    {
        mealNumOne.setTextColor(Color.BLACK);
        mealNumTwo.setTextColor(Color.BLACK);
        mealNumThree.setTextColor(Color.BLACK);
        mealNumFour.setTextColor(Color.BLACK);
        mealNumFive.setTextColor(Color.BLACK);
        mealNumSix.setTextColor(Color.BLACK);
        mealNumSeven.setTextColor(Color.BLACK);
        mealNumEight.setTextColor(Color.RED);
        mealNumNine.setTextColor(Color.BLACK);
        numberOfMeals = "8";
    }

    public void mealNumNinePressed(View v)
    {
        mealNumOne.setTextColor(Color.BLACK);
        mealNumTwo.setTextColor(Color.BLACK);
        mealNumThree.setTextColor(Color.BLACK);
        mealNumFour.setTextColor(Color.BLACK);
        mealNumFive.setTextColor(Color.BLACK);
        mealNumSix.setTextColor(Color.BLACK);
        mealNumSeven.setTextColor(Color.BLACK);
        mealNumEight.setTextColor(Color.BLACK);
        mealNumNine.setTextColor(Color.RED);
        numberOfMeals = "9";
    }

    public void onSubmitButtonPressed(View v)
    {
        //Core.mealsRef.setValue(numberOfMealsET.getText().toString());
        Intent i = new Intent(this, MealsPage2.class);
        System.out.println("***" + numberOfMeals);
        i.putExtra("numberOfMeals", numberOfMeals);
        //i.putExtra("numberOfMeals", numberOfMeals);
        //set numberOfMeals to firebase
        System.out.println("*** reached button");
        //Core.mealsRef.addListenerForSingleValueEvent();
        this.startActivity(i);

    }
}
