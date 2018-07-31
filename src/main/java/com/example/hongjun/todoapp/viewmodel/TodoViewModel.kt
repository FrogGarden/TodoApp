package com.example.hongjun.todoapp.viewmodel

import android.app.Activity
import android.arch.lifecycle.ViewModel
import com.example.hongjun.todoapp.dto.Todo
import com.example.hongjun.todoapp.model.TodoDaoImpl

class TodoViewModel(activity: Activity) : ViewModel(){
    private var activity = activity
    lateinit var todo : Todo
    var todoDaoImpl = TodoDaoImpl()

    fun setView(){
        var itemId : Long = activity.intent.extras["itemId"] as Long
        todo = todoDaoImpl.findTodoById(itemId)

    }
}