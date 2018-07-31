package com.example.hongjun.todoapp.view

import android.databinding.DataBindingUtil
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.example.hongjun.todoapp.R
import com.example.hongjun.todoapp.databinding.ActivityTodoBinding
import com.example.hongjun.todoapp.viewmodel.TodoViewModel

class TodoActivity : AppCompatActivity(){
    private lateinit var binding : ActivityTodoBinding
    var todoViewModel = TodoViewModel(this)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = DataBindingUtil.setContentView(this,R.layout.activity_todo)
        todoViewModel.setView()
        binding.viewModel = todoViewModel


    }
}