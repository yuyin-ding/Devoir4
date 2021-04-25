 package com.example.devoir4_2905.login;

import android.content.Intent;
import android.os.Bundle;

import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;


import com.example.devoir4_2905.Humeur;
import com.example.devoir4_2905.R;
import com.google.android.material.textfield.TextInputLayout;

public class LoginActivity extends AppCompatActivity {

    private TextView language;
    private TextView createAccount;
    private TextView forgotPassword;
    private TextInputLayout textInputEmail;
    private TextInputLayout textInputPassword;


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        try{
            this.getSupportActionBar().hide();
        }
        catch (NullPointerException e){}

        createAccount=findViewById(R.id.createAccount);
        forgotPassword=findViewById(R.id.forgot_password);
        language =findViewById(R.id.language);
        textInputEmail = findViewById(R.id.email);
        textInputPassword = findViewById(R.id.password);

        language.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(LoginActivity.this, "Désolé cette fonctionnalité n'a pas été implementée", Toast.LENGTH_LONG).show();

            }
        });
        forgotPassword.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(LoginActivity.this, "Désolé cette fonctionnalité n'a pas été implementée", Toast.LENGTH_LONG).show();

            }
        });




    }
    boolean validateEmail(){
        String emailInput = textInputEmail.getEditText().getText().toString().trim();

        if(emailInput.isEmpty()){
            textInputEmail.setError("This field is required");
            return false;
        }else{
            textInputEmail.setError(null);
            return true;
        }
    }
    private boolean validatePassword(){
        String passwordInput = textInputPassword.getEditText().getText().toString().trim();
        if(passwordInput.isEmpty()){
            textInputPassword.setError("This field is required");
            return false;
        }else if(passwordInput.length()<8){
            textInputPassword.setError("Password to short.\n" +"Your password must contain a maximum of 8 characters");
            return false;
        }else{
            textInputPassword.setError(null);
            return true;
        }

    }
    public void confirmInput(View v){
        if(!validateEmail()| !validatePassword()){
            return;
        }
        Intent moodActivity = new Intent(LoginActivity.this, Humeur.class);
        startActivity(moodActivity);

    }
    public void createAccount(View v){
        Intent createAccountActivity = new Intent(LoginActivity.this, Create_AccountActivity.class);
        startActivity(createAccountActivity);
    }


}
