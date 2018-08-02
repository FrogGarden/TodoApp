package com.example.hongjun.todoapp.dao

import android.arch.persistence.room.*
import com.example.hongjun.todoapp.dto.Todo
import io.reactivex.Flowable

@Dao
interface TodoDao {

    @Query("SELECT * FROM todo")
    fun findAll() : Flowable<List<Todo>>

    @Query("SELECT * FROM todo WHERE id = :id")
    fun findTodoById(id : Long) : Todo

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun create(todo : Todo)

    @Update
    fun update(todo : Todo)

    @Query("DELETE FROM todo WHERE done = :done")
    fun delete(done : Boolean)
}