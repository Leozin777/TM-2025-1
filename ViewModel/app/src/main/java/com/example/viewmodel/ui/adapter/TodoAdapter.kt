package com.example.viewmodel.ui.adapter

import com.example.viewmodel.data.model.Todo
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.ListAdapter
import com.example.viewmodel.R

class TodoAdapter(
    private val onDelete: (Todo) -> Unit,
    private val onDetails: (Todo) -> Unit
) : ListAdapter<Todo, TodoViewHolder>(TodoDiffCallback()) {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TodoViewHolder {
        val itemView =
            LayoutInflater.from(parent.context).inflate(R.layout.todo_item_list, parent, false)
        return TodoViewHolder(itemView = itemView, onDelete = onDelete, onDetails = onDetails)
    }

    override fun onBindViewHolder(holder: TodoViewHolder, position: Int) {
        holder.bind(getItem(position))
    }
}