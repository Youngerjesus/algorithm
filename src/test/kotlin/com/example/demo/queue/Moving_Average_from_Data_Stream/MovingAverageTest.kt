package com.example.demo.queue.Moving_Average_from_Data_Stream

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class MovingAverageTest {

    @Test
    fun testCase0() {
        val movingAverage = MovingAverage(3)

        val actual0 = movingAverage.next(1)
        val actual1 = movingAverage.next(10)
        val actual2 = movingAverage.next(3)
        val actual3 = movingAverage.next(5)

        assertEquals(1.0, actual0)
        assertEquals(5.5, actual1)
        assertEquals(4.66667, actual2)
        assertEquals(6.0, actual3)
    }
}