package com.zwang.mykotlin.network

import com.zwang.mykotlin.bean.NetworkResult
import com.zwang.mykotlin.bean.OnSellItem
import com.zwang.mykotlin.bean.OnSellResult
import retrofit2.http.GET
import retrofit2.http.Path

interface ApiServices {

    @GET("onSell/{page}")
    suspend fun getOnSellList(@Path("page") page: Int): NetworkResult<OnSellResult>
}