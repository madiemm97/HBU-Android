package com.example.csc518;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MindPage5 extends AppCompatActivity {

    String imageToRemember = Core.imageToRemember;
    String wordToRemember = Core.wordToRemember;
    private Button purpleButton;
    private Button smileButton;
    private Button onionButton;
    private Button flowerButton;
    private Button highButton;
    private Button sockButton;
    private TextView answerTV;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mind_page5);

        this.purpleButton = (Button)(findViewById(R.id.purpleButton));
        this.smileButton = (Button)findViewById(R.id.smileButton);
        this.onionButton = (Button)findViewById(R.id.onionButton);
        this.flowerButton = (Button)findViewById(R.id.flowerButton);
        this.highButton = (Button)findViewById(R.id.highButton);
        this.sockButton = (Button)findViewById(R.id.sockButton);
        this.answerTV = (TextView)findViewById(R.id.answerTextView);
    }

    public void onPurpleButtonClicked (View v)
    {
        purpleButton.setTextColor(Color.BLUE);
        smileButton.setTextColor(Color.BLACK);
        onionButton.setTextColor(Color.BLACK);
        highButton.setTextColor(Color.BLACK);
        flowerButton.setTextColor(Color.BLACK);
        sockButton.setTextColor(Color.BLACK);


        if(wordToRemember == "PURPLE")
        {

            System.out.println("YES");
            answerTV.setText("Correct!");
        }
        else
        {
            System.out.println("NO");
            answerTV.setText("Wrong Answer");


        }
    }

    public void onSmileButtonClicked (View v)
    {
        purpleButton.setTextColor(Color.BLACK);
        smileButton.setTextColor(Color.BLUE);
        onionButton.setTextColor(Color.BLACK);
        highButton.setTextColor(Color.BLACK);
        flowerButton.setTextColor(Color.BLACK);
        sockButton.setTextColor(Color.BLACK);


        if(wordToRemember == "SMILE")
        {
            System.out.println("YES");
            answerTV.setText("Correct!");
        }
        else
        {
            System.out.println("NO");
            answerTV.setText("Wrong Answer");


        }
    }

    public void onOnionButtonClicked (View v)
    {
        purpleButton.setTextColor(Color.BLACK);
        smileButton.setTextColor(Color.BLACK);
        onionButton.setTextColor(Color.BLUE);
        highButton.setTextColor(Color.BLACK);
        flowerButton.setTextColor(Color.BLACK);
        sockButton.setTextColor(Color.BLACK);


        if(wordToRemember == "ONION")
        {
            System.out.println("YES");
            answerTV.setText("Correct!");
        }
        else
        {
            System.out.println("NO");
            answerTV.setText("Wrong Answer");


        }
    }

    public void onHighButtonClicked (View v)
    {
        purpleButton.setTextColor(Color.BLACK);
        smileButton.setTextColor(Color.BLACK);
        onionButton.setTextColor(Color.BLACK);
        highButton.setTextColor(Color.BLUE);
        flowerButton.setTextColor(Color.BLACK);
        sockButton.setTextColor(Color.BLACK);


        if(wordToRemember == "HIGH")
        {
            System.out.println("YES");
            answerTV.setText("Correct!");
        }
        else
        {
            System.out.println("NO");
            answerTV.setText("Wrong Answer");


        }
    }

    public void onFlowerButtonClicked (View v)
    {
        purpleButton.setTextColor(Color.BLACK);
        smileButton.setTextColor(Color.BLACK);
        onionButton.setTextColor(Color.BLACK);
        highButton.setTextColor(Color.BLACK);
        flowerButton.setTextColor(Color.BLUE);
        sockButton.setTextColor(Color.BLACK);


        if(wordToRemember == "FLOWER")
        {
            System.out.println("YES");
            answerTV.setText("Correct!");
        }
        else
        {
            System.out.println("NO");
            answerTV.setText("Wrong Answer");


        }
    }

    public void onSockButtonClicked (View v)
    {
        purpleButton.setTextColor(Color.BLACK);
        smileButton.setTextColor(Color.BLACK);
        onionButton.setTextColor(Color.BLACK);
        highButton.setTextColor(Color.BLACK);
        flowerButton.setTextColor(Color.BLACK);
        sockButton.setTextColor(Color.BLUE);


        if(wordToRemember == "SOCK")
        {
            System.out.println("YES");
            answerTV.setText("Correct!");
        }
        else
        {
            System.out.println("NO");
            answerTV.setText("Wrong Answer");


        }
    }

    public void onNextButton(View v)
    {
        Intent i = new Intent(this, MindPage6.class);
        this.startActivity(i);
    }

}
