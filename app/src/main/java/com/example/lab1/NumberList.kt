package com.example.lab1

import kotlin.random.Random

class NumberList {
    private var numbers: List<Int> = List(10) { Random.nextInt(1, 100) }

    private fun getResultList(): List<Int> {
        return numbers.groupingBy { it }
            .eachCount()
            .filter { it.value > 1 }
            .keys
            .toList()
    }

    fun getBasicListToText(): String {
        return "Исходный список: " + numbers.joinToString()
    }

    fun getUpdatedListToText(): String {
        return  "Исходный список: " + numbers.joinToString() + "\n" +
                "Измененный список: " + getResultList().joinToString()
    }

    fun update() {
        numbers = List(10) { Random.nextInt(1, 100) }
    }
}