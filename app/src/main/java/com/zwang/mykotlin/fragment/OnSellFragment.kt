package com.zwang.mykotlin.fragment

import android.util.Log
import androidx.lifecycle.Observer
import com.zwang.mykotlin.BaseViewModelFragment
import com.zwang.mykotlin.R
import com.zwang.mykotlin.databinding.FragmentOnsellBinding
import com.zwang.mykotlin.viewmodel.OnSellViewModel

class OnSellFragment : BaseViewModelFragment<FragmentOnsellBinding, OnSellViewModel>() {
    val TAG = OnSellFragment::class.java.simpleName
    override fun getSubClass(): Class<OnSellViewModel> {
        return OnSellViewModel::class.java
    }

    override fun getLayoutId(): Int {
        return R.layout.fragment_onsell
    }

    override fun observerData() {
        viewModel.loadState.observe(this) { status ->
            {
                Log.d(TAG, "${status}")
            }
        }
        viewModel.contentList.observe(this) { contentList ->
            {
                Log.d(TAG, "Size: ${contentList.size}")
            }
        }
    }
}