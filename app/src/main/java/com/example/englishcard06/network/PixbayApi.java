package com.example.englishcard06.network;

import com.example.englishcard06.network.model.PixabayResponse;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface PixbayApi {
    @GET("/api?key=25680573-99ab4b0392ec7236ffaa0c266")
    Call<PixabayResponse> getImages(@Query("q") String englishWord);
}
