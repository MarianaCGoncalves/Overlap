package com.example.overlapandroidstudio;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.POST;
import retrofit2.http.Path;

public interface RetrofitGroupchatInterface {

    @POST("/api/message/create")
    Call<Message> PostMessage(@Body Message amessage);
}
