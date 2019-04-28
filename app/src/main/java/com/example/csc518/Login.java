package com.example.csc518;

import android.app.ActionBar;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

public class Login extends AppCompatActivity
{
    private FirebaseAuth mAuth;
    private EditText signInEmail;
    private EditText signInPassword;
    private Login logInActivity;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        this.signInEmail = (EditText)this.findViewById(R.id.emailET);
        this.signInPassword = (EditText)this.findViewById(R.id.passwordET);
        this.logInActivity = this;
        mAuth = FirebaseAuth.getInstance();
        if (Core.currentUser != null)
        {
            Intent i = new Intent(logInActivity, MainActivity.class);
            startActivity(i);
        }
        else
        {
            // No user is signed in
        }

    }

    public void onLogInButtonPressed (View v)
    {
        if (signInEmail.getText().toString().equals("") || signInPassword.getText().toString().equals(""))
        {
            Toast.makeText(logInActivity, "Enter Information", Toast.LENGTH_SHORT).show();
        }
        else
        {
            mAuth.signInWithEmailAndPassword(signInEmail.getText().toString(), signInPassword.getText().toString()).addOnCompleteListener(this, new OnCompleteListener<AuthResult>()
            {
                @Override
                public void onComplete(@NonNull Task<AuthResult> task)
                {
                    if (task.isSuccessful())
                    {
                        // Sign in success, update UI with the signed-in user's information
                        Core.currentUser = mAuth.getCurrentUser();
                        Intent i = new Intent(logInActivity, MainActivity.class);
                        logInActivity.startActivity(i);
                    }
                    else
                    {
                        // If sign in fails, display a message to the user.
                        Toast.makeText(logInActivity, "Authentication failed.",Toast.LENGTH_SHORT).show();
                    }
                }
            });

        }
    }

    public void onCreateAccountButtonPressed (View v)
    {
        Intent i = new Intent (this, SignUp.class);
        startActivity(i);
    }
}
