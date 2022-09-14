package com.example.demo.single_number

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun `testcase_1`() {
        // given
        val solution = Solution()
        val nums = intArrayOf(2, 2, 1)
        // when
        val actual = solution.singleNumber(nums)
        // then
        assertEquals(1, actual)
    }

    @Test
    fun `testcase_2`() {
        // given
        val solution = Solution()
        val nums = intArrayOf(4,1,2,1,2)
        // when
        val actual = solution.singleNumber(nums)
        // then
        assertEquals(4, actual)
    }

    @Test
    fun `testcase_3`() {
        // given
        val solution = Solution()
        val nums = intArrayOf(1)
        // when
        val actual = solution.singleNumber(nums)
        // then
        assertEquals(1, actual)
    }
}
