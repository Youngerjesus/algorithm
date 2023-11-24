package com.example.demo.backtracking.Combination_Sum

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class SolutionTest {
  private val solution = Solution()

  @Test
  fun testCase0() {
    //given
    val candidates = intArrayOf(2, 3, 6, 7)
    val target = 7
    //when
    val actual = solution.combinationSum(candidates, target)
    //then
    assertArrayEquals(intArrayOf(2, 2, 3), actual[0].toIntArray())
  }
}