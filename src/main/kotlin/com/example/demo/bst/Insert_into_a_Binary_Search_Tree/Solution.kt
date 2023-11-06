package com.example.demo.bst.Insert_into_a_Binary_Search_Tree

class Solution {

  fun insertIntoBST(root: TreeNode?, `val`: Int): TreeNode? {
    if (root == null) return TreeNode(`val`)

    insertIntoBSTRecursive(root, `val`)

    return root
  }

  private fun insertIntoBSTRecursive(node: TreeNode, insertedValue: Int) {
    if (node.`val` < insertedValue) {
      if (node.right == null) {
        node.right = TreeNode(insertedValue)
        return
      }

      insertIntoBSTRecursive(node.right!!, insertedValue)
    }

    if (node.`val` > insertedValue) {
      if (node.left == null) {
        node.left = TreeNode(insertedValue)
        return
      }

      insertIntoBSTRecursive(node.left!!, insertedValue)
    }
  }
}

class TreeNode(var `val`: Int) {
  var left: TreeNode? = null
  var right: TreeNode? = null
}