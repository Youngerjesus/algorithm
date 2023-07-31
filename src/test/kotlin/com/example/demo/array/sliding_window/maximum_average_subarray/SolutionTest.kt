package com.example.demo.array.sliding_window.maximum_average_subarray

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class SolutionTest {

    @Test
    fun testCase0() {
        val nums = intArrayOf(1, 2, 3, 4, 5, 6, 7, 8)
        val k = 4
        val solution = Solution()
        val expected = 26.0 / 4.0
        assertEquals(expected, solution.findMaxAverage(nums, k))
    }
}