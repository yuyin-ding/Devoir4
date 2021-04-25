package com.example.devoir4_2905;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;


public class Before_leaving  extends AppCompatActivity {

    private Button call;
    private Button sick;
    private Button happy;
    private Button calm;
    private Button angry;
    private Button chock;
    private Button sad;
    private Button bored;
    private Button pensive;
    private Button sexy;
    private Button neutral;
    private Button love;
    private Button crying;
    private Button plus;
    //barre
    private Button searchPage;
    private Button accueilPage;
    private Button readingPage;
    private Button historyPage;
    private Button plusPage;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_leaving);

        call=findViewById(R.id.call);
        sick=findViewById(R.id.sick);
        happy=findViewById(R.id.happy);
        calm=findViewById(R.id.ange);
        angry=findViewById(R.id.angry);
        chock=findViewById(R.id.choque);
        sad=findViewById(R.id.sad);
        bored=findViewById(R.id.bored);
        pensive=findViewById(R.id.pensif);
        sexy=findViewById(R.id.coquin);
        neutral=findViewById(R.id.neutre);
        love=findViewById(R.id.love);
        crying=findViewById(R.id.bad);
        plus=findViewById(R.id.more);

        //la barre

        searchPage = findViewById(R.id.research);
        accueilPage = findViewById(R.id.home);
        readingPage = findViewById(R.id.discover);
        historyPage = findViewById(R.id.history);
        plusPage = findViewById(R.id.plus);


        call.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent callActivity = new Intent(Before_leaving.this, Appel.class);
                startActivity(callActivity);           //directement lancer l'appel?
            }
        });
        sick.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("WrongConstant")
            @Override
            public void onClick(View v) {
                Intent sickActivity = new Intent(Before_leaving.this, Acceuil.class);
                startActivity(sickActivity);
            }
        });
        happy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent happyActivity = new Intent(Before_leaving.this, Acceuil.class);
                startActivity(happyActivity);
            }
        });

        sad.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent sadActivity = new Intent(Before_leaving.this, Acceuil.class);
                startActivity(sadActivity);
            }
        });

        angry.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent angryActivity = new Intent(Before_leaving.this, Acceuil.class);
                startActivity(angryActivity);
            }
        });


        calm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent calmActivity = new Intent(Before_leaving.this, Acceuil.class);
                startActivity(calmActivity);
            }
        });

        crying.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent cryingActivity = new Intent(Before_leaving.this, Acceuil.class);
                startActivity(cryingActivity);
            }
        });

        chock.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent chockActivity = new Intent(Before_leaving.this, Acceuil.class);
                startActivity(chockActivity);
            }
        });

        bored.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent boredActivity = new Intent(Before_leaving.this, Acceuil.class);
                startActivity(boredActivity);
            }
        });

        pensive.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent pensiveActivity = new Intent(Before_leaving.this, Acceuil.class);
                startActivity(pensiveActivity);
            }
        });
        sexy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent sexyActivity = new Intent(Before_leaving.this, Acceuil.class);
                startActivity(sexyActivity);
            }
        });

        love.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent loveActivity = new Intent(Before_leaving.this, Acceuil.class);
                startActivity(loveActivity);
            }
        });

        neutral.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent neutralActivity = new Intent(Before_leaving.this, Acceuil.class);  // à modifier
                startActivity(neutralActivity);
            }
        });

        plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Before_leaving.this, "Désolé cette fonctionnalité n'a pas été implementée", Toast.LENGTH_LONG).show();
            }
        });
        //la barre

        searchPage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Decouvrir = new Intent(Before_leaving.this, Decouvrir.class);
                startActivity(Decouvrir);
            }
        });

        accueilPage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Acceuil = new Intent(Before_leaving.this, Acceuil.class);
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
                Intent Plus = new Intent(Before_leaving.this, Plus.class);
                startActivity(Plus);
            }
        });





    }

}
