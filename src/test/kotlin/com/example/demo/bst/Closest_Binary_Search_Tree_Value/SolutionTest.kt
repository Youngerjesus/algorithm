package com.example.demo.bst.Closest_Binary_Search_Tree_Value

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class SolutionTest {
  val solution = Solution()

  @Test
  fun `if a target equals root node value`() {
    //given
    val root = TreeNode(50)
    // when
    val actual = solution.closestValue(root, 50.00)
    //then
    assertThat(actual).isEqualTo(root.`val`)
  }

  @Test
  fun `if a target equals a leaf node of root`() {
    //given
    val root = TreeNode(50)
    root.left = TreeNode(30)
    root.right = TreeNode(70)
    root.left?.right = TreeNode(40)
    root.left?.left = TreeNode(20)
    //when
    val actual = solution.closestValue(root, 20.00)
    //then
    assertThat(actual).isEqualTo(root.left?.left?.`val`)
  }

  @Test
  fun `if a target less than a leaf node of root`() {
    //given
    val root = TreeNode(50)
    root.left = TreeNode(30)
    root.right = TreeNode(70)
    root.left?.right = TreeNode(40)
    root.left?.left = TreeNode(20)
    //when
    val actual = solution.closestValue(root, 10.00)
    //then
    assertThat(actual).isEqualTo(root.left?.left?.`val`)
  }

  @Test
  fun `if a target greater than a leaf node of root`() {
    //given
    val root = TreeNode(50)
    root.left = TreeNode(30)
    root.right = TreeNode(70)
    root.left?.right = TreeNode(40)
    root.left?.left = TreeNode(20)
    //when
    val actual = solution.closestValue(root, 80.00)
    //then
    assertThat(actual).isEqualTo(root.right?.`val`)
  }

  @Test
  fun `if a target is the middle value of parent node and child node`() {
    // given
    val root = TreeNode(50)
    root.left = TreeNode(30)
    root.left?.right = TreeNode(40)
    root.left?.left = TreeNode(20)
    // when
    val actual = solution.closestValue(root, 35.00)
    // then
    assertThat(actual).isEqualTo(root.left?.`val`)
  }

  @Test
  fun `if a target is the middle value of parent node and child node (2)`() {
    // given
    val root = TreeNode(50)
    root.left = TreeNode(30)
    root.left?.right = TreeNode(40)
    root.left?.left = TreeNode(20)
    // when
    val actual = solution.closestValue(root, 25.00)
    // then
    assertThat(actual).isEqualTo(root.left?.left?.`val`)
  }

  @Test
  fun `if the navigation range of tree is gradually narrowing for finding the correct value`() {
    // given
    val root = TreeNode(36)
    root.left = TreeNode(13)
    root.right = TreeNode(50)
    root.left?.left = TreeNode(4)
    root.left?.right = TreeNode(20)
    root.left?.left?.left = TreeNode(1)
    root.left?.left?.right = TreeNode(5)
    root.left?.left?.left?.left = TreeNode(0)
    root.left?.left?.left?.right = TreeNode(2)
    root.left?.left?.left?.right?.right = TreeNode(3)
    // when
    val actual = solution.closestValue(root, 3.1415)
    // then
    assertThat(actual).isEqualTo(3)
  }

  @Test
  fun `if the navigation range of tree is gradually narrowing for finding the correct value (2)`() {
    // given
    val root = TreeNode(4)
    root.left = TreeNode(2)
    root.right = TreeNode(5)
    root.left?.left = TreeNode(1)
    root.left?.right = TreeNode(3)
    // when
    val actual = solution.closestValue(root, 3.71)
    // then
    assertThat(actual).isEqualTo(root.`val`)
  }
}