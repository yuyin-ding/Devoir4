package com.example.devoir4;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.devoir4.login.Reading_TimeActivity;

public class Tracking extends AppCompatActivity {
    private TextView min;
    private TextView goal;
    private Reading_TimeActivity goalSet;
    private TextView book;
    private ImageButton arrowLeft;
    private ImageButton arrowRight;
    //barre
    private Button searchPage;
    private Button accueilPage;
    private Button readingPage;
    private Button historyPage;
    private Button plusPage;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tracking);
        min=findViewById(R.id.minutes);
        goal=findViewById(R.id.goals);
        //goal= goalSet.getTime;
        //la barre

        searchPage = findViewById(R.id.research);
        accueilPage = findViewById(R.id.home);
        readingPage = findViewById(R.id.discover);
        historyPage = findViewById(R.id.history);
        plusPage = findViewById(R.id.plus);
        arrowLeft= findViewById(R.id.arrow_left2);
        arrowRight= findViewById(R.id.arrow_right2);


        arrowLeft.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent left = new Intent(Tracking.this, MoodJava.class);
                startActivity(left);
            }
        });
        arrowRight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent left = new Intent(Tracking.this, Acceuil.class);
                startActivity(left);
            }
        });

        //la barre

        searchPage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Decouvrir = new Intent(Tracking.this, Decouvrir.class);
                startActivity(Decouvrir);
            }
        });

        accueilPage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Acceuil = new Intent(Tracking.this, Acceuil.class);
                startActivity(Acceuil);
            }
        });

/*
        readingPage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Acceuil.this, "Désolé cette fonctionnalité n'a pas été implementée", Toast.LENGTH_LONG).show();

            }
        });

        historyPage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent BiblioHistory = new Intent(Acceuil.this, BiblioHistory.class);
                startActivity(BiblioHistory);
            }
        });*/

        plusPage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Plus = new Intent(Tracking.this, Plus.class);
                startActivity(Plus);
            }
        });





    }





    /**
     * Compter le nombre de temps de lecture
     * des que l'utilisateur ouvre le livre, lancer le chrono et se termine lorsqu'il le ferme)
     */
    public void count (){
//
    }

}
