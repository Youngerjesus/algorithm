package com.example.demo.dfs.Minimum_Depth_of_Binary_Tree

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test
import kotlin.math.exp

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
        val actual = solution.minDepth(root)
        //then
        assertEquals(2, actual)
    }

    @Test
    fun testCase1() {
        //given
        val root = TreeNode(2)
        root.right = TreeNode(3)
        root.right?.right = TreeNode(4)
        root.right?.right?.right = TreeNode(5)
        root.right?.right?.right?.right = TreeNode(6)

        val solution = Solution()
        //when
        val actual = solution.minDepth(root)
        //then
        assertEquals(5, actual)
    }
}