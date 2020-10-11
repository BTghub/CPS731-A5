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


public class MovieInfo extends AppCompatActivity {
    final Integer[] covers = new Integer[]{R.drawable.f1,R.drawable.f2,R.drawable.f3,R.drawable.f4,R.drawable.f5,R.drawable.f6,R.drawable.f7,R.drawable.f8};
    final String[][] mainCharacters = new String[][]{
            {"Dominic Toretto", "Brian O'Connor", "Letty Ortiz", "Mia Toretto", "Vince"},
            {"Brian O'Connor", "Roman Pearce", "Tej Parker"},
            {"Sean Boswell", "Han Seoul-Oh"},
            {"Dominic Toretto", "Brian O'Connor", "Letty Ortiz", "Mia Toretto", "Han Seoul-Oh", "Gisele Yashar"},
            {"Dominic Toretto", "Brian O'Connor", "Letty Ortiz", "Mia Toretto", "Han Seoul-Oh", "Gisele Yashar", "Roman Pearce", "Tej Parker", "Luke Hobbs", "Vince"},
            {"Dominic Toretto", "Brian O'Connor", "Letty Ortiz", "Mia Toretto", "Han Seoul-Oh", "Gisele Yashar", "Roman Pearce", "Tej Parker", "Luke Hobbs"},
            {"Dominic Toretto", "Brian O'Connor", "Letty Ortiz", "Mia Toretto", "Roman Pearce", "Tej Parker", "Luke Hobbs"},
            {"Dominic Toretto", "Letty Ortiz", "Roman Pearce", "Tej Parker", "Luke Hobbs"}
    };
    int position = 0;
    String characters = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_movie_info);
        // Setup toolbar to return to previous activity
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        // Get position from previous activity
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            position = extras.getInt("key");
        }
        // Set cover image and text
        ImageView img = findViewById(R.id.movieCover);
        img.setScaleType(ImageView.ScaleType.FIT_XY);
        img.setImageResource(covers[position]);
        TextView charList = findViewById(R.id.characterList);

        for(String s : mainCharacters[position]){
            characters += "\t\t\t\t" + s + "\n";
        }

        charList.setText("Main characters:\n" + characters);
    }
}