package com.example.demo.Multiply_Strings

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test
import kotlin.math.exp

class SolutionTest {

    @Test
    fun `testCase 3`() {
        // given
        val solution = Solution()
        val num1 = "123"
        val num2 = "123"
        val expected = "15129"
        // when
        val actual = solution.multiply(num1, num2)
        // then
        assertEquals(expected, actual)
    }
}
