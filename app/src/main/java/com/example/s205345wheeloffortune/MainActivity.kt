package com.example.s205345wheeloffortune

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.s205345wheeloffortune.model.LuckyWheel



class MainActivity : AppCompatActivity() {

    // Creates a wheel that can spin
    private val luckyWheel = LuckyWheel()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.spin_wheel)

        val button = findViewById<Button>(R.id.spinButton)
        button.setOnClickListener(){clickSpinButton()}

    }

    private fun clickSpinButton(){
        when(luckyWheel.spinWheel()){
            1 -> { startActivity(Intent(this,Bankrupt::class.java)) }
            2 -> { startActivity(Intent(this,ChooseLetter::class.java)) }
            3 -> { startActivity(Intent(this,LifeGained::class.java)) }
            4 -> { startActivity(Intent(this,LifeLost::class.java)) }
        }

    }
}