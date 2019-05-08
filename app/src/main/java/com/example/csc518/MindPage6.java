package com.example.csc518;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MindPage6 extends AppCompatActivity {

    String imageToRemember = Core.imageToRemember;


    private ImageView image1;
    private ImageView image2;
    private ImageView image3;
    private ImageView image4;
    private ImageView image5;
    private ImageView image6;
    private ImageView image7;
    private ImageView image8;
    private TextView answerTV;





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mind_page6);

        this.image1 = (ImageView)(findViewById(R.id.imageView1));
        this.image2 = (ImageView)(findViewById(R.id.imageView2));
        this.image3 = (ImageView)(findViewById(R.id.imageView3));
        this.image4 = (ImageView)(findViewById(R.id.imageView4));
        this.image5 = (ImageView)(findViewById(R.id.imageView5));
        this.image6 = (ImageView)(findViewById(R.id.imageView6));
        this.image7 = (ImageView)(findViewById(R.id.imageView7));
        this.image8 = (ImageView)(findViewById(R.id.imageView8));
        this.answerTV = (TextView)(findViewById(R.id.answerTV));





    }

    public void onImageView1Pressed (View v)
    {
        image1.setBackgroundColor(Color.LTGRAY);
        image2.setBackgroundColor(Color.DKGRAY);
        image3.setBackgroundColor(Color.DKGRAY);
        image4.setBackgroundColor(Color.DKGRAY);
        image5.setBackgroundColor(Color.DKGRAY);
        image6.setBackgroundColor(Color.DKGRAY);
        image7.setBackgroundColor(Color.DKGRAY);
        image8.setBackgroundColor(Color.DKGRAY);

        if(imageToRemember == "0")
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
    public void onImageView2Pressed (View v)
    {
        image1.setBackgroundColor(Color.DKGRAY);
        image2.setBackgroundColor(Color.LTGRAY);
        image3.setBackgroundColor(Color.DKGRAY);
        image4.setBackgroundColor(Color.DKGRAY);
        image5.setBackgroundColor(Color.DKGRAY);
        image6.setBackgroundColor(Color.DKGRAY);
        image7.setBackgroundColor(Color.DKGRAY);
        image8.setBackgroundColor(Color.DKGRAY);

        if(imageToRemember == "1")
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
    public void onImageView3Pressed (View v)
    {
        image1.setBackgroundColor(Color.DKGRAY);
        image2.setBackgroundColor(Color.DKGRAY);
        image3.setBackgroundColor(Color.LTGRAY);
        image4.setBackgroundColor(Color.DKGRAY);
        image5.setBackgroundColor(Color.DKGRAY);
        image6.setBackgroundColor(Color.DKGRAY);
        image7.setBackgroundColor(Color.DKGRAY);
        image8.setBackgroundColor(Color.DKGRAY);

        if(imageToRemember == "2")
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

    public void onImageView4Pressed (View v)
    {
        image1.setBackgroundColor(Color.DKGRAY);
        image2.setBackgroundColor(Color.DKGRAY);
        image3.setBackgroundColor(Color.DKGRAY);
        image4.setBackgroundColor(Color.LTGRAY);
        image5.setBackgroundColor(Color.DKGRAY);
        image6.setBackgroundColor(Color.DKGRAY);
        image7.setBackgroundColor(Color.DKGRAY);
        image8.setBackgroundColor(Color.DKGRAY);

        if(imageToRemember == "3")
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

    public void onImageView5Pressed (View v)
    {
        image1.setBackgroundColor(Color.DKGRAY);
        image2.setBackgroundColor(Color.DKGRAY);
        image3.setBackgroundColor(Color.DKGRAY);
        image4.setBackgroundColor(Color.DKGRAY);
        image5.setBackgroundColor(Color.LTGRAY);
        image6.setBackgroundColor(Color.DKGRAY);
        image7.setBackgroundColor(Color.DKGRAY);
        image8.setBackgroundColor(Color.DKGRAY);

        if(imageToRemember == "4")
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

    public void onImageView6Pressed (View v)
    {
        image1.setBackgroundColor(Color.DKGRAY);
        image2.setBackgroundColor(Color.DKGRAY);
        image3.setBackgroundColor(Color.DKGRAY);
        image4.setBackgroundColor(Color.DKGRAY);
        image5.setBackgroundColor(Color.DKGRAY);
        image6.setBackgroundColor(Color.LTGRAY);
        image7.setBackgroundColor(Color.DKGRAY);
        image8.setBackgroundColor(Color.DKGRAY);

        if(imageToRemember == "5")
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

    public void onImageView7Pressed (View v)
    {
        image1.setBackgroundColor(Color.DKGRAY);
        image2.setBackgroundColor(Color.DKGRAY);
        image3.setBackgroundColor(Color.DKGRAY);
        image4.setBackgroundColor(Color.DKGRAY);
        image5.setBackgroundColor(Color.DKGRAY);
        image6.setBackgroundColor(Color.DKGRAY);
        image7.setBackgroundColor(Color.LTGRAY);
        image8.setBackgroundColor(Color.DKGRAY);

        if(imageToRemember == "6")
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

    public void onImageView8Pressed (View v)
    {
        image1.setBackgroundColor(Color.DKGRAY);
        image2.setBackgroundColor(Color.DKGRAY);
        image3.setBackgroundColor(Color.DKGRAY);
        image4.setBackgroundColor(Color.DKGRAY);
        image5.setBackgroundColor(Color.DKGRAY);
        image6.setBackgroundColor(Color.DKGRAY);
        image7.setBackgroundColor(Color.DKGRAY);
        image8.setBackgroundColor(Color.LTGRAY);

        if(imageToRemember == "7")
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
        Intent i = new Intent(this, MindPage7.class);
        this.startActivity(i);
    }
}
