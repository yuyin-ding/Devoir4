package com.example.devoir4_2905;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.textfield.TextInputEditText;

public class BookSuggestion extends AppCompatActivity {

    private TextView bookSuggestionPage;
    private TextView languagee;
    private ImageButton bookRec;
    private ImageButton bookRec2;
    private ImageButton search;
    private TextInputEditText inputSearch;
    //barre
    private Button searchPage;
    private Button accueilPage;
    private Button readingPage;
    private Button historyPage;
    private Button plusPage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_book_suggestion);

        languagee= findViewById(R.id.languagee);
        bookSuggestionPage = findViewById(R.id.bookSuggestion);
        bookRec = findViewById(R.id.bookRec1);
        bookRec2 = findViewById(R.id.bookRec2);
        search = findViewById(R.id.bellButton);
        inputSearch = findViewById(R.id.inputText);

        //la barre

        searchPage = findViewById(R.id.research);
        accueilPage = findViewById(R.id.home);
        readingPage = findViewById(R.id.discover);
        historyPage = findViewById(R.id.history);
        plusPage = findViewById(R.id.plus);


        languagee.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(BookSuggestion.this,"Désolé cette fonctionnalité n'a pas été implementée", Toast.LENGTH_LONG).show();

            }
        });
        //la barre

        searchPage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Decouvrir = new Intent(BookSuggestion.this, Decouvrir.class);
                startActivity(Decouvrir);
            }
        });

        accueilPage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Accueil = new Intent(BookSuggestion.this, Acceuil.class);
                startActivity(Accueil);
            }
        });

        readingPage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(BookSuggestion.this, "Désolé cette fonctionnalité n'a pas été implementée", Toast.LENGTH_LONG).show();

            }
        });

        historyPage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Historique = new Intent(BookSuggestion.this, BiblioHistory.class);
                startActivity(Historique);
            }
        });

        plusPage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Plus = new Intent(BookSuggestion.this, Plus.class);
                startActivity(Plus);
            }
        });

        bookSuggestionPage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent BookSugges= new Intent(BookSuggestion.this,BookSuggestion.class);
                startActivity(BookSugges);
            }
        });
        bookRec.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(BookSuggestion.this, "Désolé cette fonctionnalité n'a pas été implementée", Toast.LENGTH_LONG).show();

            }
        });

        bookRec2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(BookSuggestion.this, "Désolé cette fonctionnalité n'a pas été implementée", Toast.LENGTH_LONG).show();

            }
        });

        search.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(BookSuggestion.this, "Désolé cette fonctionnalité n'a pas été implementée", Toast.LENGTH_LONG).show();

            }
        });

        inputSearch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(BookSuggestion.this, "Désolé cette fonctionnalité n'a pas été implementée", Toast.LENGTH_LONG).show();

            }
        });

    }
}