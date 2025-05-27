package com.example.ap2.ui.adapter

import FilmeDiffCallback
import FilmeViewHolder
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.ListAdapter
import com.example.ap2.R
import com.example.ap2.data.Filme

class FilmeAdapter(private val onDelete: (Filme) -> Unit, private val onDetails: (Filme) -> Unit) : ListAdapter<Filme, FilmeViewHolder>(FilmeDiffCallback()) {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FilmeViewHolder {
        val itemView =
            LayoutInflater.from(parent.context).inflate(R.layout.item_filme, parent, false)
        return FilmeViewHolder(itemView, onDelete, onDetails)
    }

    override fun onBindViewHolder(holder: FilmeViewHolder, position: Int) {
        holder.bind(getItem(position))
    }
}