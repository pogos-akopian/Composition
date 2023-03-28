package com.pogos.myapplication.domain.entity

data class Question(
    val sum: Int,
    val visibleNumber: Int,
    val options: List<Int>
) {

    val correctAnswer: Int
        get() = sum - visibleNumber
}