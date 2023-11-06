package com.example.demo.bst.Closest_Binary_Search_Tree_Value

import kotlin.math.abs

class Solution2 {
  fun closestValue(root: TreeNode?, target: Double): Int {
    requireNotNull(root) { "Root cannot be null" }
    return findClosestValue(root, target)
  }

  private fun findClosestValue(node: TreeNode?, target: Double): Int {
    node ?: return Int.MAX_VALUE

    val nodeValue = node.`val`
    val childNodeValue = when (target < nodeValue) {
      true -> findClosestValue(node.left, target)
      false -> findClosestValue(node.right, target)
    }

    return closerValue(target, nodeValue, childNodeValue)
  }

  private fun closerValue(target: Double, value1: Int, value2: Int): Int {
    val diff1 = difference(value1, target)
    val diff2 = difference(value2, target)

    return when {
      diff1 < diff2 -> value1
      diff1 > diff2 -> value2
      else -> minOf(value1, value2)
    }
  }

  private fun difference(value: Int, target: Double) = abs(value - target)
}