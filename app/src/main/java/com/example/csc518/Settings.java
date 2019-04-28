package com.example.csc518;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.google.firebase.auth.FirebaseAuth;

public class Settings extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);


    }

    public void onSignOutButtonPressed(View v)
    {
        FirebaseAuth.getInstance().signOut();
        Intent i = new Intent(this, Login.class);
        this.startActivity(i);
    }
}
