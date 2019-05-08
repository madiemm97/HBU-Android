package com.example.csc518;

import java.io.Serializable;
import java.util.ArrayList;

public class MealsObject implements Serializable
{
    public int numOfDrinks;
    public int numOfMeals;
    public String date;
    public ArrayList<String> whileEating;

    public MealsObject()
    {

    }

    public MealsObject(String date, int numOfDrinks, int numOfMeals, ArrayList<String> whileEating)
    {
        this.date = date;
        this.numOfDrinks = numOfDrinks;
        this.numOfMeals = numOfMeals;
        this.whileEating = whileEating;
    }
}
