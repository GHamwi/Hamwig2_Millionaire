package com.example.hamwig2_millionaire;

/**************** Created by George B. Hamwi Project 3 *******************/

import android.content.Intent;
import android.os.Handler;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

/* This is for the splash screen it will initially show when he user launches the application */
public class Splash_Screen extends AppCompatActivity {

    /* This is the variable to set splash time */
    private static int SPLASH_TIME_OUT = 3000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        /* New handler to delay the home screen (mainactivity) and to view a splash screen  */
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                /* Creates new intent for the splash screen to start at the splash screen (Splash_Screen) and move to the home screen (MainActivity) */
                Intent i = new Intent(Splash_Screen.this, question1.class);

                /* Initiates the intent */
                startActivity(i);

                /* This ends the activity  */
                finish();
            }
        }, SPLASH_TIME_OUT);
    }
}