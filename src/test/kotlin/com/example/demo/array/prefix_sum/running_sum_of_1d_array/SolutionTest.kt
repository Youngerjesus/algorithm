package com.example.demo.array.prefix_sum.running_sum_of_1d_array

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test
import kotlin.math.exp

class SolutionTest {

    @Test
    fun testCase0() {
        val nums = intArrayOf(1, 2, 3, 4)
        val expected = intArrayOf(1, 3, 6, 10)
        val solution = Solution()
        assertArrayEquals(expected, solution.runningSum(nums))
    }
}