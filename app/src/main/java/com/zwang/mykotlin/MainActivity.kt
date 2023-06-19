package com.zwang.mykotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.zwang.mykotlin.databinding.ActivityMainBinding
import com.zwang.mykotlin.fragment.OnSellFragment

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        binding = ActivityMainBinding.inflate(layoutInflater)

//        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        setContentView(R.layout.activity_main)

        supportFragmentManager.beginTransaction().replace(R.id.root, OnSellFragment()).commit()
    }
}