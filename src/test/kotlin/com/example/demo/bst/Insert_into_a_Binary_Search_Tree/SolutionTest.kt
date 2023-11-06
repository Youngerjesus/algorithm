package com.example.demo.bst.Insert_into_a_Binary_Search_Tree

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Nested
import org.junit.jupiter.api.Test

class SolutionTest {

  @Nested
  inner class Insertion_TestCase {
    val root = TreeNode(50)
    val solution = Solution()

    @BeforeEach
    fun setUp() {
      root.left = TreeNode(30)
      root.right = TreeNode(60)
      root.left?.left = TreeNode(10)
    }

    @Test
    fun `insert value on a right subtree of Tree`() {
      //given
      //when
      solution.insertIntoBST(root, 40)
      solution.insertIntoBST(root, 70)
      //then
      assertThat(root.left?.right?.`val`).isEqualTo(40)
      assertThat(root.right?.right?.`val`).isEqualTo(70)
    }

    @Test
    fun `insert value on a left subtree of Tree`() {
      //given
      //when
      solution.insertIntoBST(root, 10)
      solution.insertIntoBST(root, 55)
      //then
      assertThat(root.left?.left?.`val`).isEqualTo(10)
      assertThat(root.right?.left?.`val`).isEqualTo(55)
    }
  }

  @Nested
  inner class Insertion_Only_Having_Root_TestCase {
    val root = TreeNode(50)
    val solution = Solution()

    @Test
    fun `insert values on children of root node`() {
      //given
      //when
      solution.insertIntoBST(root, 10)
      solution.insertIntoBST(root, 60)
      //then
      assertThat(root.left?.`val`).isEqualTo(10)
      assertThat(root.right?.`val`).isEqualTo(60)
    }
  }

  @Nested
  inner class Insertion_Only_Empty_Root_TestCase {
    var root: TreeNode? = null
    val solution = Solution()

    @Test
    fun `insert root node`() {
      //given
      //when
      val actual = solution.insertIntoBST(root, 50)
      //then
      assertThat(actual?.`val`).isEqualTo(50)
    }
  }
}