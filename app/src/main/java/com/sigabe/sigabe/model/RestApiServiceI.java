package com.sigabe.sigabe.model;


import retrofit2.Call;
import retrofit2.http.GET;


public interface RestApiServiceI {
    @GET("tips")
    Call<QuickLearnResultModel> getQuickLeanModel();
}
