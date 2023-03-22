package com.pogos.myapplication.domain.repository

import com.pogos.myapplication.domain.entity.GameSettings
import com.pogos.myapplication.domain.entity.Level
import com.pogos.myapplication.domain.entity.Question

interface GameRepository {

    fun generateQuestion(
        maxSumValue: Int,
        countOfOptions: Int
    ): Question

    fun getGameSettings(level: Level): GameSettings
}