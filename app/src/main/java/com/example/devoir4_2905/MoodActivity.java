package com.example.devoir4_2905;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;


/**
 * Creer une BD qui va stocker les humeurs validées chaque
 * jour pour que cette interface soit effective
 */


public class MoodActivity extends AppCompatActivity {
    private View journalier;
    private View humeur;
    private View time;

    @SuppressLint("WrongViewCast")
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mood);
        journalier=findViewById(R.id.selection);
        time=findViewById(R.id.time);
        humeur= findViewById(R.id.reg);
        //temps.setText(toString(time));
    }
}