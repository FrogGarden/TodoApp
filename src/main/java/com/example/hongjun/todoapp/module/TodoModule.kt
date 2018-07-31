package com.example.hongjun.todoapp.module

import com.example.hongjun.todoapp.dto.Todo
import dagger.Module
import dagger.Provides

@Module
class TodoModule() {
    @Provides
    fun providesTodo() = Todo(null, null, null)


}