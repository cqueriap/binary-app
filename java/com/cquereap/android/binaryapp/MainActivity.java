package com.cquereap.android.binaryapp;

import android.content.Intent;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    public Button google;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        google = (Button)findViewById(R.id.googleButton);
        google.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(MainActivity.this, GoogleActivity.class);
                startActivity(myIntent);
            }
        });


        Fragment fr = new IntroFragment();

        FragmentManager manager = getSupportFragmentManager();
        FragmentTransaction transaction = manager.beginTransaction();
        FragmentTransaction replace = transaction.replace(R.id.fragment, fr);
        transaction.commit();

    }
    //I am trying to make "IntroFragment" the default fragment.
    //"IntroFragment" will appear before any buttons are pushed.
    public void selectFrag(View view) {
        Fragment fr;


        if (view == findViewById(R.id.button))
            fr = new FragmentOne();

        else
            fr = new FragmentTwo();



        FragmentManager manager = getSupportFragmentManager();
        FragmentTransaction transaction = manager.beginTransaction();
        FragmentTransaction replace = transaction.replace(R.id.fragment, fr);
        transaction.commit();


    }
    
}
