package com.example.demo.hashing.Counting.Largest_Unique_Number

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class SolutionTest {

    @Test
    fun testCase0() {
        val nums = intArrayOf(1,2,3,4,5,5)
        val solution = Solution()
        val actual = solution.largestUniqueNumber(nums)
        val expected = 4
        assertEquals(expected, actual)
    }

    @Test
    fun `if the nums has no integer that only occurs once, the result should be -1`() {
        val nums = intArrayOf(1,1,2,2,3,3)
        val solution = Solution()
        val actual = solution.largestUniqueNumber(nums)
        val expected = -1
        assertEquals(expected, actual)
    }
}