package com.example.ap2.ui

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.os.bundleOf
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.ap2.R
import com.example.ap2.data.Filme
import com.example.ap2.data.FilmeRepository
import com.example.ap2.ui.adapter.FilmeAdapter
import com.google.android.material.snackbar.Snackbar


class MainActivity : AppCompatActivity() {
    private val repository = FilmeRepository()
    private val filmes = repository.filmes.toMutableList()
    private lateinit var adapter: FilmeAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val recycler = findViewById<RecyclerView>(R.id.recyclerView)

        adapter = FilmeAdapter(
            onDelete = { filme -> deleteFilme(filme) },
            onDetails = { filme -> goToDetails(filme) }
        )

        recycler.adapter = adapter
        adapter.submitList(repository.filmes)
    }

    private fun deleteFilme(filme: Filme) {
        filmes.remove(filme)
        adapter.submitList(filmes.toList())
        Snackbar.make(findViewById(R.id.recyclerView), "Filme removido com sucesso", Snackbar.LENGTH_SHORT).show()
    }

    private fun goToDetails(filme: Filme) {
        val intent = Intent(this, DetailsActivity::class.java).apply {
            putExtras(Bundle().apply {
                putSerializable("filme", filme)
            })
        }
        startActivity(intent)
    }
}