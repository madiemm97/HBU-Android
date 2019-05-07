package com.example.csc518;

import android.os.CountDownTimer;
import android.support.v7 .app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.concurrent.TimeUnit;
import java.lang.Math;

public class MedsPage extends AppCompatActivity {

    TextView tv;
    long diff;
    long oldLong;
    long NewLong;
    private TextView txtNumber1;
    //private CheckBox tookItCheckbox;
    String endTime;


    long startTime;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_meds_page);
        start_countdown_timer();

        this.txtNumber1 = (TextView)findViewById(R.id.txtNumber1);
        //this.tookItCheckbox = (CheckBox)findViewById(R.id.tookItCheckBox);



    }

    public void onTookItCheckbox (View v)
    {
        boolean checked = ((CheckBox) v).isChecked();
        // Check which checkbox was clicked
        switch(v.getId()) {
            case R.id.tookItCheckBox:
                if (checked)
                {
                    endTime = "24";
                }
        else
                {
                    //do nothing
                }


                break;
            // Perform your logic
        }

    }

    private void start_countdown_timer()
    {

        SimpleDateFormat formatter = new SimpleDateFormat("HH:mm:ss");
        formatter.setLenient(false);
        Date currentTime = Calendar.getInstance().getTime();
        SimpleDateFormat currHour = new SimpleDateFormat("HH");
        String formattedCurrentHour = currHour.format(currentTime.getTime());
        System.out.println(formattedCurrentHour + "***************");

        SimpleDateFormat currMin = new SimpleDateFormat("mm");
        String formattedCurrMin = currMin.format(currentTime.getTime());
        System.out.println(formattedCurrMin + "***********");

        SimpleDateFormat currSec = new SimpleDateFormat("ss");
        String formattedCurrSec = currSec.format(currentTime.getTime());
        System.out.println(formattedCurrSec + "***********");




        String endTime = "02:00:00";

        SimpleDateFormat endHour = new SimpleDateFormat("HH");
        String formattedendHour = endHour.format(currentTime.getTime());
        SimpleDateFormat endMin = new SimpleDateFormat("mm");
        String formattedendMin = endMin.format(currentTime.getTime());
        SimpleDateFormat endSec = new SimpleDateFormat("ss");
        String formattedendSec = endSec.format(currentTime.getTime());


        System.out.println(formattedendMin + formattedendHour + formattedendSec + "@@@@@@@@@@@");

        long milliseconds=0;

        final CountDownTimer mCountDownTimer;

        Date endDate;
        try {
            endDate = formatter.parse(endTime);
            milliseconds = endDate.getTime();

        } catch (ParseException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        //startTime = System.currentTimeMillis();
        startTime = 0;


        mCountDownTimer = new CountDownTimer(milliseconds, 1000) {
            @Override
            public void onTick(long millisUntilFinished) {

                startTime=startTime-1;
                Long serverUptimeSeconds =
                        (millisUntilFinished - startTime) / 1000;

                //String daysLeft = String.format("%d", (serverUptimeSeconds / 86400);
                //txtNumber1.setText(daysLeft);
                //System.out.println(daysLeft + "!!!!!!!!!!!!!!!");
                //Log.d("daysLeft",daysLeft);

                String hoursLeft = String.format("%d", Math.abs(serverUptimeSeconds % 86400) / 3600);
                //txtNumber1.setText(hoursLeft);
                Log.d("hoursLeft",hoursLeft);

                String minutesLeft = String.format("%d", (Math.abs(serverUptimeSeconds % 86400) % 3600) / 60);
                //txtNumber2.setText(minutesLeft);
                Log.d("minutesLeft",minutesLeft);

                String secondsLeft = String.format("%d", (Math.abs(serverUptimeSeconds % 86400) % 3600) % 60);
                txtNumber1.setText("It's been " + hoursLeft + ":" + minutesLeft + ":" +secondsLeft +
                        " since you took.... ");
                Log.d("secondsLeft",secondsLeft);


            }

            @Override
            public void onFinish() {

            }
        }.start();


    }


}


