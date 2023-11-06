package com.example.demo.bst.Validate_Binary_Search_Tree

import org.assertj.core.api.Assertions
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class Solution2Test {
  @Test
  fun testCase0() {
    //given
    val root = TreeNode(2)
    root.left = TreeNode(1)
    root.right = TreeNode(3)

    val solution = Solution2()
    //when
    val actual = solution.isValidBST(root)
    //then
    Assertions.assertThat(actual).isEqualTo(true)
  }

  @Test
  fun testCase1() {
    //given
    val root = TreeNode(5)
    root.left = TreeNode(1)
    root.right = TreeNode(4)

    val solution = Solution2()
    //when
    val actual = solution.isValidBST(root)
    //then
    Assertions.assertThat(actual).isEqualTo(false)
  }

  @Test
  fun testCase2() {
    //given
    val root = TreeNode(5)
    root.left = TreeNode(4)
    root.right = TreeNode(6)
    root.right?.left = TreeNode(3)
    root.right?.right = TreeNode(7)
    val solution = Solution2()
    //when
    val actual = solution.isValidBST(root)
    //then
    Assertions.assertThat(actual).isEqualTo(false)
  }

  @Test
  fun testCase3() {
    //given
    val root = TreeNode(Int.MAX_VALUE)
    val solution = Solution2()
    //when
    val actual = solution.isValidBST(root)
    //then
    Assertions.assertThat(actual).isEqualTo(true)
  }
}