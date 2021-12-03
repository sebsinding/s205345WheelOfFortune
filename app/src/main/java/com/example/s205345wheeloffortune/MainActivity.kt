package com.example.s205345wheeloffortune

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import com.example.s205345wheeloffortune.databinding.ActivityMainBinding
import com.example.s205345wheeloffortune.model.LuckyWheel
import com.example.s205345wheeloffortune.model.Player

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var listIntent: Intent

    // Creates a wheel that can spin
    private val luckyWheel = LuckyWheel()

    //Creates a player
    private val player = Player()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Sets up view binding
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val spinImageView: ImageView = findViewById(R.id.spinImage)
        spinImageView.setImageResource(R.drawable.lucky_wheel)

        spinWheel()
    }


    private fun spinWheel(){
        // Clicking on spin button to go to random screen
        binding.spinButton.setOnClickListener {
            when (luckyWheel.spinWheel()){
                1 -> {
                    player.changeLives(1)
                    launchGainLife()
                }
                2 -> {
                    player.changeLives(-1)
                    launchLoseLife()
                }
                3 -> {
                    player.bankrupt()
                    launchBankrupt()
                }
                else -> {
                    launchChooseLetter()
                }
            }
         }
    }

    private fun launchChooseLetter(){
        listIntent = Intent(this, ChooseLetter::class.java)
        startActivity(listIntent)
    }

    private fun launchLoseLife(){
        listIntent = Intent(this, LoseLife::class.java)
        startActivity(listIntent)
    }

    private fun launchGainLife(){
        listIntent = Intent(this, GainLife::class.java)
        startActivity(listIntent)
    }

    private fun launchBankrupt(){
        listIntent = Intent(this, Bankrupt::class.java)
        startActivity(listIntent)
    }

}