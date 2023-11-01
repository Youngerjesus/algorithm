package com.example.demo.dfs.Diameter_of_Binary_Tree

class Solution {
    fun diameterOfBinaryTree(root: TreeNode?): Int {
        val result = dfs(root)
        return result.maxLength - 1
    }

    private fun dfs(node: TreeNode?): MaxLengthMaxLengthSum {
        if (node == null) return MaxLengthMaxLengthSum(0, 0)

        val leftMaxLengthMaxLengthSum = dfs(node.left)
        val rightMaxLengthMaxLengthSum = dfs(node.right)

        return MaxLengthMaxLengthSum(
                partialMaxLength = maxOf(leftMaxLengthMaxLengthSum.partialMaxLength, rightMaxLengthMaxLengthSum.partialMaxLength) + 1,
                maxLength = maxOf(
                        maxOf(leftMaxLengthMaxLengthSum.maxLength, rightMaxLengthMaxLengthSum.maxLength),
                        leftMaxLengthMaxLengthSum.partialMaxLength + rightMaxLengthMaxLengthSum.partialMaxLength + 1
                )
        )
    }
}

data class MaxLengthMaxLengthSum(
        val partialMaxLength: Int,
        val maxLength: Int
)

class TreeNode(var `val`: Int) {
    var left: TreeNode? = null
    var right: TreeNode? = null
}