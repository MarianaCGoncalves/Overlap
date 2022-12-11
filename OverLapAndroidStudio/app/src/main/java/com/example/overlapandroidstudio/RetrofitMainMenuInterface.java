package com.example.overlapandroidstudio;

import retrofit2.Call;
import retrofit2.http.GET;


public interface RetrofitMainMenuInterface {
    @GET("/api/groups")
    Call<Iterable<Group>> GetAllGroups();
}
