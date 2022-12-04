package com.example.overlapandroidstudio;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class UserTagsMainActivity extends AppCompatActivity {

    ListView TaglView;
    TagListAdapter TaglAdapter;
    Button button_tag_continue;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_tags_main);
        TaglView = (ListView)findViewById(R.id.User_tag_ListView);
        try { RetrofitUserTags retrofitUserTags =
                RetrofitService.getRetrofit().create(RetrofitUserTags.class);
            retrofitUserTags.GetTags().enqueue(new Callback<Iterable<Tag>>() {
                @Override
                public void onResponse(Call<Iterable<Tag>> call, Response<Iterable<Tag>> response) {
                    ArrayList<com.example.overlapandroidstudio.Tag> tagis = new ArrayList<>();
                    for (Tag tag: response.body()) {
                        tagis.add(tag);
                    }
                    TaglAdapter= new TagListAdapter(UserTagsMainActivity.this, tagis);
                    TaglView.setAdapter(TaglAdapter);
                }

                @Override
                public void onFailure(Call<Iterable<Tag>> call, Throwable t) {

                }
            });

        }catch (Exception e){}

        button_tag_continue = findViewById(R.id.from_tag_go_menu);
        button_tag_continue.setOnClickListener(view -> {
            Intent IntentLoginHome = new Intent(UserTagsMainActivity.this, Main_MenuActivity.class);
            startActivity(IntentLoginHome);

        });
    }
}