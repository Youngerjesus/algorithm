package com.example.demo.queue.Moving_Average_from_Data_Stream

import kotlin.math.round

class MovingAverage(size: Int) {
    private val capacity = size
    private val queue = ArrayDeque<Int>()

    fun next(data: Int): Double {
        if (queue.size >= capacity) {
            queue.removeLast()
        }

        queue.addFirst(data)

        return average()
    }

    private fun average(): Double {
        var sum = 0.0
        for (i in 0 until queue.size) {
            sum += queue[i]
        }

        return sum / queue.size
    }
}