package com.example.devoir4_2905;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class BiblioHistory extends AppCompatActivity {

    //la barre
    private Button searchPage;
    private Button accueilPage;
    private Button readingPage;
    private Button historyPage;
    private Button plusPage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_biblio_history);

        searchPage = findViewById(R.id.research);
        accueilPage = findViewById(R.id.home);
        readingPage = findViewById(R.id.readingButton);
        historyPage = findViewById(R.id.history);
        plusPage = findViewById(R.id.plus);

        //la barre

        searchPage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Decouvrir = new Intent(BiblioHistory.this, Decouvrir.class);
                startActivity(Decouvrir);
            }
        });

        accueilPage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Acceuil = new Intent(BiblioHistory.this, Acceuil.class);
                startActivity(Acceuil);
            }
        });

        readingPage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(BiblioHistory.this, "Désolé cette fonctionnalité n'a pas été implementée", Toast.LENGTH_LONG).show();

            }
        });

        historyPage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent BiblioHistory = new Intent(BiblioHistory.this, BiblioHistory.class);
                startActivity(BiblioHistory);
            }
        });

        plusPage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Plus = new Intent(BiblioHistory.this, Plus.class);
                startActivity(Plus);
            }
        });
    }
}
