package com.example.demo.array.two_pointers.reverse_string

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class SolutionTest {

    @Test
    fun test0() {
        val s = "Hello".toCharArray()
        val solution = Solution();

        solution.reverseString(s)

        val expected = "olleH".toCharArray()

        expected.forEachIndexed { index, c ->
            assertEquals(c, s[index])
        }
    }

    @Test
    fun test1() {
        val s = "abcba".toCharArray()
        val solution = Solution();

        solution.reverseString(s)

        val expected = "abcba".toCharArray()

        expected.forEachIndexed { index, c ->
            assertEquals(c, s[index])
        }
    }
}