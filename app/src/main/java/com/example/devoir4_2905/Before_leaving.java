package com.example.devoir4_2905;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

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


        call.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent callActivity = new Intent(Before_leaving.this, Appel.class);
                startActivity(callActivity);           //directement lancer l'appel?
            }
        });
//
//        sick.setOnClickListener(new View.OnClickListener() {
//            @SuppressLint("WrongConstant")
//            @Override
//            public void onClick(View v) {
//
//                Intent sickActivity = new Intent(Before_leaving.this, Accueil.class); //modifier
//                startActivity(sickActivity);
//            }
//        });
//        happy.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent happyActivity = new Intent(Before_leaving.this, Accueil.class);  // à modifier
//                startActivity(happyActivity);
//            }
//        });
//
//        sad.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent sadActivity = new Intent(Before_leaving.this, Accueil.class);  // à modifier
//                startActivity(sadActivity);
//            }
//        });
//
//        angry.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent angryActivity = new Intent(Before_leaving.this, Accueil.class);  // à modifier
//                startActivity(angryActivity);
//            }
//        });
//
//
//        calm.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent calmActivity = new Intent(Before_leaving.this, Accueil.class);  // à modifier
//                startActivity(calmActivity);
//            }
//        });
//
//        crying.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent cryingActivity = new Intent(Before_leaving.this, Accueil.class);  // à modifier
//                startActivity(cryingActivity);
//            }
//        });
//
//        chock.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent chockActivity = new Intent(Before_leaving.this, Accueil.class);  // à modifier
//                startActivity(chockActivity);
//            }
//        });
//
//        bored.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent boredActivity = new Intent(Before_leaving.this, Accueil.class);  // à modifier
//                startActivity(boredActivity);
//            }
//        });
//
//        pensive.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent pensiveActivity = new Intent(Before_leaving.this, Accueil.class);  // à modifier
//                startActivity(pensiveActivity);
//            }
//        });
//        sexy.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent sexyActivity = new Intent(Before_leaving.this, Accueil.class);  // à modifier
//                startActivity(sexyActivity);
//            }
//        });
//
//        love.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent loveActivity = new Intent(Before_leaving.this, Accueil.class);  // à modifier
//                startActivity(loveActivity);
//            }
//        });
//
//        neutral.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent neutralActivity = new Intent(Before_leaving.this, Accueil.class);  // à modifier
//                startActivity(neutralActivity);
//            }
//        });
//
//
//        plus.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent plus = new Intent(Before_leaving.this, Accueil.class);  // à modifier
//                startActivity(plus);
//            }
//        });

    }

}
