package com.example.overlapandroidstudio;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;


public class UserNotificationsActivity extends AppCompatActivity {

    ListView notiflView;
    NotifListAdapter notiflAdapter;
    NotificationItems notiflItems;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_notifications);


        notiflItems = new NotificationItems();
        notiflView = (ListView)findViewById(R.id.NotifListView);
        notiflAdapter = new NotifListAdapter(
                UserNotificationsActivity.this,
                notiflItems.notificationdates, notiflItems.notificationtexts);

        notiflView.setAdapter(notiflAdapter);
    }



        public void Back_button(View view) {
            Intent IntentLoginSignUp = new Intent(UserNotificationsActivity.this, Main_MenuActivity.class);
            startActivity(IntentLoginSignUp);

        }

}