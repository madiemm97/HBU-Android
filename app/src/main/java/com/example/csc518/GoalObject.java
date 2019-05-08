package com.example.csc518;

import java.io.Serializable;

public class GoalObject implements Serializable
{
    public String date;
    public String goal;

    public GoalObject() {}

    public GoalObject(String date, String goal)
    {
        this.date = date;
        this.goal = goal;
    }

}
