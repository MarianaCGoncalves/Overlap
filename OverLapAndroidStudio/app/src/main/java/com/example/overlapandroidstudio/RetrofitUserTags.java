package com.example.overlapandroidstudio;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;


public interface RetrofitUserTags{
    @GET("/api/tags")
    Call<Iterable<Tag>> GetTags();
    @POST("/api/tags")
    Call<Iterable<Tag>> PostTags(@Body Integer integer);
}
