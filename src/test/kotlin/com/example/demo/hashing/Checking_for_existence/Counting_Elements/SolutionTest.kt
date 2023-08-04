package com.example.demo.hashing.Checking_for_existence.Counting_Elements

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class SolutionTest {

    @Test
    fun testCase0() {
        val nums = intArrayOf(1,2,3)
        val solution = Solution()
        val actual = solution.countElements(nums)
        val expected = 2
        assertEquals(expected, actual)
    }

    @Test
    fun testCase1() {
        val nums = intArrayOf(1,1,3,3,5,5,7,7)
        val solution = Solution()
        val actual = solution.countElements(nums)
        val expected = 0
        assertEquals(expected, actual)
    }
}