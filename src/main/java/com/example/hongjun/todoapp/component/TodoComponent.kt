package com.example.hongjun.todoapp.component

import com.example.hongjun.todoapp.module.TodoModule
import com.example.hongjun.todoapp.viewmodel.TodoCreateViewModel
import dagger.Component

@Component(modules = arrayOf(TodoModule::class))
interface TodoComponent {
    fun inject(todoCreateViewModel: TodoCreateViewModel
               )

}