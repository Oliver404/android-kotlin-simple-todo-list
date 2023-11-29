package com.oliverbotello.project.simpletodolist.kotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.appcompat.widget.AppCompatButton
import androidx.appcompat.widget.AppCompatEditText
import androidx.core.widget.doOnTextChanged
import androidx.lifecycle.ViewModelProvider
import com.oliverbotello.project.simpletodolist.kotlin.ui.MainViewModel

class MainActivity : AppCompatActivity() {
    private var viewModel: MainViewModel = ViewModelProvider(this)[MainViewModel::class.java]
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initView()
    }

    private fun initView() {
        val edttxtvwTask = findViewById<AppCompatEditText>(R.id.edttxtvw_task)
        edttxtvwTask.doOnTextChanged { text, start, before, count ->
            viewModel.onNewTaskChange(text.toString())
        }
        viewModel.newTask.observe(this ) {
            edttxtvwTask.setText(it)
        }

        findViewById<AppCompatButton>(R.id.btn_save).setOnClickListener {
            viewModel.addTask()
        }
    }
}