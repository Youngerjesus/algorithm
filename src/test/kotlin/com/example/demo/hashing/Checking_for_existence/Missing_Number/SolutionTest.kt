package com.example.demo.hashing.Checking_for_existence.Missing_Number

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class SolutionTest {

    @Test
    fun testCase0() {
        val nums = intArrayOf(0,1,2,4,5)
        val solution = Solution()
        val actual = solution.missingNumber(nums)
        val expected = 3
        assertEquals(expected, actual)
    }

    @Test
    fun testCase1() {
        val nums = intArrayOf(0,1)
        val solution = Solution()
        val actual = solution.missingNumber(nums)
        val expected = 2
        assertEquals(expected, actual)
    }
}