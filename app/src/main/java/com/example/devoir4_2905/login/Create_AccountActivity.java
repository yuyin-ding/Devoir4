package com.example.devoir4.login;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.devoir4.R;
import com.google.android.material.textfield.TextInputLayout;

public class Create_AccountActivity  extends AppCompatActivity {
    private ImageButton arrow_left;
    private TextInputLayout newEmail;
    private TextInputLayout newPassword;
    private TextInputLayout passwordConfirm;
    private TextInputLayout fullName;
    private CheckBox checkBox;
    private TextView language;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_account);

        fullName = findViewById(R.id.full_name);
        newEmail = findViewById(R.id.new_email);
        newPassword = findViewById(R.id.new_password);
        passwordConfirm = findViewById(R.id.confirm_password);
        arrow_left = findViewById(R.id.arrow_left);
        checkBox = findViewById(R.id.checkbox);
        language=findViewById(R.id.language);
        arrow_left.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent returnToLogin = new Intent(Create_AccountActivity.this, LoginActivity.class);
                startActivity(returnToLogin);

            }
        });
        language.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Create_AccountActivity.this, "Désolé cette fonctionnalité n'a pas été implementée", Toast.LENGTH_LONG).show();

            }
        });
    }

    boolean validateFullname() {
        String fullNameInput = fullName.getEditText().getText().toString().trim();

        if (fullNameInput.isEmpty()) {
            fullName.setError("This field is required");
            return false;
        } else {
            fullName.setError(null);
            return true;
        }
    }

    boolean validateNewEmail() {
        String newemailInput = newEmail.getEditText().getText().toString().trim();

        if (newemailInput.isEmpty()) {
            newEmail.setError("This field is required");
            return false;
        } else {
            newEmail.setError(null);
            return true;
        }
    }

    private boolean validateNewPassword() {
        String passwordInput = newPassword.getEditText().getText().toString().trim();
        if (passwordInput.isEmpty()) {
            newPassword.setError("This field is required");
            return false;
        } else if (passwordInput.length() < 8) {
            newPassword.setError("Password to short.\n" + "Your password must contain a maximum of 8 characters");
            return false;
        } else {
            newPassword.setError(null);
            return true;
        }

    }

    private boolean validateNewPasswordConfirm() {
        String passwordConfirmInput = passwordConfirm.getEditText().getText().toString().trim();
        String newPasswordInput = newPassword.getEditText().getText().toString().trim();
        if (passwordConfirmInput.isEmpty()) {
            passwordConfirm.setError("This field is required");
            return false;
        } else if (!(passwordConfirmInput.equals(newPasswordInput))) {

            passwordConfirm.setError("Password do not match");
            return false;
        } else {
            passwordConfirm.setError(null);
            return true;
        }

    }

    public boolean itemClicked() {
        if (!checkBox.isChecked()) {
            checkBox.setError("please read and accept the terms conditions before continuing ");
            return false;
        }
        return true;
    }


    public void confirmNewInput(View v){
        if(!validateNewEmail()| !validateNewPassword()|!validateNewPasswordConfirm()| !validateFullname() | !itemClicked() ){
            return;
        }
        Intent moodActivity = new Intent(Create_AccountActivity.this, Reading_preferencesActivity.class);
        startActivity(moodActivity);

    }



}
