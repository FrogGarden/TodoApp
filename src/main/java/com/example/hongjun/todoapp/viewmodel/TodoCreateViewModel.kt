package com.example.hongjun.todoapp.viewmodel

import android.app.Activity
import android.arch.lifecycle.ViewModel
import com.example.hongjun.todoapp.R
import com.example.hongjun.todoapp.component.DaggerTodoComponent
import com.example.hongjun.todoapp.component.TodoComponent
import com.example.hongjun.todoapp.dto.Todo
import com.example.hongjun.todoapp.model.TodoDaoImpl
import com.example.hongjun.todoapp.module.TodoModule
import kotlinx.android.synthetic.main.activity_todo_create.*
import javax.inject.Inject


class TodoCreateViewModel(activity: Activity) : ViewModel() {
    private var activity = activity
    var todoDaoImpl = TodoDaoImpl()

    @Inject
    lateinit var todo : Todo

    var component : TodoComponent = DaggerTodoComponent.builder()
            .todoModule(TodoModule())
            .build()

    fun selectDate(){
        activity
    }

    fun cancel(){
        activity.finish()
    }

    fun createTodo(){
        component.inject(this)

        if(activity.todoTitle.text.isEmpty()){
            todo.title = activity.resources.getString(R.string.noTitle)
        }else{
            todo.title = activity.todoTitle.text.toString()
        }
        todo.content = activity.todoContent.text.toString()
        todo.date = activity.todoDate.text.toString()

        todoDaoImpl.createTodo(todo)

        activity.finish()
    }




}