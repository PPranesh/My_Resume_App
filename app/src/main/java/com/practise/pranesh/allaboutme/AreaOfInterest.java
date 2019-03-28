package com.practise.pranesh.allaboutme;

import android.content.Intent;
import android.support.v4.app.NavUtils;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import java.util.Objects;

public class AreaOfInterest extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_area_of_interest);

        Objects.requireNonNull(getSupportActionBar()).setTitle("Area Of Interest");

    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.forward_page,menu);
        return true;
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){

            case R.id.forward:
                startActivity(new Intent(AreaOfInterest.this, about.class));
                break;
        }
        return true;
    }

    public void AreaOfInterestEdit(View view) {
        Toast.makeText(getApplicationContext(), "You can't edit", Toast.LENGTH_SHORT).show();
    }
}
