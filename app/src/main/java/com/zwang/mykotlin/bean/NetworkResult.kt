package com.zwang.mykotlin.bean

data class NetworkResult<T>(val success: Boolean, val code: Int, val data :T)
