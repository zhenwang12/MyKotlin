package com.zwang.mykotlin.network

import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import java.util.concurrent.TimeUnit

class RetrofitClient {

    object RetrofitClient {
        private val clientInterceptor: OkHttpClient = OkHttpClient.Builder()
            .callTimeout(10, TimeUnit.SECONDS)
            .build()

        private const val BASE_URL = "https://api.sunofbeach.net/shop/"
        val retrofitClient = Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .client(clientInterceptor)
            .build()

        val api = retrofitClient.create(ApiServices::class.java)
    }
}