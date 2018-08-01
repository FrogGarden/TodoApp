package com.example.hongjun.todoapp.viewmodel

import android.annotation.SuppressLint
import android.app.Activity
import android.arch.lifecycle.Observer
import android.arch.lifecycle.ViewModel
import com.example.hongjun.todoapp.dto.Todo
import com.example.hongjun.todoapp.model.TodoDaoImpl
import io.reactivex.Observable
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.disposables.Disposable
import io.reactivex.schedulers.Schedulers
import io.reactivex.subjects.PublishSubject
import kotlinx.android.synthetic.main.activity_todo.*
import java.util.*
import javax.inject.Inject

class TodoViewModel(activity: Activity) : ViewModel(){
    private var activity = activity


    lateinit var todo : Todo
    private var todoDaoImpl = TodoDaoImpl()


    fun setView(){
        var itemId : Long = activity.intent.extras["itemId"] as Long
        todo = todoDaoImpl.findTodoById(itemId)


    }

//    //rx
//    lateinit var disposable: Disposable
//    private var subject : PublishSubject<Todo> = PublishSubject.create()
//
//
//    fun settingTodo(todo : Todo){
//        subject.onNext(todo)
//    }
//
//    fun subscribe(){
//        disposable = updateEvent().subscribe(this::updateView)
//    }
//
//    fun updateEvent() : Observable<Todo>{
//        return subject.subscribeOn(Schedulers.io())
//                .observeOn(AndroidSchedulers.mainThread())
//    }
//
//    private fun updateView(todo : Todo){
//        activity.todoTitle.text = todo.title
//    }




}