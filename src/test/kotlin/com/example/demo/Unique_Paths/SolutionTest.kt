package com.example.demo.Unique_Paths

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test

class SolutionTest {
    lateinit var solution: Solution

    @BeforeEach
    fun setUp() {
        solution = Solution()
    }

    @Test
    fun `testCase_1`() {
       //given
       val m = 3
       val n = 7
       //when
       val result = solution.uniquePaths(m, n)
       //then
       assertEquals(28, result)
    }

    @Test
    fun `testCase_2`() {
        //given
        val m = 3
        val n = 2
        //when
        val result = solution.uniquePaths(m, n)
        //then
        assertEquals(3, result)
    }
}
