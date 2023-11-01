package com.example.demo.bfs.deepest_leaves_sum

class Solution2 {
  fun deepestLeavesSum(root: TreeNode?): Int {
    if (root == null) return 0

    val queue = ArrayDeque<TreeNode>()
    queue.add(root)

    while (queue.isNotEmpty()) {
      val levelSize = queue.size
      var sum = 0

      for (i in 0 until levelSize) {
        val currentNode = queue.removeFirst()
        sum += currentNode.`val`

        currentNode.left?.let { queue.addLast(it) }
        currentNode.right?.let { queue.addLast(it) }
      }

      if (queue.isEmpty()) {
        return sum
      }
    }

    return 0
  }
}