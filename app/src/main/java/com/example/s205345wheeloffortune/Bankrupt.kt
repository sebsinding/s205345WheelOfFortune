package com.example.s205345wheeloffortune

import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import com.example.s205345wheeloffortune.databinding.FragmentBankruptBinding

class Bankrupt : AppCompatActivity(){

    private lateinit var binding: FragmentBankruptBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = FragmentBankruptBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val gainLifeImageView: ImageView = findViewById(R.id.bankruptImage)
        gainLifeImageView.setImageResource(R.drawable.bankrupt)

    }

}