package com.example.demo.hashing.More_Hashing_Examples.Max_Sum_of_a_Pair_With_Equal_Sum_of_Digits

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class SolutionTest {

    @Test
    fun testCase0() {
        val nums = intArrayOf(18,43,36,13,7)
        val solution = Solution()
        val actual = solution.maximumSum(nums)
        val expected = 54
        assertEquals(expected, actual)
    }
}
