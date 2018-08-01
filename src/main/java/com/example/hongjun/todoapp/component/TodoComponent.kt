package com.example.hongjun.todoapp.component

import com.example.hongjun.todoapp.module.TodoModule
import com.example.hongjun.todoapp.viewmodel.TodoCreateViewModel
import com.example.hongjun.todoapp.viewmodel.TodoViewModel
import dagger.Component

@Component(modules = arrayOf(TodoModule::class))
interface TodoComponent {
    fun inject(todoCreateViewModel: TodoCreateViewModel
               )

}