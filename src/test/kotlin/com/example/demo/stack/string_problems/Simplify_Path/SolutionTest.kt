package com.example.demo.stack.string_problems.Simplify_Path

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class SolutionTest {

    @Test
    fun testCase0() {
        val path = "/./home/foo"
        val solution = Solution()

        val actual = solution.simplifyPath(path)
        val expected = "/home/foo"

        assertEquals(expected, actual)
    }

    @Test
    fun testCase1() {
        val path = "/../"
        val solution = Solution()

        val actual = solution.simplifyPath(path)
        val expected = "/"

        assertEquals(expected, actual)
    }

    @Test
    fun testCase2() {
        val path = "/home//foo"
        val solution = Solution()

        val actual = solution.simplifyPath(path)
        val expected = "/home/foo"

        assertEquals(expected, actual)
    }

    @Test
    fun testCase3() {
        val path = "/home//foo/"
        val solution = Solution()

        val actual = solution.simplifyPath(path)
        val expected = "/home/foo"

        assertEquals(expected, actual)
    }

    @Test
    fun testCase4() {
        val path = "/a/./b/../../c/"
        val solution = Solution()

        val actual = solution.simplifyPath(path)
        val expected = "/c"

        assertEquals(expected, actual)
    }
}
