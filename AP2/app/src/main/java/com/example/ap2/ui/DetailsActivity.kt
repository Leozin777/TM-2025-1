package com.example.ap2.ui

import android.os.Build
import android.os.Bundle
import android.widget.TextView
import androidx.annotation.RequiresApi
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import com.example.ap2.R
import com.example.ap2.data.Filme

class DetailsActivity : AppCompatActivity() {

    @RequiresApi(Build.VERSION_CODES.TIRAMISU)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_details)

        val toolbar = findViewById<Toolbar>(R.id.toolbar)
        setSupportActionBar(toolbar)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        val id = findViewById<TextView>(R.id.idFilme)
        val titulo = findViewById<TextView>(R.id.filmeTitulo)
        val diretor = findViewById<TextView>(R.id.filmeDiretor)
        val ano = findViewById<TextView>(R.id.filmeAno)
        val sinopse = findViewById<TextView>(R.id.filmeSinopse)

        intent.extras?.getSerializable("filme", Filme::class.java)?.let {
            id.text = it.id.toString()
            titulo.text = it.titulo
            diretor.text = it.diretor
            ano.text = it.anoLancamento.toString()
            sinopse.text = it.sinopse
        }
    }

    override fun onSupportNavigateUp(): Boolean {
        finish()
        return true
    }
}