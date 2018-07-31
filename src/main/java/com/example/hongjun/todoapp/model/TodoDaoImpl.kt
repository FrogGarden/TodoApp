package com.example.hongjun.todoapp.model

import com.example.hongjun.todoapp.Application
import com.example.hongjun.todoapp.dto.Todo

class TodoDaoImpl() {

    var todoDao = Application.appDatabase.todoDao()

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
        return todoDao.findTodoById(id) as Todo
    }
}