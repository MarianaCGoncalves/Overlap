package com.example.overlapandroidstudio;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import com.google.android.material.bottomnavigation.BottomNavigationView;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class FriendsActivity extends AppCompatActivity {
    BottomNavigationView friends_buttom_nav_option;
    ListView FriendslView;
    FriendListAdapter FriendslAdapter;
    ArrayList<User> friendstorage;
    User friendselected;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_friends);
        FriendslView=findViewById(R.id.FriendListView);

        try {
            RetrofitFriendsInterface RetrofitFriendsInterface=
                    RetrofitService.getRetrofit().create(RetrofitFriendsInterface.class);
            RetrofitFriendsInterface.GetFriends().enqueue(new Callback<ArrayList<User>>() {
                @Override
                public void onResponse(Call<ArrayList<User>> call, Response<ArrayList<User>> response) {
                    friendstorage= response.body();
                    FriendslAdapter= new FriendListAdapter(FriendsActivity.this, friendstorage);
                    FriendslView.setAdapter(FriendslAdapter);
                }

                @Override
                public void onFailure(Call<ArrayList<User>> call, Throwable t) {

                }
            });

        }catch (Exception e){

        }

        FriendslView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                friendselected= friendstorage.get(position);
                String friendname=friendselected.getUserName();
                int friendid= friendselected.getId();
                Toast.makeText(FriendsActivity.this,
                        "Name: Pipis " + position,
                        Toast.LENGTH_SHORT).show();
                Intent IntentChatGroup = new Intent(FriendsActivity.this, GroupChatActivity.class);
                IntentChatGroup.putExtra("friendname", friendname);
                IntentChatGroup.putExtra("friendid", friendid);
                startActivity(IntentChatGroup);

            }
        });
















        friends_buttom_nav_option = findViewById(R.id.friends_activity_bottom_nav);


        friends_buttom_nav_option.setSelectedItemId(R.id.bottom_nav_friends);

        // Perform item selected listener

        friends_buttom_nav_option.setOnItemSelectedListener(item -> {

            switch(item.getItemId())
            {
                case R.id.bottom_nav_friends:
                    return false;
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