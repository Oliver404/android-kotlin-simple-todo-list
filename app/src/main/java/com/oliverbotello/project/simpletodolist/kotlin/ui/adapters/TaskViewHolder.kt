package com.oliverbotello.project.simpletodolist.kotlin.ui.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.widget.AppCompatCheckBox
import androidx.appcompat.widget.AppCompatTextView
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.oliverbotello.project.simpletodolist.kotlin.R
import com.oliverbotello.project.simpletodolist.kotlin.models.Task

class TaskViewHolder(itemView: View) : ViewHolder(itemView) {
    companion object {
        fun getInstance(viewGroup: ViewGroup): TaskViewHolder =
            TaskViewHolder(
                LayoutInflater.from(viewGroup.context).inflate(R.layout.vh_task, viewGroup)
            )
    }

    private val chckbxDone: AppCompatCheckBox
    private val txtvwTask: AppCompatTextView

    init {
        chckbxDone = itemView.findViewById(R.id.chckbx_done)
        txtvwTask = itemView.findViewById(R.id.txtvw_task)
    }

    fun bind(task: Task) {
        chckbxDone.isChecked = task.status
        txtvwTask.text = task.task
    }
}