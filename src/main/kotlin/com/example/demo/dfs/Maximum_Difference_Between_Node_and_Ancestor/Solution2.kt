package com.example.demo.dfs.Maximum_Difference_Between_Node_and_Ancestor

class Solution2 {
    fun maxAncestorDiff(root: TreeNode?): Int {
        root ?: return 0

        val initialMinMax = root.`val` to root.`val`

        return dfs(root, initialMinMax)
    }

    private fun dfs(node: TreeNode?, currentMinMax: Pair<Int, Int>, maxDiff: Int = 0): Int {
        node ?: return maxDiff

        val (currentMin, currentMax) = currentMinMax
        val newMin = minOf(node.`val`, currentMin)
        val newMax = maxOf(node.`val`, currentMax)

        val currentDiff = maxOf(maxDiff, newMax - newMin)

        return maxOf(
                dfs(node.left, newMin to newMax, currentDiff),
                dfs(node.right, newMin to newMax, currentDiff)
        )
    }



    private data class MinMax(val min: Int, val max: Int)
}