package com.example.hongjun.todoapp

import android.app.Application
import com.example.hongjun.todoapp.component.AppComponent
import com.example.hongjun.todoapp.component.DaggerAppComponent
import com.example.hongjun.todoapp.component.DaggerTodoComponent
import com.example.hongjun.todoapp.component.TodoComponent
import com.example.hongjun.todoapp.module.AppModule
import com.example.hongjun.todoapp.module.TodoModule

class Application : Application(){


    companion object {
        private lateinit var INSTANCE : Application

        fun getInstance() = INSTANCE

        var todoComponent : TodoComponent = DaggerTodoComponent.builder()
                .todoModule(TodoModule())
                .build()



        lateinit var appComponent : AppComponent




    }

    override fun onCreate() {
        super.onCreate()
        INSTANCE = this

        appComponent = DaggerAppComponent.builder()
                .appModule(AppModule(applicationContext))
                .build()
    }


}