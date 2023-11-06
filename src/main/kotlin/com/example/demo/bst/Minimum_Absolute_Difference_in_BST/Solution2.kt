package com.example.demo.bst.Minimum_Absolute_Difference_in_BST

import kotlin.math.min

class Solution2 {
  private var minimumDifference = Int.MAX_VALUE
  private var lastValue = -1

  fun getMinimumDifference(root: TreeNode?): Int {
    traverseInOrder(root)
    return minimumDifference
  }

  private fun traverseInOrder(node: TreeNode?) {
    if (node == null) return

    traverseInOrder(node.left)
    if (lastValue != -1) {
      minimumDifference = minOf(minimumDifference, node.`val` - lastValue)
    }
    lastValue = node.`val`
    traverseInOrder(node.right)
  }
}