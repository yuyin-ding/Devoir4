package com.example.devoir4_2905;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;

public class Forum extends AppCompatActivity {

    //la barre
    private Button searchPage;
    private Button accueilPage;
    private Button readingPage;
    private Button historyPage;
    private Button plusPage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forum);

        //la barre
        searchPage = findViewById(R.id.research);
        accueilPage = findViewById(R.id.home);
        readingPage = findViewById(R.id.readingButton);
        historyPage = findViewById(R.id.history);
        plusPage = findViewById(R.id.plus);

        //la barre

//        searchPage.setOnClickListener(new View.OnClickListener() {
//        @Override
//        public void onClick(View v) {
//            Intent Decouvrir = new Intent(AudioBook.this, Decouvrir.class);
//            startActivity(Decouvrir);
//        }
//        });

//        accueilPage.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent Accueil = new Intent(AudioBook.this, Accueil.class);
//                startActivity(Accueil);
//            }
//        });

//        readingPage.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Toast.makeText(AudioBook.this, "Désolé cette fonctionnalité n'a pas été implementée", Toast.LENGTH_LONG).show();
//
//            }
//        });

//        historyPage.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent Historique = new Intent(AudioBook.this, Historique.class);
//                startActivity(Historique);
//            }
//        });

//        plusPage.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent Plus = new Intent(AudioBook.this, Plus.class);
//                startActivity(Plus);
//            }
//        });
    }
}