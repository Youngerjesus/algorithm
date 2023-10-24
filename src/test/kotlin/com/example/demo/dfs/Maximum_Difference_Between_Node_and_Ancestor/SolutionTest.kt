package com.example.demo.dfs.Maximum_Difference_Between_Node_and_Ancestor

import com.example.demo.monotonic.Sliding_Window_Maximum.Solution2
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class SolutionTest {

    @Test
    fun testCase0() {
        //given
        val root = TreeNode(8)
        root.left = TreeNode(3)
        root.right = TreeNode(10)
        root.left?.left = TreeNode(1)
        root.left?.right = TreeNode(6)
        root.left?.right?.left = TreeNode(4)
        root.left?.right?.right = TreeNode(7)
        root.right?.right = TreeNode(14)
        root.right?.right?.left = TreeNode(13)

        val solution = Solution()
        //when
        val actual = solution.maxAncestorDiff(root)
        //then
        val expected = 7
        assertEquals(expected, actual)
    }
}