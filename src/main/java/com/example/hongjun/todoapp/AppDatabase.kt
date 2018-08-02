package com.example.hongjun.todoapp

import android.arch.persistence.room.Database
import android.arch.persistence.room.Room
import android.arch.persistence.room.RoomDatabase
import android.content.Context
import com.example.hongjun.todoapp.dao.TodoDao
import com.example.hongjun.todoapp.dto.Todo

@Database(version = 2, entities = arrayOf(Todo::class))
abstract class AppDatabase : RoomDatabase() {

    abstract fun todoDao() : TodoDao

    //test 위한 코드
    companion object {
        var TEST_MODE = false
        private val databaseName = "todo"


        private var db: AppDatabase? = null
        private var dbInstance : TodoDao? = null

        fun getInstance(context : Context): TodoDao{
            if(dbInstance == null){
                if(TEST_MODE){
                    db = Room.inMemoryDatabaseBuilder(context, AppDatabase::class.java)
                            .allowMainThreadQueries()
                            .build()
                    dbInstance = db?.todoDao()
                } else {
                    db = Room.databaseBuilder(context, AppDatabase::class.java, databaseName)
                            .build()
                    dbInstance = db?.todoDao()
                }
            }
            return dbInstance!!
        }

        private fun close(){
            db?.close()
        }

    }
}