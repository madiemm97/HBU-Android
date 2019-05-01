package com.example.csc518;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MealsPage2 extends AppCompatActivity {

    private Button submitButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_meals_page2);


        this.submitButton = (Button)findViewById(R.id.submitButton);

    }


    public void onSubmitButtonPressed(View v)
    {
        //Core.mealsRef.setValue(numberOfMealsET.getText().toString());
        Intent i = new Intent(this, MealsPage3.class);
        this.startActivity(i);

        //set numberOfMeals to firebase
        System.out.println("*** reached button");
        //Core.mealsRef.addListenerForSingleValueEvent();
    }


}
