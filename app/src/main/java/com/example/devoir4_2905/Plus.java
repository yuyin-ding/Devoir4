package com.example.devoir4_2905;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class Plus extends AppCompatActivity {

    //la barre
    private Button searchPage;
    private Button accueilPage;
    private Button readingPage;
    private Button historyPage;
    private Button plusPage;

    private Button plusForum;
    private Button plusSettings;
    private Button plusAppel;
    private Button plusSuggestionBook;
    private Button plusFavoris;
    private Button plusAudio;
    private Button plusHelp;
    private Button plusmoodTracker;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_plus);



        plusPage = findViewById(R.id.plus);
        plusForum=findViewById(R.id.plusForum);
        plusSettings=findViewById(R.id.plusSetting);
        plusAppel=findViewById(R.id.plusAppel);
        plusSuggestionBook=findViewById(R.id.plusBookSuggestion);
        plusFavoris=findViewById(R.id.plusFavoris);
        plusAudio=findViewById(R.id.plusAudioBook);
        plusHelp=findViewById(R.id.plusHelp);
        plusmoodTracker=findViewById(R.id.plusMood);


        searchPage = findViewById(R.id.research);
        accueilPage = findViewById(R.id.home);
        readingPage = findViewById(R.id.discover);
        historyPage = findViewById(R.id.history);

        //la barre

        searchPage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Decouvrir = new Intent(Plus.this, Decouvrir.class);
                startActivity(Decouvrir);
            }
        });

        accueilPage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Acceuil = new Intent(Plus.this, Acceuil.class);
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
                Intent Plus = new Intent(Plus.this, Plus.class);
                startActivity(Plus);
            }
        });

        plusPage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Plus = new Intent(Plus.this, Plus.class);
                startActivity(Plus);
            }
        });
        plusForum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent forum = new Intent(Plus.this, Forum.class);
                startActivity(forum);

            }
        });
        plusSettings.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Plus.this, "Désolé cette fonctionnalité n'a pas été implementée", Toast.LENGTH_LONG).show();
            }
        });
        plusAppel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent forum = new Intent(Plus.this, Appel.class);
                startActivity(forum);

            }
        });
        plusmoodTracker.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent forum = new Intent(Plus.this, MoodJava.class);
                startActivity(forum);

            }
        });
        plusFavoris.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent forum = new Intent(Plus.this, Favoris.class);
                startActivity(forum);

            }
        });
        plusForum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent forum = new Intent(Plus.this, Forum.class);
                startActivity(forum);

            }
        });
        plusSuggestionBook.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent forum = new Intent(Plus.this, BookSuggestion.class);
                startActivity(forum);

            }
        });
        plusAudio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent forum = new Intent(Plus.this, AudioBook.class);
                startActivity(forum);

            }
        });
        plusHelp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Plus.this, "Désolé cette fonctionnalité n'a pas été implementée", Toast.LENGTH_LONG).show();
            }
        });

    }
}
