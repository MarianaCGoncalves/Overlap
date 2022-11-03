package com.example.bottomtest;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class LoginActivity extends AppCompatActivity {

    EditText email;
    EditText password;
    Button button_login;
    Button button_signup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        email= findViewById(R.id.email);
        password= findViewById(R.id.password);
        button_login=findViewById(R.id.button_login);
        button_signup=findViewById(R.id.button_signup);

    }
}