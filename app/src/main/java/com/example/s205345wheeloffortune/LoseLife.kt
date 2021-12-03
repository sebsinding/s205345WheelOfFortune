package com.example.s205345wheeloffortune

import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import com.example.s205345wheeloffortune.databinding.FragmentLoseLifeBinding

class LoseLife : AppCompatActivity(){

    private lateinit var binding: FragmentLoseLifeBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = FragmentLoseLifeBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val gainLifeImageView: ImageView = findViewById(R.id.loseLifeImage)
        gainLifeImageView.setImageResource(R.drawable.broken_heart)
    }
}