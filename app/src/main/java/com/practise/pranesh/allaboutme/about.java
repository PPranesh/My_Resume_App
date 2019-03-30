package com.practise.pranesh.allaboutme;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

import java.util.Objects;

public class about extends AppCompatActivity {

    private long BackPressed;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);

//        reference link => "https://www.youtube.com/watch?v=JkVdP-e9BCo"   YouTube Channel : Coding in Flow
//        Starts here!
        Objects.requireNonNull(getSupportActionBar()).setTitle("About");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
//        Ends Here!

    }

    @Override
    public void onBackPressed() {

        if (BackPressed + 2000 > System.currentTimeMillis()) {
            super.onBackPressed();
            Toast.makeText(getBaseContext(), "Exited!!", Toast.LENGTH_SHORT).show();
            finish();
        } else {
            Toast.makeText(getBaseContext(), "Click again to Exit", Toast.LENGTH_SHORT).show();
        }
        BackPressed = System.currentTimeMillis();
    }

   }