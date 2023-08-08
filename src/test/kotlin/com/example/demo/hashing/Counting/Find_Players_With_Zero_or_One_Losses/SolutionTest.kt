package com.example.demo.hashing.Counting.Find_Players_With_Zero_or_One_Losses

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class SolutionTest {

    @Test
    fun testCase0() {
        val matches = arrayOf(
            intArrayOf(1, 3),
            intArrayOf(2, 3),
            intArrayOf(3, 6),
            intArrayOf(5, 6),
            intArrayOf(5, 7),
            intArrayOf(4, 5),
            intArrayOf(4, 8),
            intArrayOf(4, 9),
            intArrayOf(10, 4),
            intArrayOf(10, 9)
        )

        val solution = Solution()
        val actual = solution.findWinners(matches)
        val expected = listOf(listOf(1, 2, 10), listOf(4, 5, 7, 8))
        assertEquals(expected, actual)
    }

}