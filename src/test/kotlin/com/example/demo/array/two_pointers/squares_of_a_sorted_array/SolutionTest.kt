package com.example.demo.array.two_pointers.squares_of_a_sorted_array

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class SolutionTest {

    @Test
    fun `if nums array contains only positive numbers`() {
        val nums = intArrayOf(1, 2, 5, 10)
        val solution = Solution()

        val actual = solution.sortedSquares(nums)
        val expected = intArrayOf(1, 4, 25, 100)

        assertArrayEquals(expected, actual)
    }


    @Test
    fun `if nums array contains only negative numbers`() {
        val nums = intArrayOf(-10, -5, -2, -1)
        val solution = Solution()

        val actual = solution.sortedSquares(nums)
        val expected = intArrayOf(1, 4, 25, 100)

        assertArrayEquals(expected, actual)
    }

    @Test
    fun `if nums array contains both positive and negative numbers but does not contains 0`() {
        val nums = intArrayOf(-4, -3, 1, 2)
        val solution = Solution()

        val actual = solution.sortedSquares(nums)
        val expected = intArrayOf(1, 4, 9, 16)

        assertArrayEquals(expected, actual)
    }

    @Test
    fun `if nums array contains both positive and negative numbers and 0`() {
        val nums = intArrayOf(-4, -3, 0, 1, 2)
        val solution = Solution()

        val actual = solution.sortedSquares(nums)
        val expected = intArrayOf(0, 1, 4, 9, 16)

        assertArrayEquals(expected, actual)
    }

    @Test
    fun `if nums array contains duplicate square numbers`() {
        val nums = intArrayOf(-7, -3, 2, 3, 11)
        val solution = Solution()

        val actual = solution.sortedSquares(nums)
        val expected = intArrayOf(4, 9, 9, 49, 121)

        assertArrayEquals(expected, actual)
    }

    @Test
    fun `regression test0`() {
        val nums = intArrayOf(-2, 1, 3)
        val solution = Solution()

        val actual = solution.sortedSquares(nums)
        val expected = intArrayOf(1, 4, 9)

        assertArrayEquals(expected, actual)
    }
}