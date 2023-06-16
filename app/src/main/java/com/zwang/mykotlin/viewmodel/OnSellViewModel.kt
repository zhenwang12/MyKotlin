package com.zwang.mykotlin.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.zwang.mykotlin.LoadStatus
import com.zwang.mykotlin.bean.OnSellItem

class OnSellViewModel : ViewModel() {
    //加载状态
    val loadState by lazy { MutableLiveData<LoadStatus>() }

    //数据列表
    val contentList by lazy { MutableLiveData<MutableList<OnSellItem>>() }
}