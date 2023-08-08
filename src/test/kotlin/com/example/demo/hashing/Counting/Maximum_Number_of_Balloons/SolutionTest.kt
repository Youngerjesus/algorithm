package com.example.demo.hashing.Counting.Maximum_Number_of_Balloons

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class SolutionTest {

    @Test
    fun testCase0() {
        val text = "balloonballoonx"
        val solution = Solution()
        val actual = solution.maxNumberOfBalloons(text)
        val expected = 2
        assertEquals(expected, actual)
    }

    @Test
    fun testCase1() {
        val text = "xxxxxxxx"
        val solution = Solution()
        val actual = solution.maxNumberOfBalloons(text)
        val expected = 0
        assertEquals(expected, actual)
    }

    @Test
    fun testCase2() {
        val text = "balon"
        val solution = Solution()
        val actual = solution.maxNumberOfBalloons(text)
        val expected = 0
        assertEquals(expected, actual)
    }
}