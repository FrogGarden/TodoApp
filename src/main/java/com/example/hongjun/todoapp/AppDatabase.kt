package com.example.hongjun.todoapp

import android.arch.persistence.room.Database
import android.arch.persistence.room.RoomDatabase
import com.example.hongjun.todoapp.dao.TodoDao
import com.example.hongjun.todoapp.dto.Todo

@Database(version = 2, entities = arrayOf(Todo::class))
abstract class AppDatabase : RoomDatabase() {

    abstract fun todoDao() : TodoDao
}