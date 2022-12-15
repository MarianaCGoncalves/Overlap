package com.example.overlapandroidstudio;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;


public interface RetrofitUserTags{
    @GET("/api/tags")
    Call<ArrayList<Tag>> GetTags();
    @POST("/api/tags")
    Call<ArrayList<Tag>> PostTags(@Body Integer integer);
}
