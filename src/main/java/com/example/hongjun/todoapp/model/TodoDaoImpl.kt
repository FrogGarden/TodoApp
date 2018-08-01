package com.example.hongjun.todoapp.model

import com.example.hongjun.todoapp.Application
import com.example.hongjun.todoapp.dao.TodoDao
import com.example.hongjun.todoapp.dto.Todo
import javax.inject.Inject

class TodoDaoImpl() {

    init {
        Application.appComponent.inject(this)
    }

    @Inject
    lateinit var todoDao : TodoDao

    fun findAllTodo() : List<Todo>{

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