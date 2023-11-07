package com.example.demo.graph.dfs.Number_of_Provinces

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Nested
import org.junit.jupiter.api.Test

class SolutionTest {

  @Nested
  @DisplayName("when unconnected graph")
  inner class UnConnectedGraph {
    private val solution = Solution()

    @Test
    fun `a vertex size is 3`() {
      // given
      val isConnected = Array(3) { intArrayOf(0, 0, 0) }
      // when
      val actual = solution.findCircleNum(isConnected)
      // then
      assertThat(actual).isEqualTo(3)
    }
    
    @Test
    fun `a vertex size is 1`() {
      // given
      val isConnected = Array(1) { intArrayOf(0, 0, 0) }
      // when
      val actual = solution.findCircleNum(isConnected)
      // then
      assertThat(actual).isEqualTo(1)
    }
  }

  @Nested
  @DisplayName("when all connected graph")
  inner class AllConnected {
    private val solution = Solution()

    @Test
    fun `a vertex size is 3`() {
      // given
      val isConnected = Array(3) { intArrayOf(1, 1, 1) }
      // when
      val actual = solution.findCircleNum(isConnected)
      // then
      assertThat(actual).isEqualTo(1)
    }
  }

  @Nested
  @DisplayName("when partitioned graph")
  inner class PartitionedGraph {
    private val solution = Solution()

    @Test
    fun `two division graph when a vertex size is 3`() {
      //given
      val isConnected = Array(3) { intArrayOf(0, 0, 0) }
      isConnected[0][0] = 1
      isConnected[0][1] = 1

      isConnected[1][0] = 1
      isConnected[1][1] = 1

      isConnected[2][2] = 1
      //when
      val actual = solution.findCircleNum(isConnected)
      //then
      assertThat(actual).isEqualTo(2)
    }
  }
}