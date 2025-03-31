package com.example.pokemonapp
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import com.bumptech.glide.Glide

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        //configs
        setContentView(R.layout.activity_main)
        val btn = findViewById<Button>(R.id.button)
        val imageView = findViewById<ImageView>(R.id.imageView)

        getPhotoRandom(number = 1, imageView = imageView)

        (1..200).random()
        btn.setOnClickListener {
            val number = (1..200).random()
            getPhotoRandom(number = number, imageView = imageView)
        }
    }

    private fun getPhotoRandom(number: Int, imageView: ImageView){
        Glide
            .with(this)
            .load("https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/${number}.png")
            .into(imageView)
    }
}