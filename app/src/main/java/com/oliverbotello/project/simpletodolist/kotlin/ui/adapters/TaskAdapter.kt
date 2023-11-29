package com.oliverbotello.project.simpletodolist.kotlin.ui.adapters

import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView.Adapter
import com.oliverbotello.project.simpletodolist.kotlin.models.Task

class TaskAdapter(private val lstTasks: List<Task>) : Adapter<TaskViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TaskViewHolder =
        TaskViewHolder.getInstance(parent)

    override fun getItemCount(): Int = lstTasks.size

    override fun onBindViewHolder(holder: TaskViewHolder, position: Int) {
        holder.bind(lstTasks[position])
    }
}