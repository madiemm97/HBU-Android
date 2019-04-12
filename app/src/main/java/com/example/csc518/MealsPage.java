package com.example.csc518;

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
    private EditText numberOfMealsET;
    private Button submitButton;
    private MealsPage myself;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        System.out.println("***Made it");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_meals_page);

        Core.database = FirebaseDatabase.getInstance();
        //Core.mealsRef = FirebaseDatabase.getInstance().getReference();
        Core.mealsRef = database.getReference("meals");
        this.myself = this;

        //myRef.setValue("Hello, World!");

        this.numberOfMealsET = (EditText)findViewById(R.id.numberOfMealsET);
        this.submitButton = (Button)findViewById(R.id.submitButton);

//        submitButton.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Core.mealsRef.setValue(numberOfMealsET.getText().toString());
//            }
//        });
    }

    public void onSubmitButtonPressed(View v)
    {
        Core.mealsRef.setValue(numberOfMealsET.getText().toString());
        System.out.println("*** reached button");
        //Core.mealsRef.addListenerForSingleValueEvent();
    }
}
