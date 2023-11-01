package com.example.demo.bfs.Binary_Tree_Zigzag_Level_Order_Traversal

class Solution {
  fun zigzagLevelOrder(root: TreeNode?): List<List<Int>> {
    if (root == null) return emptyList()

    var stack = ArrayDeque<TreeNode>()
    val result = mutableListOf<MutableList<Int>>()
    var zigzag = true
    stack.addLast(root)

    while (stack.isNotEmpty()) {
      val levelSize = stack.size
      result.add(mutableListOf())

      val tempStack = ArrayDeque<TreeNode>()

      for (i in 0 until levelSize) {
        val currentNode = stack.removeLast()

        result[result.lastIndex].add(currentNode.`val`)

        if (zigzag) {
          currentNode.left?.let { tempStack.addLast(it) }
          currentNode.right?.let { tempStack.addLast(it) }
        } else {
          currentNode.right?.let { tempStack.addLast(it) }
          currentNode.left?.let { tempStack.addLast(it) }
        }
      }

      stack = tempStack
      zigzag = !zigzag
    }

    return result
  }
}

class TreeNode(var `val`: Int) {
  var left: TreeNode? = null
  var right: TreeNode? = null
}