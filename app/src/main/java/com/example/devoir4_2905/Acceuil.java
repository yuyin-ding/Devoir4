package com.example.devoir4_2905;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Acceuil extends AppCompatActivity{

    //la barre
    private Button searchPage;
    private Button accueilPage;
    private Button readingPage;
    private Button historyPage;
    private Button plusPage;
    private Button books;             // a changer dans l'implémentation finale
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_acceuil);

        try{
            this.getSupportActionBar().hide();
        }
        catch (NullPointerException e){}
        books = findViewById(R.id.bookCov);
        searchPage = findViewById(R.id.research);
        accueilPage = findViewById(R.id.home);
        readingPage = findViewById(R.id.discover);
        historyPage = findViewById(R.id.history);
        plusPage = findViewById(R.id.plus);



        //la barre

        books.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Toast.makeText(Acceuil.this, "Désolé cette fonctionnalité n'a pas été implementée",
                            Toast.LENGTH_LONG).show();

                }
        });

        searchPage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Decouvrir = new Intent(Acceuil.this, Decouvrir.class);
                startActivity(Decouvrir);
            }
        });

        accueilPage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Acceuil = new Intent(Acceuil.this, Acceuil.class);
                startActivity(Acceuil);
            }
        });


       /* readingPage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Acceuil.this, "Désolé cette fonctionnalité n'a pas été implementée", Toast.LENGTH_LONG).show();

            }
        });*/

        historyPage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent BiblioHistory = new Intent(Acceuil.this, BiblioHistory.class);
                startActivity(BiblioHistory);
            }
        });

        plusPage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Plus = new Intent(Acceuil.this, Plus.class);
                startActivity(Plus);
            }
        });


    }
}
