package com.example.devoir4_2905;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.devoir4_1.login.Reading_TimeActivity;

public class Tracking extends AppCompatActivity {
    private TextView min;
    private TextView goal;
    private Reading_TimeActivity goalSet;
    private TextView book;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tracking);
        min=findViewById(R.id.minutes);
        goal=findViewById(R.id.goals);
        //goal= goalSet.getTime;
    }

    /**
     * Compter le nombre de temps de lecture
     * des que l'utilisateur ouvre le livre, lancer le chrono et se termine lorsqu'il le ferme)
     */
    public void count (){
//
    }

}
