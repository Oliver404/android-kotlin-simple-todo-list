package com.oliverbotello.project.simpletodolist.kotlin.ui

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel() {
    private val lstTask: MutableList<String> = mutableListOf()
    private val _newTask: MutableLiveData<String> = MutableLiveData("")
    val newTask: LiveData<String> = _newTask

    fun onNewTaskChange(task: String) {
        _newTask.value = task
    }

    fun addTask() {
        val task = _newTask.value

        if (!task.isNullOrEmpty()) {
            _newTask.value = ""
            lstTask.add(task)
        }
    }
}