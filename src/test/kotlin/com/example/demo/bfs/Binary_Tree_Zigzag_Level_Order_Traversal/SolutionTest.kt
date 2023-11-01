package com.example.demo.bfs.Binary_Tree_Zigzag_Level_Order_Traversal

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class SolutionTest {

  @Test
  fun testCase0() {
    //given
    val root = TreeNode(3)
    root.left = TreeNode(9)
    root.right = TreeNode(20)
    root.right?.left = TreeNode(15)
    root.right?.right = TreeNode(7)

    val solution = Solution()
    //when
    val actual = solution.zigzagLevelOrder(root)
    //then
    assertThat(actual).isEqualTo(listOf(listOf(3), listOf(20, 9), listOf(15, 7)))
  }
}