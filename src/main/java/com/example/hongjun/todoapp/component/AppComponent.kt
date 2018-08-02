package com.example.hongjun.todoapp.component

import com.example.hongjun.todoapp.model.TodoDaoImpl
import com.example.hongjun.todoapp.module.AppModule
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = arrayOf(AppModule::class))
interface AppComponent {
    fun inject(todoDaoImpl: TodoDaoImpl)

}