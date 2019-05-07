package com.example.csc518;

import android.widget.ListView;

import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.ArrayList;
import java.util.List;
//here
public class Core
{
    public static FirebaseDatabase database = FirebaseDatabase.getInstance();

    public static DatabaseReference sleepDataRef;
    public static DatabaseReference mDatabase;
    public static DatabaseReference mealsRef;
    public static DatabaseReference mindfulnessRef;
    public static DatabaseReference goalsRef;
    public static FirebaseUser currentUser;
    public static String fName, lName;
    //public static DatabaseReference loyaltyProgramRef;

    public static List<String> listOfGoals = new ArrayList<String>();
    public static List<String> listOfGratitude = new ArrayList<String>();
    public static List<String> listOfRandomThings = new ArrayList<String>();
    public static List<String> listOfMindfulness = new ArrayList<>();
    public static List<String> listOfNotes = new ArrayList<>();
    //public static ListView notesLV;


}
