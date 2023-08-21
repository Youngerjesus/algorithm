package com.example.demo.hashing.More_Hashing_Examples.Randsom_Note

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class SolutionTest {

    @Test
    fun testCase0() {
        val ransomNote = "aaa"
        val magazine = "aaab"
        val solution = Solution()
        val canConstruct = solution.canConstruct(ransomNote, magazine)
        assertTrue(canConstruct)
    }

    @Test
    fun testCase1() {
        val ransomNote = "aaaa"
        val magazine = "aaab"
        val solution = Solution()
        val canConstruct = solution.canConstruct(ransomNote, magazine)
        assertFalse(canConstruct)
    }

    @Test
    fun testCase2() {
        val ransomNote = "aaac"
        val magazine = "aaab"
        val solution = Solution()
        val canConstruct = solution.canConstruct(ransomNote, magazine)
        assertFalse(canConstruct)
    }
}