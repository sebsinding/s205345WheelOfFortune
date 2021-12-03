package com.example.s205345wheeloffortune

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.s205345wheeloffortune.databinding.FragmentChooseLetterBinding

class ChooseLetter : AppCompatActivity() {

    private lateinit var binding: FragmentChooseLetterBinding

    private var gameWon = false
    private val word = chooseWord()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = FragmentChooseLetterBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }

    //Creates a array of words
    var words: Array<String> = arrayOf(
        "Italy", "Denmark", "Sweden", "Spain", "Germany", "France",
        "America", "Japan", "Russia", "China", "Brazil", "Australia"
    )

    //A function that returns one word from the words array
    private fun chooseWord(): String {
        val randomNumber = (1..12).random()
        return words[randomNumber-1]
    }
}