package com.example.demo.array.prefix_sum.K_Radius_Subarray_Averages

import org.junit.jupiter.api.Assertions.assertArrayEquals
import org.junit.jupiter.api.Test


class SolutionTest {

    @Test
    fun testCase0() {
        val nums = intArrayOf(7,4,3,9,1,8,5,2,6)
        val k = 3
        val solution = Solution()
        val actual = solution.getAverages(nums, k)
        val expected = intArrayOf(-1,-1,-1,5,4,4,-1,-1,-1)
        assertArrayEquals(expected, actual)
    }

    @Test
    fun testCase1() {
        val nums = intArrayOf(10000,10000,10000,10000,10000,10000,10000,10000,10000,10000)
        val k = 4
        val solution = Solution()
        val actual = solution.getAverages(nums, k)
        val expected = intArrayOf(-1,-1,-1,-1,10000,10000,-1,-1,-1,-1)
        assertArrayEquals(expected, actual)
    }

    @Test
    fun `if k is zero, the result array should equals nums`() {
        val nums = intArrayOf(1, 2, 3)
        val k = 0
        val solution = Solution()
        val actual = solution.getAverages(nums, k)
        val expected = intArrayOf(1, 2, 3)
        assertArrayEquals(expected, actual)
    }

    @Test
    fun `if k is greater than or equal to nums array size, the result array should be all -1`() {
        val nums = intArrayOf(1, 2, 3)
        val k = 3
        val solution = Solution()
        val actual = solution.getAverages(nums, k)
        val expected = intArrayOf(-1, -1, -1)
        assertArrayEquals(expected, actual)
    }
}