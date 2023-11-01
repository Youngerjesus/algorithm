package com.example.demo.dfs.Minimum_Depth_of_Binary_Tree

class Solution {
    fun minDepth(root: TreeNode?): Int {
        if (root == null) return 0
        return dfs(root)
    }

    private fun dfs(node: TreeNode?): Int {
        if (node == null) return 0

        if (node.left == null && node.right == null) return 1

        if (node.left == null) {
            return dfs(node.right) + 1
        } else if (node.right == null) {
            return dfs(node.left) + 1
        }

        return 1 + minOf(dfs(node.left), dfs(node.right))
    }
}

class TreeNode(var `val`: Int) {
    var left: TreeNode? = null
    var right: TreeNode? = null
}