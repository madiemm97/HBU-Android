package com.example.csc518;

import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Locale;

public class MedsPage extends AppCompatActivity {
    private static final long START_TIME_IN_MILLIS = 86400000;

    private TextView mTextViewCountDown;
    private Button mButtonStartPause;
    private Button mButtonReset;
    private CheckBox tookItCheckbox;
    long startTime;
    private TextView emergencyPillsTV;
    String emergencyPills = Core.emergencyPills;


    private CountDownTimer mCountDownTimer;

    private boolean mTimerRunning;


    private long mTimeLeftInMillis = START_TIME_IN_MILLIS;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_meds_page);

        this.tookItCheckbox = (CheckBox)findViewById(R.id.tookItCheckBox);
        this.mButtonReset = (Button)findViewById(R.id.mButtonReset);
        this.mButtonStartPause = (Button)findViewById(R.id.mButtonStartPause);
        this.emergencyPillsTV = (TextView)findViewById(R.id.emergencyPillsTV);
        mTextViewCountDown = findViewById(R.id.text_view_countdown);

        emergencyPillsTV.setText(emergencyPills);



        //this.emergencyPillsTV.setText((CharSequence) Core.listOfMeds);

        //mButtonStartPause = findViewById(R.id.button_start_pause);
        //mButtonReset = findViewById(R.id.button_reset);
        startTimer();



        mButtonStartPause.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mTimerRunning) {
                    pauseTimer();
                } else {
                    startTimer();
                }
            }
        });

        mButtonReset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                resetTimer();
            }
        });

        updateCountDownText();
    }

    public void onTookItCheckboxClicked (View v)
    {
        resetTimer();
        Toast.makeText(getApplicationContext(),"Good job!" , Toast.LENGTH_SHORT).show();
        System.out.println(emergencyPills + "@@@@@@@@@@@@@@@@@@@@@@@@@@@");

    }





    private void startTimer() {
        mCountDownTimer = new CountDownTimer(mTimeLeftInMillis, 1000) {
            @Override
            public void onTick(long millisUntilFinished) {
                mTimeLeftInMillis = millisUntilFinished;
                updateCountDownText();
            }

            @Override
            public void onFinish() {
                mTimerRunning = false;
                //mButtonStartPause.setText("Start");
                //mButtonStartPause.setVisibility(View.INVISIBLE);
                //mButtonReset.setVisibility(View.VISIBLE);
            }
        }.start();

        mTimerRunning = true;
        //mButtonStartPause.setText("pause");
        //mButtonReset.setVisibility(View.INVISIBLE);
    }

    private void pauseTimer() {
        mCountDownTimer.cancel();
        mTimerRunning = false;
        //mButtonStartPause.setText("Start");
        //mButtonReset.setVisibility(View.VISIBLE);
    }

    private void resetTimer() {
        mTimeLeftInMillis = START_TIME_IN_MILLIS;
        updateCountDownText();
        //mButtonReset.setVisibility(View.INVISIBLE);
        //mButtonStartPause.setVisibility(View.VISIBLE);
    }

    private void updateCountDownText() {
        int hours = (int) (mTimeLeftInMillis / (1000 * 60 *60)) %24;
        int minutes = (int) (mTimeLeftInMillis / (1000 * 60)) % 60;
        int seconds = (int) (mTimeLeftInMillis / 1000) % 60;

        String timeLeftFormatted = String.format(Locale.getDefault(), "%02d:%02d:%02d", hours, minutes, seconds);

        mTextViewCountDown.setText("Take your meds in " + timeLeftFormatted);
    }

    public void onSettingsButtonPressed(View v)
    {
        Intent i = new Intent(this, MedsPage2.class);
        this.startActivity(i);
    }

    public void onDoneButtonPressed(View v)
    {
        Intent i = new Intent(this, MainActivity.class);
        this.startActivity(i);
    }
}
