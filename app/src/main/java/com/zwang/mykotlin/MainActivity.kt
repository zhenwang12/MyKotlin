package com.zwang.mykotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.zwang.mykotlin.databinding.ActivityMainBinding
import com.zwang.mykotlin.model.User

class MainActivity : AppCompatActivity() {
    private lateinit var binding:ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        binding = ActivityMainBinding.inflate(layoutInflater)

        binding = DataBindingUtil.setContentView<ActivityMainBinding>(this, R.layout.activity_main)
        binding.userInfo = User("WZ", "41112111020202")
        setContentView(binding.root)

        binding.topText.text = "上部的文字"
        binding.topText.setTextColor(resources.getColor(R.color.black))
    }
}