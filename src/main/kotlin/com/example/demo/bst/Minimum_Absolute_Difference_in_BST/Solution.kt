package com.example.demo.bst.Minimum_Absolute_Difference_in_BST

import kotlin.math.abs
import kotlin.math.min

class Solution {
  private var min = Int.MAX_VALUE
  private var currentValue = -1

  fun getMinimumDifference(root: TreeNode?): Int {
    inOrder(root)
    return min
  }

  private fun inOrder(node: TreeNode?) {
    if (node == null) return

    inOrder(node.left)
    if (currentValue != -1) {
      min = minOf(min, node.`val` - currentValue)
    }
    currentValue = node.`val`
    inOrder(node.right)
  }
}

class TreeNode(var `val`: Int) {
  var left: TreeNode? = null
  var right: TreeNode? = null
}