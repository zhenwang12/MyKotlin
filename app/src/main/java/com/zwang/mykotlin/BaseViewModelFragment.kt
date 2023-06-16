package com.zwang.mykotlin

import android.os.Bundle
import android.view.View
import androidx.databinding.ViewDataBinding
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider

abstract class BaseViewModelFragment<T : ViewDataBinding, VM : ViewModel> : BaseViewFragment<T>() {

    lateinit var viewModel: VM

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initViewModel()
        observerData()
        initEvent()
    }

    fun initViewModel() {
        viewModel = ViewModelProvider(this).get(getSubClass())
    }

    open fun observerData() {}
    open fun initEvent() {}
    abstract fun getSubClass(): Class<VM>
}