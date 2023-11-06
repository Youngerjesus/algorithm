package com.example.demo.bst.Validate_Binary_Search_Tree

import kotlin.properties.Delegates

class Solution {
  private var lastValue: Int? = null
  private var isValid = true
  fun isValidBST(root: TreeNode?): Boolean {
    traverseInOrder(root)
    return isValid
  }

  private fun traverseInOrder(node: TreeNode?) {
    if (node == null) return

    traverseInOrder(node.left)
    if (lastValue != null && lastValue!! >= node.`val`) isValid = false
    lastValue = node.`val`
    traverseInOrder(node.right)
  }
}

class TreeNode(var `val`: Int) {
  var left: TreeNode? = null
  var right: TreeNode? = null
}