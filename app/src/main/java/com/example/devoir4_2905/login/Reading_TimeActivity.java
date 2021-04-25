package com.example.devoir4_2905.login;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.NumberPicker;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.devoir4_2905.Humeur;
import com.example.devoir4_2905.R;


public class Reading_TimeActivity extends AppCompatActivity {

    TextView ignore2;
    TextView language;
    ImageButton arrow_left3;
    ImageButton arrow_right3;
    Button days;
    Button weeks;
    NumberPicker picker;
    Button months;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reading_time);


        picker = findViewById(R.id.number_picker);
        ignore2 = findViewById(R.id.ignore2);
        language = findViewById(R.id.language2);
        arrow_left3 = findViewById(R.id.arrow_left3);
        arrow_right3= findViewById(R.id.arrow_right3);
        days= findViewById(R.id.days);
        weeks = findViewById(R.id.weeks);
        months= findViewById(R.id.months);



        picker.setMinValue(0);
        picker.setMaxValue(1000000);



        arrow_right3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent moodActivity= new Intent(Reading_TimeActivity.this, Humeur.class);
                startActivity(moodActivity);

            }
        });
        arrow_left3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent preference = new Intent(Reading_TimeActivity.this, Reading_preferencesActivity.class);
                startActivity(preference);

            }
        });
        ignore2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent moodActivity = new Intent(Reading_TimeActivity.this, Humeur.class);
                startActivity(moodActivity);
            }
        });
        language.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Reading_TimeActivity.this, "Désolé cette fonctionnalité n'a pas été implementée", Toast.LENGTH_LONG).show();

            }
        });
        days.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Reading_TimeActivity.this, "Désolé cette fonctionnalité n'a pas été implementée", Toast.LENGTH_LONG).show();

            }
        });
        weeks.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Reading_TimeActivity.this, "Désolé cette fonctionnalité n'a pas été implementée", Toast.LENGTH_LONG).show();

            }
        });
        months.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Reading_TimeActivity.this, "Désolé cette fonctionnalité n'a pas été implementée", Toast.LENGTH_LONG).show();

            }
        });



    }
}
