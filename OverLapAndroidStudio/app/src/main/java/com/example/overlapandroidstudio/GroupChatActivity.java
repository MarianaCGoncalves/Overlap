package com.example.overlapandroidstudio;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class GroupChatActivity extends AppCompatActivity {

    ImageButton group_back_button;
    TextView group_settings_button;
    TextView groupNameTextView;
    TextView msg_txt;
    Button msg_button;
    String msg_text;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_group_chat);

        Intent intent = getIntent();
        String gname = intent.getStringExtra("groupname");
        int ug_id= intent.getIntExtra("user_group_id", 0);
        int ida = intent.getIntExtra("ida", 0);

        msg_txt= findViewById(R.id.msg_text);
        group_back_button= findViewById(R.id.GroupChatBackButton);
        group_settings_button= findViewById(R.id.GroupSettingsTextView);
        groupNameTextView = findViewById(R.id.G_name);
        msg_button=findViewById(R.id.msg_send);

        groupNameTextView.setText(gname);

        new android.os.Handler(Looper.getMainLooper()).postDelayed(
                new Runnable() {
                    public void run() {
                        Log.i("tag", "This'll run 300 milliseconds later");
                    }
                },
                300);





        msg_button.setOnClickListener(view -> {
            msg_text= msg_txt.toString();
            Toast toast= Toast.makeText(this,"message unable to be sent",Toast.LENGTH_SHORT);
            Message message = new Message(ida, ug_id, msg_text);
            try {
                RetrofitGroupchatInterface retrofitGroupchatInterface=
                        RetrofitService.getRetrofit().create(RetrofitGroupchatInterface.class);
                retrofitGroupchatInterface.PostMessage(message).enqueue(new Callback<Message>() {
                    @Override
                    public void onResponse(Call<Message> call, Response<Message> response) {

                        Message _mes= response.body();
                        if(_mes== null){
                          toast.show();
                        }
                    }

                    @Override
                    public void onFailure(Call<Message> call, Throwable t) {

                    }
                });

            }catch (Exception e){

            }

        });

        group_back_button.setOnClickListener(view -> {
            Intent IntentLoginHome = new Intent(GroupChatActivity.this, Main_MenuActivity.class);
            startActivity(IntentLoginHome);
        });

        group_settings_button.setOnClickListener(view -> {
            Intent IntentLoginHome = new Intent(GroupChatActivity.this, Main_MenuActivity.class);
            startActivity(IntentLoginHome);
        });
    }




}