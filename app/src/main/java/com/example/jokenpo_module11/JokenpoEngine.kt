package com.example.jokenpo_module11

import kotlin.random.Random

enum class Result {
    WIN, DRAW, LOSS
}

class JokenpoEngine(private val availablePlays: Array<String>) {

    private fun getAIPlay() : String{
        val playIndex = Random.nextInt(0,2)
        return availablePlays[playIndex]
    }

    fun calculateResult(playerPlay: String): Result{
        val aiPlay = getAIPlay()

        return when{
            playerPlay == aiPlay -> Result.DRAW
            playerPlay == "Rock" && aiPlay == "Scissor" -> Result.WIN
            playerPlay == "Rock" && aiPlay == "Paper" -> Result.LOSS
            playerPlay == "Paper" && aiPlay == "Rock" -> Result.WIN
            playerPlay == "Paper" && aiPlay == "Scissor" -> Result.LOSS
            playerPlay == "Scissor" && aiPlay == "Paper" -> Result.WIN
            else -> Result.LOSS

        }
    }

}