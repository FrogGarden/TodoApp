package com.example.hongjun.todoapp.module


import android.arch.persistence.room.Room
import android.content.Context
import com.example.hongjun.todoapp.AppDatabase
import com.example.hongjun.todoapp.Application
import com.example.hongjun.todoapp.dao.TodoDao
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class AppModule(val context: Context) {

    @Singleton
    @Provides
    fun provideApplication(): Context = context


    @Singleton
    @Provides
    fun provideTodoDatabase(context: Context) : AppDatabase = Room.databaseBuilder(context, AppDatabase::class.java, "todo.-db")
            .fallbackToDestructiveMigration()
            .allowMainThreadQueries().build()


    @Singleton
    @Provides
    fun provideTodoDao(appDatabase: AppDatabase) : TodoDao = appDatabase.todoDao()

}