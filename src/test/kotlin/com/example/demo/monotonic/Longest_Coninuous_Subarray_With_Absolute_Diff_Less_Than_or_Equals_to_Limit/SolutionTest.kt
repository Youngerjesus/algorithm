package com.example.demo.monotonic.Longest_Coninuous_Subarray_With_Absolute_Diff_Less_Than_or_Equals_to_Limit

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class SolutionTest {

    @Test
    fun testCase0() {
        // given
        val nums = intArrayOf(10,1,2,4,7,2)
        val limit = 5
        val solution = Solution()
        //when
        val actual = solution.longestSubarray(nums, limit)
        //then
        val expected = 4
        assertEquals(expected, actual)
    }

    @Test
    fun testCase1() {
        // given
        val nums = intArrayOf(4,2,2,2,4,4,2,2)
        val limit = 0
        val solution = Solution()
        //when
        val actual = solution.longestSubarray(nums, limit)
        //then
        val expected = 3
        assertEquals(expected, actual)
    }

    @Test
    fun testCase2() {
        // given
        val nums = intArrayOf(2,2)
        val limit = 0
        val solution = Solution()
        //when
        val actual = solution.longestSubarray(nums, limit)
        //then
        val expected = 2
        assertEquals(expected, actual)
    }
}