package com.example.hongjun.todoapp.viewmodel

import android.app.Activity
import android.arch.lifecycle.ViewModel
import android.content.Intent
import android.support.v4.content.ContextCompat.startActivity
import android.util.Log
import android.view.View
import com.example.hongjun.plantodo.view.main.MainAdapter
import com.example.hongjun.todoapp.R
import com.example.hongjun.todoapp.model.TodoDaoImpl
import com.example.hongjun.todoapp.view.TodoCreateActivity
import io.reactivex.disposables.Disposable
import io.reactivex.schedulers.Schedulers
import kotlinx.android.synthetic.main.activity_main.*

class MainViewModel(activity: Activity) : ViewModel() {
    private  var activity = activity
    var todoDaoImpl = TodoDaoImpl()
    lateinit var compositeDisposable: Disposable

    fun onClick(v : View){
        when(v.id){
            R.id.createTodo ->{
                startActivity(activity, Intent(activity, TodoCreateActivity::class.java), null)
            }
            R.id.deleteTodo ->{
                todoDaoImpl.deleteDoneTodo()
                setAdapter()

            }
        }

    }

    fun setAdapter(){
        todoDaoImpl.findAllTodo()
                .subscribeOn(Schedulers.io())
                .observeOn(io.reactivex.android.schedulers.AndroidSchedulers.mainThread())
                .subscribe({
                    res -> activity.todoList.adapter = MainAdapter(activity, res)
                },{
                    e -> Log.d("mainViewModel", "findAllTodoErr")
                })




    }







}