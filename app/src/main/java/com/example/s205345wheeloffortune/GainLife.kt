package com.example.s205345wheeloffortune

import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import com.example.s205345wheeloffortune.databinding.FragmentGainLifeBinding

class GainLife : AppCompatActivity() {

    private lateinit var binding: FragmentGainLifeBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = FragmentGainLifeBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val gainLifeImageView: ImageView = findViewById(R.id.gainLifeImage)
        gainLifeImageView.setImageResource(R.drawable.heart)

    }
}