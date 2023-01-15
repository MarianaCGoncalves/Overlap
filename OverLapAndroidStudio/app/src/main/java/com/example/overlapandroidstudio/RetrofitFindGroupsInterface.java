package com.example.overlapandroidstudio;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;

public interface RetrofitFindGroupsInterface {
    @GET("/api/groups")
    Call<ArrayList<Group>> GetAllGroups();

    @POST("api/users/id/{use_id}/group/add/{gru_id}")
    Call<Integer> PostUsergroup(@Body Integer integer, Integer integer2);


    @GET("/api/groups/by/name/{gru_name}")
    Call<ArrayList<Group>> GetGroupWithName(@Path("gru_name") String gru_name);

    @GET("/api/groups/by/tag/{tag_name}")
    Call<ArrayList<Group>> GetGroupWithTag(@Path("tag_name") String tag_name);
}
