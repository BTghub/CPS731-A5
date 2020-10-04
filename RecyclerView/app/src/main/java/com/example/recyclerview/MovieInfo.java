package com.example.recyclerview;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.media.Image;
import android.os.Build;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.widget.Toolbar;

public class MovieInfo extends AppCompatActivity {
    final Integer[] covers = new Integer[]{R.drawable.f1,R.drawable.f2,R.drawable.f3,R.drawable.f4,R.drawable.f5,R.drawable.f6,R.drawable.f7,R.drawable.f8};
    final String characters = "Dominic Toretto\n\t\t\tLetty Ortiz\n\t\t\tMia toretto\n\t\t\tBrian O'Conner\n\t\t\tVince\n\t\t\tJesse\n\t\t\tLeon\n\t\t\tHan Lue";
    int position = 0;
    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_movie_info);
        // Setup toolbar to return to previous activity
        Toolbar toolbar = findViewById(R.id.toolbar);
        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
        // Get position from previous activity
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            position = extras.getInt("key");
        }
        // Set cover image and text
        ImageView img = findViewById(R.id.movieCover);
        img.setScaleType(ImageView.ScaleType.FIT_CENTER);
        img.setImageResource(covers[position]);
        TextView charList = findViewById(R.id.characterList);
        charList.setText("Main characters:\n\t\t\t" + characters);
    }
}