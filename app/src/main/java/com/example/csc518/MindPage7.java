package com.example.csc518;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MindPage7 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mind_page7);
    }



    public void onDoneButtonClicked (View v)
    {
        Intent i = new Intent(this, MainActivity.class);
        this.startActivity(i);
    }
}


