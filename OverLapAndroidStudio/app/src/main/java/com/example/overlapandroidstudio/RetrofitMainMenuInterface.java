package com.example.overlapandroidstudio;

import java.util.ArrayList;
import retrofit2.Call;
import retrofit2.http.GET;


public interface RetrofitMainMenuInterface {
    @GET("/api/groups")
    Call<ArrayList<Group>> GetAllGroups();
}
