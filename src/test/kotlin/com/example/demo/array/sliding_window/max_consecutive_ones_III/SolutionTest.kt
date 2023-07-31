package com.example.demo.array.sliding_window.max_consecutive_ones_III

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class SolutionTest {

    @Test
    fun testCase0() {
        val nums = intArrayOf(1,1,1,0,0,0,1,1,1,1,0)
        val k = 2
        val solution = Solution()
        val expected = 6
        assertEquals(expected, solution.longestOnes(nums, k))
    }
}