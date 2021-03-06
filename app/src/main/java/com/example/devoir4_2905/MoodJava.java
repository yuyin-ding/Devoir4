package com.example.devoir4_2905;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;


public class MoodJava extends AppCompatActivity {

    private Button arrowRight;
    private View time;
    private View jour;
    private View mensuel;
    //barre
    private Button searchPage;
    private Button accueilPage;
    private Button readingPage;
    private Button historyPage;
    private Button plusPage;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mood);
        try{
            this.getSupportActionBar().hide();
        }
        catch (NullPointerException e){}

        //la barre

        searchPage = findViewById(R.id.research);
        accueilPage = findViewById(R.id.home);
        readingPage = findViewById(R.id.discover);
        historyPage = findViewById(R.id.history);
        plusPage = findViewById(R.id.plus);
        arrowRight = findViewById(R.id.arrow_right3);
        time= findViewById(R.id.time);
        jour= findViewById(R.id.selection);
        mensuel= findViewById(R.id.reg);


        arrowRight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent left = new Intent(MoodJava.this, Tracking.class);
                startActivity(left);
            }
        });
        //la barre

        searchPage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Decouvrir = new Intent(MoodJava.this, Decouvrir.class);
                startActivity(Decouvrir);
            }
        });

        accueilPage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Acceuil = new Intent(MoodJava.this, Acceuil.class);
                startActivity(Acceuil);
            }
        });

/*
        readingPage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Acceuil.this, "D??sol?? cette fonctionnalit?? n'a pas ??t?? implement??e", Toast.LENGTH_LONG).show();

            }
        });*/


        historyPage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent BiblioHistory = new Intent(MoodJava.this, BiblioHistory.class);
                startActivity(BiblioHistory);
            }
        });
        plusPage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Plus = new Intent(MoodJava.this, Plus.class);
                startActivity(Plus);
            }
        });

    }
}
