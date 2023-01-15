package com.example.demo.kmp.LongestHappyPrefix

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class SolutionTest {

    @Test
    fun `testCase 1`() {
        // given
        val s = "level"
        val solution = Solution()
        // when
        val actual = solution.longestPrefix(s)
        // then
        assertEquals("l", actual)
    }

    @Test
    fun `testCase 2`() {
        // given
        val s = "ababab"
        val solution = Solution()
        // when
        val actual = solution.longestPrefix(s)
        // then
        assertEquals("abab", actual)
    }
}
