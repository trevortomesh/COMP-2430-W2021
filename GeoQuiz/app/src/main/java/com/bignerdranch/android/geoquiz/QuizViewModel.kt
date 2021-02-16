package com.bignerdranch.android.geoquiz

import android.util.Log
import androidx.lifecycle.ViewModel

private const val TAG = "QuizViewModel"

class QuizViewModel : ViewModel(){

    var currentIndex = 0

    private val questionBank = listOf(
        Question(R.string.question_Manitoba, false),
        Question(R.string.question_Alberta, false),
        Question(R.string.question_provinces, true),
        Question(R.string.question_Saskatchewan, true),
        Question(R.string.capital_canada, false),
        Question(R.string.question_spark, false),
        Question(R.string.question_superior, true)
    )

    val currentQuestionAnswer: Boolean
        get() = questionBank[currentIndex].answer

    val currentQuestionText: Int
        get() = questionBank[currentIndex].textResId

    fun moveToNext(){
        currentIndex = (currentIndex + 1) % questionBank.size
    }


    }


