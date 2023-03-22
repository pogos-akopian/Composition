package com.pogos.myapplication.domain.usecases

import com.pogos.myapplication.domain.entity.GameSettings
import com.pogos.myapplication.domain.entity.Level
import com.pogos.myapplication.domain.repository.GameRepository

class GetGameSettingsUseCase(
    private val repository: GameRepository
) {

    operator fun invoke(level: Level): GameSettings {
        return repository.getGameSettings(level)
    }
}