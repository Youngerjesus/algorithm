package com.example.demo.stack.string_problems.Make_The_String_Great

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test
import kotlin.math.exp

class SolutionTest {

    @Test
    fun testCase0() {
        val s = "AabBCc"
        val solution = Solution()

        val actual = solution.makeGood(s)
        val expected = ""

        assertEquals(expected, actual)
    }

    @Test
    fun testCase1() {
        val s = "aaAa"
        val solution = Solution()

        val actual = solution.makeGood(s)
        val expected = "aa"

        assertEquals(expected, actual)
    }
}