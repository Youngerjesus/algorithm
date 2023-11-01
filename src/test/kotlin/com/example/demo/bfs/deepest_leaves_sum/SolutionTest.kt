package com.example.demo.bfs.deepest_leaves_sum

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class SolutionTest {

  @Test
  fun testCase0() {
    //given
    val root = TreeNode(1)
    root.left = TreeNode(2)
    root.right = TreeNode(3)
    root.left?.left = TreeNode(4)
    root.left?.right = TreeNode(5)
    root.right?.right = TreeNode(6)
    root.left?.left?.left = TreeNode(7)
    root.right?.right?.right= TreeNode(8)

    val solution = Solution()
    //when
    val actual = solution.deepestLeavesSum(root)
    //then
    assertThat(actual).isEqualTo(15)
  }
}