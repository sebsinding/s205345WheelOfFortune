package com.example.s205345wheeloffortune.model

class Player{
    private var points = 0
    private var lives = 5

    fun changePoints(change: Int){
        points += change
    }

    fun changeLives(change: Int){
        lives += change
    }

}