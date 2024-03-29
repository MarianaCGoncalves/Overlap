package com.example.overlapandroidstudio;

import java.util.ArrayList;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface RetrofitMainMenuInterface {
    @GET("/api/groups")
    Call<ArrayList<Group>> GetAllGroups();

    @GET("/api/groups/by/name/{gru_name}")
    Call<ArrayList<Group>> GetGroupWithName(@Path("gru_name") String gru_name);

    @GET("/api/groups/by/tag/{tag_name}")
    Call<ArrayList<Group>> GetGroupWithTag(@Path("tag_name") String tag_name);
}
