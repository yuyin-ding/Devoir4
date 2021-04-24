package com.example.devoir4_2905.login;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.devoir4_2905.R;

public class Reading_preferencesActivity extends AppCompatActivity {

    ScrollView scrollView;
    TextView ignore;
    TextView language;
    ImageButton arrow_leftt;
    ImageButton arrow_rightt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reading_preferences);


        ignore = findViewById(R.id.ignore);
        language = findViewById(R.id.language1);
        arrow_leftt = findViewById(R.id.arrow_leftt);
        arrow_rightt= findViewById(R.id.arrow_rightt);

        scrollView = findViewById(R.id.scroll);
        //Hide the Scollbar
        scrollView.setHorizontalScrollBarEnabled(true);

        arrow_rightt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent readingTime = new Intent(Reading_preferencesActivity.this, Reading_TimeActivity.class);
                startActivity(readingTime);

            }
        });
        arrow_leftt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent createAccount2 = new Intent(Reading_preferencesActivity.this, Create_AccountActivity.class);
                startActivity(createAccount2);

            }
        });
        ignore.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent readingTime = new Intent(Reading_preferencesActivity.this, Reading_TimeActivity.class);
                startActivity(readingTime);
            }
        });
        language.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Reading_preferencesActivity.this, "Désolé cette fonctionnalité n'a pas été implementée", Toast.LENGTH_LONG).show();

            }
        });



    }
}
