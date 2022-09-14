package com.example.demo.majority_element

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class SolutionTest {
    
    @Test
    fun `testCase_1`() {
        // given
        val solution = Solution()
        val nums = intArrayOf(3,2,3)
        // when
        val actual = solution.majorityElement(nums)
        // then
        assertEquals(3, actual)
    }

    @Test
    fun `testCase_2`() {
        // given
        val solution = Solution()
        val nums = intArrayOf(2,2,1,1,1,2,2)
        // when
        val actual = solution.majorityElement(nums)
        // then
        assertEquals(2, actual)
    }

    @Test
    fun `testCase_3`() {
        // given
        val solution = Solution()
        val nums = intArrayOf(4,4,4)
        // when
        val actual = solution.majorityElement(nums)
        // then
        assertEquals(4, actual)
    }

    @Test
    fun `testCase_4`() {
        // given
        val solution = Solution()
        val nums = intArrayOf(2,4,4)
        // when
        val actual = solution.majorityElement(nums)
        // then
        assertEquals(4, actual)
    }
}
