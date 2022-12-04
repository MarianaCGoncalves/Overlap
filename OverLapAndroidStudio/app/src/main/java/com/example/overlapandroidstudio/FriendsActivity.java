package com.example.overlapandroidstudio;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class FriendsActivity extends AppCompatActivity {
    BottomNavigationView friends_buttom_nav_option;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_friends);


        friends_buttom_nav_option = findViewById(R.id.friends_activity_bottom_nav);


        friends_buttom_nav_option.setSelectedItemId(R.id.bottom_nav_friends);

        // Perform item selected listener

        friends_buttom_nav_option.setOnItemSelectedListener(item -> {

            switch(item.getItemId())
            {
                case R.id.bottom_nav_friends:
                    return true;
                case R.id.bottom_nav_home:
                    Intent toHome = new Intent(getApplicationContext(),Main_MenuActivity.class);
                    startActivity(toHome);
                    overridePendingTransition(0,0);
                    return true;
                case R.id.bottom_nav_maps:
                    Intent toMaps = new Intent(getApplicationContext(), GroupChatActivity.class/*MapsActivity.class*/);
                    startActivity(toMaps);
                    overridePendingTransition(0,0);
                    return true;
            }
            return false;
        });

    }
}