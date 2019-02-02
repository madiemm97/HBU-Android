package com.example.csc518;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    TextView test, test2;
    Button b;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.test = (TextView)findViewById(R.id.textView);
        this.test2 = (TextView)findViewById(R.id.textView2);
        this.b = (Button)findViewById(R.id.button);

    }

    public void onButtonPressed(View v)
    {
        Intent i = new Intent(this, MyOtherActivity.class);
        this.startActivity(i);
        //startActivity(new Intent(MainActivity.this, MyOtherActivity.class));
    }
}
