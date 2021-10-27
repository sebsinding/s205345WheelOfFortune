package com.example.s205345wheeloffortune

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.s205345wheeloffortune.model.LuckyWheel

class MainActivity : AppCompatActivity() {

    private val luckyWheel = LuckyWheel()
    private val BANKRUPT = "BANKRUPT"
    private val MISSED_TURN = "MISSED_TURN"
    private val EKSTRA_TURN = "EKSTRA_LIFE"
    private val CHOOSE_LETTER = "CHOOSE_LETTER"
    private val SPIN_WHEEL = "SPIN_WHEEL"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.choose_letter)

    }


    private fun clickSpinButton{
        when(luckyWheel.spinWheel()){
            1 -> {

            }
            2 -> {

            }
            3 -> {

            }
            4 -> {

            }
        }

    }
}