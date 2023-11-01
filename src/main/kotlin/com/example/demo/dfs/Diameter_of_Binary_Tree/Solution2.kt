package com.example.demo.dfs.Diameter_of_Binary_Tree

class Solution2 {
    fun diameterOfBinaryTree(root: TreeNode?): Int {
        val result = dfs(root)
        return result.totalDiameter - 1
    }

    private fun dfs(node: TreeNode?): DiameterInfo {
        if (node == null) return DiameterInfo(0, 0)

        val leftDiameterInfo = dfs(node.left)
        val rightDiameterInfo = dfs(node.right)

        val longestPathThroughNode = leftDiameterInfo.pathToLeaf + rightDiameterInfo.pathToLeaf + 1
        val maxDiameter = maxOf(
            leftDiameterInfo.totalDiameter,
            rightDiameterInfo.totalDiameter,
            longestPathThroughNode
        )

        return DiameterInfo(
            pathToLeaf = maxOf(leftDiameterInfo.pathToLeaf, rightDiameterInfo.pathToLeaf) + 1,
            totalDiameter = maxDiameter
        )
    }
}

data class DiameterInfo(
    val pathToLeaf: Int,
    val totalDiameter: Int
)