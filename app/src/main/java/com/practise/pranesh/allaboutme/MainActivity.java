package com.practise.pranesh.allaboutme;

import android.content.Intent;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private long BackPressed;
    FloatingActionButton floatingActionButton;
    ImageView google, linkedin, github, twitter;
    ImageView profilepic;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        floatingActionButton = findViewById(R.id.actionView_FP_nextPage);
        google = findViewById(R.id.googleIcon);
        linkedin = findViewById(R.id.linkedInIcon);
        github = findViewById(R.id.githubIcon);
        twitter = findViewById(R.id.twitterIcon);
        profilepic = findViewById(R.id.my_Profile_Picture);


        floatingActionButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                startActivity(new Intent(MainActivity.this, EducationPage.class));
            }
        });


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
