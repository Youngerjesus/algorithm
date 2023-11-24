package com.example.demo.backtracking.Permutations

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class SolutionTest {

  private val solution = Solution()

  @Test
  fun `when nums is empty`() {
    //given
    val nums = intArrayOf()
    //when
    val actual = solution.permute(nums)
    //then
    assertThat(actual.size).isEqualTo(0)
  }

  @Test
  fun `when nums contains 1, 2, 3`() {
    // given
    val nums = intArrayOf(1, 2, 3)
    // when
    val actual = solution.permute(nums)
    // then
    assertThat(actual.size).isEqualTo(6)
    assertThat(listOf(1,2,3)).isIn(actual)
    assertThat(listOf(1,3,2)).isIn(actual)
  }

}
