package com.example.mvvmex01.models.network;

import com.example.mvvmex01.models.model.JsonResultModel;
import com.example.mvvmex01.models.model.VentilationTimeModel;

import retrofit2.Call;
import retrofit2.http.GET;

public interface RetrofitService {
    @GET("air/ventilationtime")
    Call<JsonResultModel<VentilationTimeModel>> ventilationtime();
}
