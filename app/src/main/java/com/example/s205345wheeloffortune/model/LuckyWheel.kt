package com.example.s205345wheeloffortune.model

class LuckyWheel {
    fun spinWheel(): Int {
        return (1..7).random()
    }
}