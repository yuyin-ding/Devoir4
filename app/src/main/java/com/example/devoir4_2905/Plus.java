package com.example.devoir4_2905;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class Plus extends AppCompatActivity {

    //la barre
    private Button searchPage;
    private Button accueilPage;
    private Button readingPage;
    private Button historyPage;
    private Button plusPage;

    private LinearLayout plusForum;
    private LinearLayout plusSettings;
    private LinearLayout plusAppel;
    private LinearLayout plusSuggestionBook;
    private LinearLayout plusFavoris;
    private LinearLayout plusAudio;
    private LinearLayout plusHelp;
    private LinearLayout plusmoodTracker;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_plus);
        try{
            this.getSupportActionBar().hide();
        }
        catch (NullPointerException e){}



        plusPage = findViewById(R.id.plus);
        plusForum=findViewById(R.id.goToForum);
        plusSettings=findViewById(R.id.goToSettings);
        plusAppel=findViewById(R.id.goToAppel);
        plusSuggestionBook=findViewById(R.id.goToBookSuggestion);
        plusFavoris=findViewById(R.id.goToFavoris);
        plusAudio=findViewById(R.id.goToAudioBook);
        plusHelp=findViewById(R.id.goToHelp);
        plusmoodTracker=findViewById(R.id.goToMoodTrack);


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
                Toast.makeText(Acceuil.this, "D??sol?? cette fonctionnalit?? n'a pas ??t?? implement??e", Toast.LENGTH_LONG).show();

            }
        });*/

        historyPage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent BiblioHistory = new Intent(Plus.this, BiblioHistory.class);
                startActivity(BiblioHistory);
            }
        });

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
                Toast.makeText(Plus.this, "D??sol?? cette fonctionnalit?? n'a pas ??t?? implement??e", Toast.LENGTH_LONG).show();
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
                Toast.makeText(Plus.this, "D??sol?? cette fonctionnalit?? n'a pas ??t?? implement??e", Toast.LENGTH_LONG).show();
            }
        });

    }
}
