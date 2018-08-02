package com.example.hongjun.todoapp.model

import com.example.hongjun.todoapp.Application
import com.example.hongjun.todoapp.dao.TodoDao
import com.example.hongjun.todoapp.dto.Todo
import io.reactivex.Flowable
import javax.inject.Inject

class TodoDaoImpl() {

    @Inject
    lateinit var todoDao : TodoDao

    init {
        Application.appComponent.inject(this)

    }

    fun findAllTodo() : Flowable<List<Todo>> {
        return todoDao.findAll()

    }

    fun createTodo(todo : Todo){
        todoDao.create(todo)

    }

    fun deleteDoneTodo(){
        todoDao.delete(true)
    }

    fun updateTodo(todo : Todo){
        todoDao.update(todo)
    }

    fun findTodoById(id : Long) : Todo {
        return todoDao.findTodoById(id)
    }

}