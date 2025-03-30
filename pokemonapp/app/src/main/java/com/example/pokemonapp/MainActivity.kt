package com.example.pokemonapp

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        //configs
        setContentView(R.layout.activity_main)

        val meuTexto = findViewById<TextView>(R.id.texto)
        val btn = findViewById<Button>(R.id.button)

        btn.setOnClickListener {
            meuTexto.text = "Leo"
        }
    }
}