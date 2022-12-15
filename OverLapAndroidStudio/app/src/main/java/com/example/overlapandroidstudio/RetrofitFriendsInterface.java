package com.example.overlapandroidstudio;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;


public interface RetrofitFriendsInterface {
    @GET("api/users")
    Call<ArrayList<User>> GetFriends();
    //@POST("/api/users")
    //Call<ArrayList<User>> PostFriends(@Body Integer integer);
}
