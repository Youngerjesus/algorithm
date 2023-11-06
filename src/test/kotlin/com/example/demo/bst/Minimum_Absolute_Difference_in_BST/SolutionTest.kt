package com.example.demo.bst.Minimum_Absolute_Difference_in_BST

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class SolutionTest {

  @Test
  fun testCase0() {
    //given
    val root = TreeNode(4)
    root.left = TreeNode(2)
    root.right = TreeNode(6)
    root.left?.left = TreeNode(1)
    root.left?.right = TreeNode(3)

    val solution = Solution()
    //when
    val actual = solution.getMinimumDifference(root)
    //then
    assertThat(actual).isEqualTo(1)
  }

  @Test
  fun testCase1() {
    //given
    val root = TreeNode(1)
    root.right = TreeNode(2)

    val solution = Solution()
    //when
    val actual = solution.getMinimumDifference(root)
    //then
    assertThat(actual).isEqualTo(1)
  }
}