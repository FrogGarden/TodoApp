package com.example.hongjun.todoapp.view


import android.databinding.DataBindingUtil
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.example.hongjun.todoapp.R
import com.example.hongjun.todoapp.databinding.ActivityTodoCreateBinding
import com.example.hongjun.todoapp.viewmodel.TodoCreateViewModel

open class TodoCreateActivity : AppCompatActivity(){
    private lateinit var binding : ActivityTodoCreateBinding
    private var todoCreateViewModel = TodoCreateViewModel(this)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = DataBindingUtil.setContentView(this, R.layout.activity_todo_create)
        todoCreateViewModel.inject()
        binding.viewModel = todoCreateViewModel



    }


}