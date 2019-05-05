package com.example.csc518;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class MindPage extends AppCompatActivity {



    private Button generateButton;
    private Button nextButton1;
    public TextView randomWordTextView;


    String[] randomArray = new String[]{"PURPLE","SMILE","ONION", "FLOWER", "HIGH", "SOCK", "SISTERS",
    "SLIP", "MOTION", "SYMPTOMATIC", "CAT", "FUTURE", "HOLDS", "LACE"};
    int arrayIndex = 0;






    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mind_page);


        this.generateButton = (Button)(findViewById(R.id.generateButton));
        this.nextButton1 = (Button)(findViewById(R.id.nextButton1));
    }


    public void onNextButton1(View v)
    {
        Intent i = new Intent(this, MindPage2.class);
        this.startActivity(i);
    }


    public void onGenerateButtonPressed (View v)
    {
        setWord();
    }


    public void setWord()
    {
        randomWordTextView = (TextView) findViewById(R.id.randomWordTextView);
        Random r = new Random();
        int num = r.nextInt(13 - 0);

        arrayIndex = num;

        String wordToUse = "";

        wordToUse = randomArray[num];

        randomWordTextView.setText(wordToUse);
    }
}
