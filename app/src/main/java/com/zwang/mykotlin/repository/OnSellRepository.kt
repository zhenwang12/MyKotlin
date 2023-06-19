package com.zwang.mykotlin.repository

import com.zwang.mykotlin.bean.NetworkResult
import com.zwang.mykotlin.bean.OnSellResult
import com.zwang.mykotlin.network.RetrofitClient.RetrofitClient

class OnSellRepository {
    suspend fun getOnSellListByPage(page: Int) =
        RetrofitClient.api.getOnSellList(page)
}