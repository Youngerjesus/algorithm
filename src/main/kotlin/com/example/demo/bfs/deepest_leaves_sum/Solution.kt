package com.example.demo.bfs.deepest_leaves_sum

class Solution {

  fun deepestLeavesSum(root: TreeNode?): Int {
    if (root == null) return 0

    val queue = ArrayDeque<TreeNode>()
    val backedQueue = ArrayDeque<TreeNode>()
    var sum = 0
    queue.addFirst(root)

    while (queue.isNotEmpty()) {
      val currentLevel = queue.size
      backedQueue.clear()

      for (i in 0 until currentLevel) {
        val node = queue.removeFirst()
        backedQueue.addLast(node)

        if (node.left != null) {
          queue.addLast(node.left!!)
        }

        if (node.right != null) {
          queue.addLast(node.right!!)
        }
      }

      if (queue.isEmpty()) {
        for (node in backedQueue) {
          sum += node.`val`
        }
      }
    }

    return sum
  }
}

class TreeNode(var `val`: Int) {
  var left: TreeNode? = null
  var right: TreeNode? = null
}