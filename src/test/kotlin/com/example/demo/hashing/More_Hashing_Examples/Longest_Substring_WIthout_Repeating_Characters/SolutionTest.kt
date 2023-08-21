package com.example.demo.hashing.More_Hashing_Examples.Longest_Substring_WIthout_Repeating_Characters

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class SolutionTest {

    @Test
    fun testCase0() {
        val s = "abcdefg"
        val solution = Solution()
        val actual = solution.lengthOfLongestSubstring(s)
        val expected = 7
        assertEquals(expected, actual)
    }

    @Test
    fun testCase1() {
        val s = "abcbefg"
        val solution = Solution()
        val actual = solution.lengthOfLongestSubstring(s)
        val expected = 5
        assertEquals(expected, actual)
    }
}