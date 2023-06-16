package com.zwang.mykotlin

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding
import androidx.fragment.app.Fragment

abstract class BaseViewFragment<T: ViewDataBinding>: Fragment() {
    lateinit var binding: T
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
//        val view = inflater.inflate(getLayoutId(), container, false)
//        binding = DataBindingUtil.bind<T>(view)
        binding = DataBindingUtil.inflate<T>(inflater, getLayoutId(), container, false)
        return binding.root
    }

    abstract fun getLayoutId():Int
}