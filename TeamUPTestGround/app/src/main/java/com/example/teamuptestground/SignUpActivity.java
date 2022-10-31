package com.example.teamuptestground;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.util.Patterns;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class SignUpActivity extends AppCompatActivity {


    EditText name, email, password;
    Button button_signup, button_login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        name = findViewById(R.id.name);
        email = findViewById(R.id.email);
        password = findViewById(R.id.password);
        button_signup = findViewById(R.id.button_signup);
        button_login=findViewById(R.id.button_login);

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
            if(number && lowercase && uppercase)
                return true;
        }
        return false;
    }

    public void VerifyData(){
        if (isEmpty(name)){
            Toast toast = Toast.makeText(this,"Precisa de inserir o nome para criar conta", Toast.LENGTH_SHORT);
            toast.show();
        }
        else if (isEmpty(email)){
            Toast toast = Toast.makeText(this,"Precisa de inserir o email para criar conta", Toast.LENGTH_SHORT);
            toast.show();
    }
        else if(isEmail(email)==false){
            Toast toast = Toast.makeText(this,"Precisa de inserir um email válido.",Toast.LENGTH_SHORT);
            toast.show();
        }
        else if (isEmpty(password)){
            Toast toast = Toast.makeText(this,"Precisa de inserir a palavra-passe para criar conta", Toast.LENGTH_SHORT);
            toast.show();
        }
        else if (!StrongPassword(password)==false){
            Toast toast = Toast.makeText(this,"Palavra-passe necessita de ter pelo menos uma letra maiscula, uma miniscula e um numero.",Toast.LENGTH_SHORT);
            toast.show();
        }
    }
}
