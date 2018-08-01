package com.example.hongjun.todoapp.view

import android.databinding.DataBindingUtil
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.example.hongjun.todoapp.R
import com.example.hongjun.todoapp.databinding.ActivityTodoBinding
import com.example.hongjun.todoapp.viewmodel.TodoViewModel


class TodoActivity : AppCompatActivity(){
    private lateinit var binding : ActivityTodoBinding
    var todoViewModel = TodoViewModel(this)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = DataBindingUtil.setContentView(this,R.layout.activity_todo)


// rxjava reactive 현재는 메인 쓰레드에 반응해 ui 를 바꿔줌, retrofit 과 잘 어울림
//        val executorService = Executors.newSingleThreadScheduledExecutor()
//        executorService.scheduleAtFixedRate({
//
//            todoViewModel.settingTodo(Todo("이름바뀜", "ddd",""))
//            Log.d("tictoc","clock")
//        }, 0L, 3, TimeUnit.SECONDS)



        todoViewModel.setView()

        binding.viewModel = todoViewModel

        //rx
//        todoViewModel.subscribe()




    }
}