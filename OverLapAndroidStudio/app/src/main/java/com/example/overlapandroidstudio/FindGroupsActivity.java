package com.example.overlapandroidstudio;


import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.ToggleButton;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;


public class FindGroupsActivity extends AppCompatActivity {
    ListView GrouplView;
    EditText groupsearch;
    GroupListAdapter GrouplAdapter;
    ArrayList<Group> groupstorage;
    Group groupselected;
    TextView goback;
    ToggleButton search_metho;
    boolean state = false;
    int user_group_id;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_find_groups);
        search_metho = findViewById(R.id.search_method);
        goback= findViewById(R.id.NewGroupTextview);
        Intent intent = getIntent();
        int ida = intent.getIntExtra("ida", 0);

        GrouplView = (ListView)findViewById(R.id.GroupListView);
        try { RetrofitFindGroupsInterface retrofitFindGroupsInterface=
                RetrofitService.getRetrofit().create(RetrofitFindGroupsInterface.class);
            retrofitFindGroupsInterface.GetAllGroups().enqueue(new Callback<ArrayList<Group>>() {
                @Override
                public void onResponse(Call<ArrayList<Group>> call, Response<ArrayList<Group>> response) {
                    groupstorage= response.body();
                    GrouplAdapter= new GroupListAdapter(FindGroupsActivity.this, groupstorage);
                    GrouplView.setAdapter(GrouplAdapter);
                }

                @Override
                public void onFailure(Call<ArrayList<Group>> call, Throwable t) {

                }
            });

        }catch(Exception e){

        }

        goback.setOnClickListener(view -> {
                    Intent Intentgoback = new Intent(FindGroupsActivity.this, Main_MenuActivity.class);
                    startActivity(Intentgoback);
                }
        );


        search_metho.setOnClickListener(view -> state = search_metho.isChecked());

        groupsearch= (EditText)findViewById(R.id.group_searchgroups);
        groupsearch.addTextChangedListener(new TextWatcher() {
            @Override
            public void onTextChanged(CharSequence cs, int arg1, int arg2, int arg3) {
                // When user changed the Text
                String name = cs.toString();

                if (!state){
                    try {
                        RetrofitFindGroupsInterface retrofitFindGroupsInterface =
                                RetrofitService.getRetrofit().create(RetrofitFindGroupsInterface.class);
                        retrofitFindGroupsInterface.GetGroupWithName(name).enqueue(new Callback<ArrayList<Group>>() {
                            @Override
                            public void onResponse(Call<ArrayList<Group>> call, Response<ArrayList<Group>> response) {

                                groupstorage = response.body();
                                if(groupstorage!=null){
                                    GrouplAdapter = new GroupListAdapter(FindGroupsActivity.this, groupstorage);
                                    GrouplView.setAdapter(GrouplAdapter);
                                }

                            }

                            @Override
                            public void onFailure(Call<ArrayList<Group>> call, Throwable t) {

                            }
                        });

                    } catch (Exception e) {

                    }
                }
                else {
                    try {
                        RetrofitFindGroupsInterface retrofitFindGroupsInterface =
                                RetrofitService.getRetrofit().create(RetrofitFindGroupsInterface.class);
                        retrofitFindGroupsInterface.GetGroupWithTag(name).enqueue(new Callback<ArrayList<Group>>() {
                            @Override
                            public void onResponse(Call<ArrayList<Group>> call, Response<ArrayList<Group>> response) {
                                groupstorage = response.body();
                                GrouplAdapter = new GroupListAdapter(FindGroupsActivity.this, groupstorage);
                                GrouplView.setAdapter(GrouplAdapter);
                            }

                            @Override
                            public void onFailure(Call<ArrayList<Group>> call, Throwable t) {

                            }
                        });

                    } catch (Exception e) {

                    }
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


        GrouplView.setOnItemClickListener((parent, view, position, id) -> {


            groupselected= groupstorage.get(position);
            int groupid= groupselected.getGroupId();


            try {
                RetrofitFindGroupsInterface retrofitFindGroupsInterface =
                        RetrofitService.getRetrofit().create(RetrofitFindGroupsInterface.class);
                retrofitFindGroupsInterface.PostUsergroup(ida, groupid ).enqueue(new Callback<Integer>() {
                    @Override
                    public void onResponse(Call<Integer> call, Response<Integer> response) {
                        user_group_id = response.body();
                        String groupname= groupselected.getGroupName();
                        int groupid= groupselected.getGroupId();
                        String groupdescription= groupselected.getGroupDescription();
                        Toast.makeText(FindGroupsActivity.this,
                                "Name:  " + position,
                                Toast.LENGTH_SHORT).show();
                        Intent IntentChatGroup = new Intent(FindGroupsActivity.this, GroupChatActivity.class);
                        IntentChatGroup.putExtra("groupname", groupname);
                        IntentChatGroup.putExtra("user_group_id",user_group_id);
                        IntentChatGroup.putExtra("groupid", groupid);
                        IntentChatGroup.putExtra("groupdescription", groupdescription);
                        startActivity(IntentChatGroup);
                    }
                    @Override
                    public void onFailure(Call<Integer> call, Throwable t) {

                    }

                });

            } catch (Exception e) {

            }

        });



    }
}