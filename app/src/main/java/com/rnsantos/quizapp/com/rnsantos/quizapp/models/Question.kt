package com.rnsantos.quizapp.com.rnsantos.quizapp.models

data class Question (
    val question: String,
    val options: List<String>,
    val correct: Int,
    var answer: Int)
