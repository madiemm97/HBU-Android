package com.example.csc518;

import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class Core
{
    public static FirebaseDatabase database;
    public static DatabaseReference mDatabase;
    public static DatabaseReference mealsRef;
    public static FirebaseUser currentUser;
    public static String fName, lName;
    //public static DatabaseReference loyaltyProgramRef;
}
