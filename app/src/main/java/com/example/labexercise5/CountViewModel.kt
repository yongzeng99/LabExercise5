package com.example.labexercise5
import android.util.Log
import androidx.lifecycle.ViewModel

class CountViewModel : ViewModel() {
    var countLike: Int = 0
    var countDislike: Int = 0

    init {
        resetCounter()

        Log.d("CounterViewModel", "ViewModel created")
    }

    private fun resetCounter(){
        countLike = 0
        countDislike = 0
    }

    fun onThumbsUp(){
        countLike++
    }

    fun onThumbsDown(){
        countDislike++
    }

    override fun onCleared() {
        Log.d("CounterViewModel", "ViewModel destroyed")
        super.onCleared()
    }
}