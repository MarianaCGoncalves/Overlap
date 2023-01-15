package com.example.overlapandroidstudio;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;

public interface RetrofitSignUpInterface {
    @POST("api/users/registo/name/{name}/password/{password}/mail/{mail}")
    Call<Integer> RegisterUser(@Path("name") String name,
                               @Path("password") String password,
                               @Path("mail") String mail);
}
