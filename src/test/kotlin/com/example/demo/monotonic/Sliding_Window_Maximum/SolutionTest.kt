package com.example.demo.monotonic.Sliding_Window_Maximum

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test
import kotlin.math.exp

class SolutionTest {

    @Test
    fun testCase0() {
        val nums = intArrayOf(1, 3, -1, -3, 5, 3, 6, 7)
        val k = 3
        val solution = Solution()

        val actual = solution.maxSlidingWindow(nums, k)
        val expected = intArrayOf(3, 3, 5, 5, 6, 7)
        assertArrayEquals(expected, actual)
    }

    @Test
    fun testCase1() {
        val nums = intArrayOf(1, 3, -1, 2, 1)
        val k = 3
        val solution = Solution()

        val actual = solution.maxSlidingWindow(nums, k)
        val expected = intArrayOf(3, 3, 2)
        assertArrayEquals(expected, actual)
    }

    @Test
    fun testCase2() {
        val nums = intArrayOf(1, -1)
        val k = 1
        val solution = Solution()

        val actual = solution.maxSlidingWindow(nums, k)
        val expected = intArrayOf(1, -1)
        assertArrayEquals(expected, actual)
    }

}