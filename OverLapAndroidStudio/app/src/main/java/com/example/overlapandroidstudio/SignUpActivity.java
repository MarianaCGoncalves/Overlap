package com.example.overlapandroidstudio;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Patterns;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class SignUpActivity extends AppCompatActivity {


    EditText name, email, password;
    Button button_signup;
    TextView button_login_option;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        name = findViewById(R.id.name);
        email = findViewById(R.id.email);
        password = findViewById(R.id.password);
        button_signup = findViewById(R.id.button_signup);
        button_login_option=findViewById(R.id.button_login_option);

        //clica no texto "Já tem uma conta? Faça o Login!" e manda para o login
        button_login_option.setOnClickListener(view -> {
            Intent IntentLoginSignUp = new Intent(SignUpActivity.this, LoginActivity.class);
            startActivity(IntentLoginSignUp);
            finish();
        });
    }

    //função isEmpty verifica se a editText está vazia.
    public boolean isEmpty(EditText text){
        CharSequence str = text.getText().toString();
        return TextUtils.isEmpty(str);
    }

    //verifica se o email é válido.
    boolean isEmail(EditText text){
        CharSequence email= text.getText().toString();
        return (Patterns.EMAIL_ADDRESS.matcher(email).matches());
    }

    //função para verificar se a password tem pelo menos um caracter minisculo, um maiusculo e um numero.
    public boolean StrongPassword(EditText text){
        char chr;
        boolean uppercase= false,
                lowercase = false,
                number= false;

        for (int i= 0; i< text.length(); i++){
            chr = text.getEditableText().charAt(i);
            if(Character.isDigit(chr)){
                number=true;
            }
            else if (Character.isLowerCase(chr)){
                lowercase = true;
            }
            else if (Character.isUpperCase(chr)){
                uppercase = true;
            }
            if(number && lowercase && uppercase) {
                return true;
            }
        }
        return false;
    }

    public void VerifyData(View view){
        Toast toast;
        if (isEmpty(name)){
            toast = Toast.makeText(this,"Precisa de inserir o nome para criar conta", Toast.LENGTH_SHORT);
        }
        else if (isEmpty(email)){
            toast = Toast.makeText(this,"Precisa de inserir o email para criar conta", Toast.LENGTH_SHORT);
        }
        else if(!isEmail(email)){
            toast = Toast.makeText(this,"Precisa de inserir um email válido.",Toast.LENGTH_SHORT);
        }
        else if (isEmpty(password)){
            toast = Toast.makeText(this,"Precisa de inserir a palavra-passe para criar conta", Toast.LENGTH_SHORT);
        }
        else if (!StrongPassword(password)){
            toast = Toast.makeText(this,"Palavra-passe necessita de ter pelo menos uma letra maiscula, uma miniscula e um numero.",Toast.LENGTH_SHORT);
        }
        else{
            toast= Toast.makeText(this,"user registado",Toast.LENGTH_SHORT);
            String _name= name.getText().toString();
            String _email=email.getText().toString();
            String _password=password.getText().toString();
            User _user= new User(_name,_password,_email );

            try {
            RetrofitSignUpInterface retrofitSignUpInterface=
                    RetrofitService.getRetrofit().create(RetrofitSignUpInterface.class);
                retrofitSignUpInterface.RegisterUser(_name, _password, _email).enqueue(new Callback<Integer>() {
                @Override
                public void onResponse(Call<Integer> call, Response<Integer> response) {

                    int ida= response.body();
                    Intent SignUpTags = new Intent(SignUpActivity.this, UserTagsMainActivity.class);
                    SignUpTags.putExtra("ida",ida);
                    startActivity(SignUpTags);
                    finish();
                }

                @Override
                public void onFailure(Call<Integer> call, Throwable t) {

                }
            });

        }catch (Exception e){

        }
        }
        toast.show();
    }
}