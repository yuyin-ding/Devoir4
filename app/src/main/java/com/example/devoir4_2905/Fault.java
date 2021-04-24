package com.example.devoir4;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RatingBar;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class Fault extends AppCompatActivity {
    RatingBar rating;
    Button book;
    float mine=0;
    private Button fav;  // TODO: coder la bd pour rajouter
    // les livres après fav

    //barre
    private Button searchPage;
    private Button accueilPage;
    private Button readingPage;
    private Button historyPage;
    private Button plusPage;
    private Button john;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.livre_tfios);
        //la barre
        searchPage = findViewById(R.id.research);
        accueilPage = findViewById(R.id.home);
        readingPage = findViewById(R.id.readingButton);
        historyPage = findViewById(R.id.history);
        plusPage = findViewById(R.id.plus);
        fav= findViewById(R.id.fav);
        rating= findViewById(R.id.rating);
        book= findViewById(R.id.bookRec2);
        john= findViewById(R.id.john);


        rating.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {

            @Override
            public void onRatingChanged(RatingBar ratingBar, float rating, boolean fromUser) {
                int stars =(int) rating;
                String message= null;
                mine= (float) ratingBar.getRating();
                switch (stars){
                    case 1:
                        message= "Sorry, we will do better!";
                        break;
                    case 2:
                        message= "we have better suggestions!";
                        break;
                    case 3:
                        message= "Good!";
                        break;
                    case 4:
                        message= "Great!";
                        break;
                    case 5:
                        message= "Awesome!";
                        break;
                }
                Toast.makeText(Fault.this, message, Toast.LENGTH_SHORT).show();
            }
        });

        //la barre

        searchPage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Decouvrir = new Intent(Fault.this, Decouvrir.class);
                startActivity(Decouvrir);
            }
        });

        accueilPage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Accueil = new Intent(Fault.this, Acceuil.class);
                startActivity(Accueil);
            }
        });

        readingPage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Fault.this, "Désolé cette fonctionnalité n'a pas été implementée", Toast.LENGTH_LONG).show();

            }
        });

        historyPage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Historique = new Intent(Fault.this, BiblioHistory.class);
                startActivity(Historique);
            }
        });

        plusPage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Plus = new Intent(Fault.this, Plus.class);
                startActivity(Plus);
            }
        });

//        fav.setOnClickListener();

        book.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Fault.this, "Désolé cette fonctionnalité n'a pas été implementée", Toast.LENGTH_LONG).show();

            }
        });

        john.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Fault.this, "Désolé cette fonctionnalité n'a pas été implementée", Toast.LENGTH_LONG).show();

            }
        });
    }
}


