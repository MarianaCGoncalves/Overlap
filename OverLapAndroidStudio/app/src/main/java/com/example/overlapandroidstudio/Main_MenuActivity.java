package com.example.overlapandroidstudio;


import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;


import com.google.android.material.bottomnavigation.BottomNavigationView;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;


public class Main_MenuActivity extends AppCompatActivity {
    BottomNavigationView buttom_nav_option;
    ListView GrouplView;
    GroupListAdapter GrouplAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_menu);

        GrouplView = (ListView)findViewById(R.id.GroupListView);
        try { RetrofitMainMenuInterface retrofitMainMenuInterface=
                RetrofitService.getRetrofit().create(RetrofitMainMenuInterface.class);
            retrofitMainMenuInterface.GetAllGroups().enqueue(new Callback<Iterable<Group>>() {
                @Override
                public void onResponse(Call<Iterable<Group>> call, Response<Iterable<Group>> response) {
                    ArrayList<Group> groupis = new ArrayList<>();
                    for (Group group: response.body()) {
                        groupis.add(group);
                    }
                    GrouplAdapter = new GroupListAdapter(
                            Main_MenuActivity.this,
                            groupis);

                    GrouplView.setAdapter(GrouplAdapter);
                }

                @Override
                public void onFailure(Call<Iterable<Group>> call, Throwable t) {

                }
            });

        }catch(Exception e){

        }

        GrouplView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(Main_MenuActivity.this,
                        "Name: Pipis " ,
                        Toast.LENGTH_SHORT).show();
            }
        });

        // Initialize and assign variable

        buttom_nav_option = findViewById(R.id.main_menu_bottom_nav);

        // Set Home selected
        buttom_nav_option.setSelectedItemId(R.id.bottom_nav_home);

        // Perform item selected listener

        buttom_nav_option.setOnItemSelectedListener(item -> {

            switch(item.getItemId())
            {
                case R.id.bottom_nav_home:
                    return true;
                case R.id.bottom_nav_friends:
                    Intent toFriends = new Intent(getApplicationContext(),FriendsActivity.class);
                    startActivity(toFriends);
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


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.top_nav_menu, menu);
        return true;
    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.user_profile_button:
                Intent IntentMainProfile = new Intent(Main_MenuActivity.this, UserProfileActivity.class);
                startActivity(IntentMainProfile);
                return true;
            case R.id.general_notifications_button:
                Intent IntentMainUserNotifications = new Intent(Main_MenuActivity.this, UserNotificationsActivity.class);
                startActivity(IntentMainUserNotifications);
                return true;
            case R.id.general_sign_out_button:
                Toast toast;
                toast = Toast.makeText(this,"You have been logged out", Toast.LENGTH_SHORT);
                toast.show();
                Intent SignOut = new Intent(getApplicationContext(),SignUpActivity.class);
                startActivity(SignOut);
                overridePendingTransition(0,0);
                finish();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
}