package com.example.hongjun.todoapp.view

import android.databinding.DataBindingUtil
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.example.hongjun.todoapp.R
import com.example.hongjun.todoapp.databinding.ActivityMainBinding
import com.example.hongjun.todoapp.viewmodel.MainViewModel


class MainActivity : AppCompatActivity(){

    private lateinit var binding :ActivityMainBinding
    var mainViewModel = MainViewModel(this)


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        mainViewModel.setAdapter()
        binding.viewModel = mainViewModel


    }


    override fun onResume() {
        super.onResume()

        mainViewModel.setAdapter()
    }



}
