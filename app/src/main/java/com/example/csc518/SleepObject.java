package com.example.csc518;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;

public class SleepObject implements Serializable
{
    public String date;
    public int numberOfHoursSlept;
    public ArrayList<String> howTheyFelt;

    public SleepObject() {
    }

    public SleepObject(String date, int numberOfHoursSlept, ArrayList<String> howTheyFelt) {
        this.date = date;
        this.numberOfHoursSlept = numberOfHoursSlept;
        this.howTheyFelt = howTheyFelt;
    }


}
