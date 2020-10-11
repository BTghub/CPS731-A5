package com.example.recyclerview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;

import java.util.Timer;
import java.util.TimerTask;

public class OpeningSplashActivity extends AppCompatActivity {
    MediaPlayer md;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_opening_splash);
        TimerTask task = new TimerTask() {

            @Override
            public void run() {
                md.stop();
                finish();
                startActivity(new Intent(OpeningSplashActivity.this, FilmTitleListActivity.class));
            }
        };

        md = MediaPlayer.create(this, R.raw.ffsound);
        md.start();

        Timer opening = new Timer();
        opening.schedule(task, 5000);
    }
}