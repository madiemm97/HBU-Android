package com.example.csc518;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class MindPage extends AppCompatActivity {



    private Button generateButton;
    private Button nextButton1;
    public TextView randomWordTextView;
    public ImageView image1;
    public ImageView image2;
    public ImageView image3;
    public ImageView image4;
    public ImageView image5;
    public ImageView image6;
    public ImageView image7;
    public ImageView image8;
    public String wordToRemember;
    public String imageToRemember;


    String[] randomArray = new String[]{"PURPLE","SMILE","ONION", "FLOWER", "HIGH", "SOCK"};
    int arrayIndex = 0;






    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mind_page);


        this.generateButton = (Button)(findViewById(R.id.generateButton));
        this.nextButton1 = (Button)(findViewById(R.id.nextButton1));
        this.image1 = (ImageView)(findViewById(R.id.imageView1));
        this.image2 = (ImageView)(findViewById(R.id.imageView2));
        this.image3 = (ImageView)(findViewById(R.id.imageView3));
        this.image4 = (ImageView)(findViewById(R.id.imageView4));
        this.image5 = (ImageView)(findViewById(R.id.imageView5));
        this.image6 = (ImageView)(findViewById(R.id.imageView6));
        this.image7 = (ImageView)(findViewById(R.id.imageView7));
        this.image8 = (ImageView)(findViewById(R.id.imageView8));


        Core.imageToRemember = imageToRemember;
        Core.wordToRemember = wordToRemember;

        image1.setVisibility(View.INVISIBLE);
        image2.setVisibility(View.INVISIBLE);
        image3.setVisibility(View.INVISIBLE);
        image4.setVisibility(View.INVISIBLE);
        image5.setVisibility(View.INVISIBLE);
        image6.setVisibility(View.INVISIBLE);
        image7.setVisibility(View.INVISIBLE);
        image8.setVisibility(View.INVISIBLE);


    }


    public void onNextButton1(View v)
    {
        Intent i = new Intent(this, MindPage2.class);
        this.startActivity(i);
    }


    public void onGenerateButtonPressed (View v)
    {
        setWord();
        setImage();
    }

    public void setImage()
    {
        Random r = new Random();
        int num = r.nextInt(7-0);
        if(num == 0)
        {
            image1.setVisibility(View.VISIBLE);
            image2.setVisibility(View.INVISIBLE);
            image3.setVisibility(View.INVISIBLE);
            image4.setVisibility(View.INVISIBLE);
            image5.setVisibility(View.INVISIBLE);
            image6.setVisibility(View.INVISIBLE);
            image7.setVisibility(View.INVISIBLE);
            image8.setVisibility(View.INVISIBLE);

            Core.imageToRemember = "0";
        }
        else if(num ==1)
        {
            image1.setVisibility(View.INVISIBLE);
            image2.setVisibility(View.VISIBLE);
            image3.setVisibility(View.INVISIBLE);
            image4.setVisibility(View.INVISIBLE);
            image5.setVisibility(View.INVISIBLE);
            image6.setVisibility(View.INVISIBLE);
            image7.setVisibility(View.INVISIBLE);
            image8.setVisibility(View.INVISIBLE);

            Core.imageToRemember = "1";

        }
        else if(num == 2)
        {
            image1.setVisibility(View.INVISIBLE);
            image2.setVisibility(View.INVISIBLE);
            image3.setVisibility(View.VISIBLE);
            image4.setVisibility(View.INVISIBLE);
            image5.setVisibility(View.INVISIBLE);
            image6.setVisibility(View.INVISIBLE);
            image7.setVisibility(View.INVISIBLE);
            image8.setVisibility(View.INVISIBLE);

            Core.imageToRemember = "2";

        }
        else if(num == 3)
        {
            image1.setVisibility(View.INVISIBLE);
            image2.setVisibility(View.INVISIBLE);
            image3.setVisibility(View.INVISIBLE);
            image4.setVisibility(View.VISIBLE);
            image5.setVisibility(View.INVISIBLE);
            image6.setVisibility(View.INVISIBLE);
            image7.setVisibility(View.INVISIBLE);
            image8.setVisibility(View.INVISIBLE);

            Core.imageToRemember = "3";

        }
        else if(num == 4)
        {
            image1.setVisibility(View.INVISIBLE);
            image2.setVisibility(View.INVISIBLE);
            image3.setVisibility(View.INVISIBLE);
            image4.setVisibility(View.INVISIBLE);
            image5.setVisibility(View.VISIBLE);
            image6.setVisibility(View.INVISIBLE);
            image7.setVisibility(View.INVISIBLE);
            image8.setVisibility(View.INVISIBLE);

            Core.imageToRemember = "4";

        }
        else if(num == 5)
        {
            image1.setVisibility(View.INVISIBLE);
            image2.setVisibility(View.INVISIBLE);
            image3.setVisibility(View.INVISIBLE);
            image4.setVisibility(View.INVISIBLE);
            image5.setVisibility(View.INVISIBLE);
            image6.setVisibility(View.VISIBLE);
            image7.setVisibility(View.INVISIBLE);
            image8.setVisibility(View.INVISIBLE);

            Core.imageToRemember = "5";

        }
        else if(num == 6)
        {
            image1.setVisibility(View.INVISIBLE);
            image2.setVisibility(View.INVISIBLE);
            image3.setVisibility(View.INVISIBLE);
            image4.setVisibility(View.INVISIBLE);
            image5.setVisibility(View.INVISIBLE);
            image6.setVisibility(View.INVISIBLE);
            image7.setVisibility(View.VISIBLE);
            image8.setVisibility(View.INVISIBLE);

            Core.imageToRemember = "6";

        }
        else
        {
            image1.setVisibility(View.INVISIBLE);
            image2.setVisibility(View.INVISIBLE);
            image3.setVisibility(View.INVISIBLE);
            image4.setVisibility(View.INVISIBLE);
            image5.setVisibility(View.INVISIBLE);
            image6.setVisibility(View.INVISIBLE);
            image7.setVisibility(View.INVISIBLE);
            image8.setVisibility(View.VISIBLE);

            Core.imageToRemember = "7";

        }

        System.out.println(Core.imageToRemember);
    }


    public void setWord()
    {
        randomWordTextView = (TextView) findViewById(R.id.randomWordTextView);
        Random r = new Random();
        int num = r.nextInt(5 - 0);



        arrayIndex = num;

        String wordToUse = "";

        wordToUse = randomArray[num];
        Core.wordToRemember = wordToUse;

        randomWordTextView.setText(wordToUse);
        System.out.println(Core.wordToRemember);
    }

}
