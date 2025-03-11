package com.example.daggerdemo.dagger_mvvm.retrofit

import com.example.daggerdemo.dagger_mvvm.model.Product
import retrofit2.Response
import retrofit2.http.GET

interface FakerApi {

    @GET("products")
    suspend fun products(): Response<List<Product>>

}