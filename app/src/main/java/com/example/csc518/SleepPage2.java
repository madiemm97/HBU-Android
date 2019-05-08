package com.example.csc518;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class SleepPage2 extends AppCompatActivity {

    private Button submitButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sleep_page2);

        this.submitButton = (Button)findViewById(R.id.submitButton);
    }


    public void onSubmitButtonPressed(View v)
    {

        Intent i = new Intent(this, MainActivity.class);
        this.startActivity(i);
        //Core.mealsRef.addListenerForSingleValueEvent();
    }
}
