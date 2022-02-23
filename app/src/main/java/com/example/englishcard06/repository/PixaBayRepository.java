package com.example.englishcard06.repository;

import android.util.Log;

import androidx.lifecycle.MutableLiveData;

import com.example.englishcard06.network.PixbayApi;
import com.example.englishcard06.network.model.Hits;
import com.example.englishcard06.network.model.PixabayResponse;

import java.util.List;

import javax.inject.Inject;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class PixaBayRepository {

    public MutableLiveData<List<Hits>> listImages = new MutableLiveData<>();

    PixbayApi api;

    @Inject
    public PixaBayRepository(PixbayApi api) {
        this.api = api;
    }

    public void getImages(String word) {
        api.getImages(word).enqueue(new Callback<PixabayResponse>() {
            @Override
            public void onResponse(Call<PixabayResponse> call, Response<PixabayResponse> response) {
                if (response.isSuccessful()) {
                    listImages.postValue(response.body().getHits());
                }

            }

            @Override
            public void onFailure(Call<PixabayResponse> call, Throwable t) {
                Log.e("olololo", t.getMessage());

            }
        });
    }
}
