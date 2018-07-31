package com.example.hongjun.todoapp.view

import android.databinding.DataBindingUtil
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.example.hongjun.plantodo.view.main.MainAdapter
import com.example.hongjun.todoapp.Application
import com.example.hongjun.todoapp.R
import com.example.hongjun.todoapp.databinding.ActivityMainBinding
import com.example.hongjun.todoapp.viewmodel.MainViewModel

class MainActivity : AppCompatActivity() {
    private lateinit var binding :ActivityMainBinding
    var mainViewModel = MainViewModel(this)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        binding.viewModel = mainViewModel

        mainViewModel.setAdapter()


    }

    override fun onResume() {
        super.onResume()

        mainViewModel.setAdapter()
    }


}
