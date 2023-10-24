package com.example.demo.dfs.Maximum_Difference_Between_Node_and_Ancestor

class Solution {
    private var ans = Int.MIN_VALUE

    fun maxAncestorDiff(root: TreeNode?): Int {
        if (root == null) return 0

        val minMaxPair = Pair(root.`val`, root.`val`)

        dfs(root, minMaxPair)

        return ans
    }

    private fun dfs(node: TreeNode?, minMaxPair: Pair<Int, Int>) {
        if (node == null) return

        val updatedMinMaxPair = Pair(Math.min(node.`val`, minMaxPair.first), Math.max(node.`val`, minMaxPair.second))

        ans = Math.max(ans, Math.abs(updatedMinMaxPair.first - updatedMinMaxPair.second))

        dfs(node.left, updatedMinMaxPair)
        dfs(node.right, updatedMinMaxPair)
    }
}

class TreeNode(var `val`: Int) {
    var left: TreeNode? = null
    var right: TreeNode? = null
}