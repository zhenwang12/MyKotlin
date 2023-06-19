package com.zwang.mykotlin.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.zwang.mykotlin.LoadStatus
import com.zwang.mykotlin.bean.OnSellItem
import com.zwang.mykotlin.repository.OnSellRepository
import kotlinx.coroutines.launch

class OnSellViewModel : ViewModel() {
    companion object {
        const val DEFAULT_PAGE = 1
    }
    private var currentPage: Int = DEFAULT_PAGE
    private val repository by lazy {
        OnSellRepository()
    }

    fun loadData() {
        loadState.value = LoadStatus.LOADING
    }


    private fun loadDataByPage(page: Int) {
        viewModelScope.launch {
            val result = repository.getOnSellListByPage(currentPage)
            println("result ==>> ${result.code}")
            println("result ==>> ${result.data.tbk_dg_optimus_material_response.result_list.map_data.size}")
        }
    }

    //加载状态
    val loadState by lazy { MutableLiveData<LoadStatus>() }

    //数据列表
    val contentList by lazy { MutableLiveData<MutableList<OnSellItem>>() }
}