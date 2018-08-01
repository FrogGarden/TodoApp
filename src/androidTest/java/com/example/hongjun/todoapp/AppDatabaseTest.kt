package com.example.hongjun.todoapp

import android.support.test.InstrumentationRegistry
import android.support.test.runner.AndroidJUnit4
import com.example.hongjun.todoapp.dao.TodoDao
import com.example.hongjun.todoapp.dto.Todo
import org.junit.Assert.assertEquals
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class AppDatabaseTest {

    private var todoDao : TodoDao? = null

    @Before
    fun setup(){
        AppDatabase.TEST_MODE = true
        todoDao = AppDatabase.getInstance(InstrumentationRegistry.getTargetContext())

    }

    @Test
    fun should_Insert_Todo_Item(){
        val todo = Todo("해야할 제목", "할일 구체적", "2018-09-12", false, 11)
        todoDao?.create(todo)
        val todoTest = todoDao?.findTodoById(11)
        assertEquals(todo.title, todoTest!!.title)
    }

    @Test
    fun should_delete_By_Done(){
        val todo = Todo("해야할 제목", "할일 구체적", "2018-09-12", true, 11)
        todoDao?.create(todo)

        todoDao?.delete(true)

        val todoTest = todoDao?.findTodoById(11)
        assertEquals(null, todoTest?.title)

    }





}