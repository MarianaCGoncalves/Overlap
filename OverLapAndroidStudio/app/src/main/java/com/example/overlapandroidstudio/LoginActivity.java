package com.example.overlapandroidstudio;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class LoginActivity extends AppCompatActivity {

    EditText email;
    EditText password;
    Button button_login;
    TextView button_signup_option;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        email= findViewById(R.id.Loginemail);
        password= findViewById(R.id.Loginpassword);
        button_login=findViewById(R.id.Loginbutton_login);
        button_signup_option = findViewById(R.id.Login_signup_option);

        button_login.setOnClickListener(view -> {
            Intent IntentLoginHome = new Intent(LoginActivity.this, Main_MenuActivity.class);
            startActivity(IntentLoginHome);

        });

        button_signup_option.setOnClickListener(view -> {
            Intent IntentLoginSignUp = new Intent(LoginActivity.this, SignUpActivity.class);
            startActivity(IntentLoginSignUp);

        });
    }
}