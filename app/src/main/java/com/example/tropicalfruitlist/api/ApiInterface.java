package com.example.tropicalfruitlist.api;

import com.example.tropicalfruitlist.model.Pojo;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ApiInterface {
    @GET("tfvjsonapi.php?search=all")
    Call<Pojo> getData();
}
