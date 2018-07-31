package com.example.hongjun.todoapp

import android.app.Application
import android.arch.persistence.room.Room

class Application : Application(){




    companion object {
        private lateinit var INSTANCE : Application

        fun getInstance() = INSTANCE

        lateinit var appDatabase: AppDatabase
    }

    override fun onCreate() {
        super.onCreate()
        INSTANCE = this

        appDatabase = Room.databaseBuilder(this, AppDatabase::class.java, "todo.-db")
                .fallbackToDestructiveMigration()
                .allowMainThreadQueries().build()




    }
}