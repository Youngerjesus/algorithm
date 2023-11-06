package com.example.demo.bst.Validate_Binary_Search_Tree

class Solution2 {
  fun isValidBST(root: TreeNode?): Boolean {
    return isValidBSTRecursive(root, Long.MIN_VALUE, Long.MAX_VALUE)
   }

  private fun isValidBSTRecursive(node: TreeNode?, lowest: Long, highest: Long): Boolean {
    if (node == null) return true

    if (node.`val` <= lowest) {
      return false
    }

    if (node.`val` >= highest) {
      return false
    }

    return isValidBSTRecursive(node.left, lowest, node.`val`.toLong()) && isValidBSTRecursive(node.right, node.`val`.toLong(), highest)
  }
}