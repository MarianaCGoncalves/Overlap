package com.example.overlapandroidstudio;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;


public interface RetrofitUserTags{
    @GET("/api/tags")
    Call<ArrayList<Tag>> GetTags();

    @GET("/api/tags/by/name/{tag_name}")
    Call<ArrayList<Tag>> getTagWithName(@Path("tag_name") String tag_name);

    @GET("/api/users/id/{use_id}/tag/verification/{tag_id}")
    Call<Integer> TagVerification(@Path("user_id") int user_id, @Path("tag_id") int tag_id);

    @DELETE("/api/users/delete/usertag/{tu_id}")
    Call<Integer> DeleteUsertag(@Path("usertag") int user_tag);

    @POST("/api/users/id/{use_id}/tag/add/{tag_id}")
    Call<Integer> PostTags(@Path("user_id") int user_id, @Path("tag_id") int tag_id);
}
