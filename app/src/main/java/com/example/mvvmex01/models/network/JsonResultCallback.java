package com.example.mvvmex01.models.network;

import com.example.mvvmex01.models.model.JsonResultModel;

import java.util.List;

import retrofit2.Callback;

public interface JsonResultCallback<T> extends Callback<JsonResultModel<T>> {

    List<T> getModelList();

    T getModel();
}