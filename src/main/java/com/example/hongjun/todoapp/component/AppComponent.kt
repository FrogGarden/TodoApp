package com.example.hongjun.todoapp.component

import com.example.hongjun.todoapp.Application
import com.example.hongjun.todoapp.dao.TodoDao
import com.example.hongjun.todoapp.model.TodoDaoImpl
import com.example.hongjun.todoapp.module.AppModule
import com.example.hongjun.todoapp.viewmodel.MainViewModel
import com.example.hongjun.todoapp.viewmodel.TodoCreateViewModel
import com.example.hongjun.todoapp.viewmodel.TodoViewModel
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = arrayOf(AppModule::class))
interface AppComponent {
    fun inject(todoDaoImpl: TodoDaoImpl)

}