package com.example.demo.dfs.Diameter_of_Binary_Tree


import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class SolutionTest {

    @Test
    fun testCase0() {
        // given
        val root = TreeNode(1)
        root.left = TreeNode(2)
        root.right = TreeNode(3)
        root.left?.left = TreeNode(4)
        root.left?.right = TreeNode(5)

        val solution = Solution()
        // when
        val actual = solution.diameterOfBinaryTree(root)
        assertThat(actual).isEqualTo(3)
    }

    @Test
    fun testCase1() {
        // given
        val root = TreeNode(1)
        root.left = TreeNode(2)

        val solution = Solution()
        // when
        val actual = solution.diameterOfBinaryTree(root)
        assertThat(actual).isEqualTo(1)
    }
}