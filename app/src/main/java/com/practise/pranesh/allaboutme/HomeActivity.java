package com.practise.pranesh.allaboutme;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.media.Image;
import android.net.Uri;
import android.provider.MediaStore;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import java.util.Objects;

import technolifestyle.com.imageslider.FlipperLayout;
import technolifestyle.com.imageslider.FlipperView;

public class HomeActivity extends AppCompatActivity {

    FlipperLayout flipperLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);


//        reference link => "https://www.youtube.com/watch?v=HHwH3VHYq2A"   YouTube Channel : Coding in Flow
//        starts Here
        flipperLayout = (FlipperLayout) findViewById(R.id.FlipperImages);
        setLayout();




    }

    private void setLayout() {

        int images[] = new int[]{R.drawable.image_1, R.drawable.image_2, R.drawable.image_3, R.drawable.image_4};
        for (int i = 0; i < 4; i++) {
            FlipperView view = new FlipperView(getBaseContext());
            view.setImageDrawable(images[i]);
            flipperLayout.addFlipperView(view);
            view.setOnFlipperClickListener(new FlipperView.OnFlipperClickListener() {
                @Override
                public void onFlipperClick(FlipperView flipperView) {
                    startActivity(new Intent(HomeActivity.this, FirstPage.class));
                }
            });
        }


    }

//    Ends Here
}
