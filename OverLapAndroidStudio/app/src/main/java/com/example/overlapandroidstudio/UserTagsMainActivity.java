package com.example.overlapandroidstudio;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class UserTagsMainActivity extends AppCompatActivity {

    ListView TaglView;
    ListView TaglViewuser;
    TagListAdapter TaglAdapter;
    EditText tagsearch;
    Button button_tag_continue;
    ArrayList<Tag> tagstorage;
    Tag tagselected;
    int idusertag= 100;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_tags_main);
        TaglView = (ListView) findViewById(R.id.User_tag_ListView);

        //get user id
        Intent intent = getIntent();
        int user_id = intent.getIntExtra("ida", 0);


        //display
        try {
            RetrofitUserTags retrofitUserTags =
                    RetrofitService.getRetrofit().create(RetrofitUserTags.class);
            retrofitUserTags.GetTags().enqueue(new Callback<ArrayList<Tag>>() {
                @Override
                public void onResponse(Call<ArrayList<Tag>> call, Response<ArrayList<Tag>> response) {
                    tagstorage = response.body();
                    TaglAdapter = new TagListAdapter(UserTagsMainActivity.this, tagstorage);
                    TaglView.setAdapter(TaglAdapter);
                }

                @Override
                public void onFailure(Call<ArrayList<Tag>> call, Throwable t) {

                }
            });

        } catch (Exception e) {

        }





        //search bar

        tagsearch= (EditText)findViewById(R.id.user_searchtags);
        tagsearch.addTextChangedListener(new TextWatcher() {
            @Override
            public void onTextChanged(CharSequence cs, int arg1, int arg2, int arg3) {
                // When user changed the Text
                String name = cs.toString();


                try { RetrofitUserTags retrofitUserTags =
                        RetrofitService.getRetrofit().create(RetrofitUserTags.class);
                    retrofitUserTags.getTagWithName(name).enqueue(new Callback<ArrayList<Tag>>() {
                        @Override
                        public void onResponse(Call<ArrayList<Tag>> call, Response<ArrayList<Tag>> response) {
                            tagstorage= response.body();
                            TaglAdapter= new TagListAdapter(UserTagsMainActivity.this, tagstorage);
                            TaglView.setAdapter(TaglAdapter);
                        }

                        @Override
                        public void onFailure(Call<ArrayList<Tag>> call, Throwable t) {

                        }
                    });

                }catch (Exception e){

                }
            }
            @Override
            public void beforeTextChanged(CharSequence arg0, int arg1, int arg2,
                                          int arg3) {
                // TODO Auto-generated method stub

            }
            @Override
            public void afterTextChanged(Editable arg0) {
                // TODO Auto-generated method stub
            }
        });




        //clicking tags
        TaglView.setOnItemClickListener((parent, view, position, id) -> {
            tagselected=tagstorage.get(position);
            int tag_id=tagselected.getTagId();
            Toast toasto= Toast.makeText(this, "this id is"+ tag_id, Toast.LENGTH_SHORT);

                try {
                    RetrofitUserTags retrofitUserTags=
                            RetrofitService.getRetrofit().create(RetrofitUserTags.class);
                            retrofitUserTags.TagVerification(user_id,tag_id).enqueue(new Callback<Integer>() {
                        @Override
                        public void onResponse(Call<Integer> call, Response<Integer> response) {
                            toasto.show();
                            idusertag= response.body();
                        }

                        @Override
                        public void onFailure(Call<Integer> call, Throwable t) {

                        }
                    });
                }catch (Exception e){

                }
                if(idusertag==100){
                    Toast toasta;
                    toasta= Toast.makeText(this, "not run", Toast.LENGTH_SHORT);
                    //toasta.show();
                }
            //tag not selected
            if(idusertag== 0){
                Toast toasty;
                toasty= Toast.makeText(this, " run", Toast.LENGTH_SHORT);
                try {
                    RetrofitUserTags retrofitUserTags=
                            RetrofitService.getRetrofit().create(RetrofitUserTags.class);
                    retrofitUserTags.PostTags(user_id,tag_id ).enqueue(new Callback<Integer>() {
                        @Override
                        public void onResponse(Call<Integer> call, Response<Integer> response) {
                            int confirmed=response.body();
                            toasty.show();



                        }

                        @Override
                        public void onFailure(Call<Integer> call, Throwable t) {

                        }
                    });
                }catch (Exception e){

                }
            }
            //tag selected
            else{
                try {
                    RetrofitUserTags retrofitUserTags=
                            RetrofitService.getRetrofit().create(RetrofitUserTags.class);
                    retrofitUserTags.DeleteUsertag(idusertag);
                }
                catch (Exception e){

                }
            }
        });



        //continue button
        button_tag_continue = findViewById(R.id.from_tag_go_menu);
        button_tag_continue.setOnClickListener(view -> {
            Intent IntentLoginHome = new Intent(UserTagsMainActivity.this, Main_MenuActivity.class);
            IntentLoginHome.putExtra("ida",user_id);
            startActivity(IntentLoginHome);

        });
    }
}
