package com.example.demo.array.Minimum_Value_to_Get_Positive_Step_by_Step_Sum

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class SolutionTest {

    @Test
    fun testCase0() {
        val nums = intArrayOf(-3,2,-3,4,2)
        val solution = Solution()
        val actual = solution.minStartValue(nums)
        val expected = 5
        assertEquals(expected, actual)
    }
}