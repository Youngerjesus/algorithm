package com.example.demo.bst.Closest_Binary_Search_Tree_Value

import kotlin.math.abs

class Solution {
  private val MARGIN = 0.1
  fun closestValue(root: TreeNode?, target: Double): Int {
    return findClosetValue(root!!, target)
  }

  private fun findClosetValue(node: TreeNode, target: Double): Int {
    val currentNodeDifference = abs(node.`val` - target)
    val leftNodeDifference = abs(node.`val` - MARGIN - target)
    val rightNodeDifference = abs(node.`val` + MARGIN - target)

    if (currentNodeDifference >= rightNodeDifference) {
      if (node.right != null) {
        val findValue = findClosetValue(node.right!!, target)
        return compare(findValue, node.`val`, target)
      }

      return node.`val`
    }

    if (currentNodeDifference >= leftNodeDifference) {
      if (node.left != null) {
        val findValue = findClosetValue(node.left!!, target)
        return compare(findValue, node.`val`, target)
      }
    }

    return node.`val`
  }

  private fun compare(findValue: Int, currentNodeValue: Int, target: Double): Int {
    return when {
      difference(findValue, target) > difference(currentNodeValue, target) -> {
        currentNodeValue
      }
      difference(findValue, target) == difference(currentNodeValue, target) -> {
        minOf(currentNodeValue, findValue)
      }
      else -> {
        findValue
      }
    }
  }

  private fun difference(left: Int, right: Double): Double {
    return abs(left - right)
  }
}

class TreeNode(var `val`: Int) {
  var left: TreeNode? = null
  var right: TreeNode? = null
}
