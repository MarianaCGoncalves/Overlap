package com.example.overlapandroidstudio;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

public class GroupChatActivity extends AppCompatActivity {

    ImageButton group_back_button;
    TextView group_settings_button;
    TextView groupNameTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_group_chat);
        group_back_button= findViewById(R.id.GroupChatBackButton);
        group_settings_button= findViewById(R.id.GroupSettingsTextView);

        groupNameTextView = findViewById(R.id.G_name);
        Intent intent = getIntent();
        String gname = intent.getStringExtra("groupname");
        groupNameTextView.setText(gname);

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