package com.example.demo.graph.dfs.Number_of_Provinces

class Solution {

  fun findCircleNum(isConnected: Array<IntArray>): Int {
    val vertexSize = isConnected.size
    val isMarked = BooleanArray(vertexSize) { false }
    val groupIds = IntArray(vertexSize) { -1 }
    var count = 0

    for (v in 0..isConnected.lastIndex) {
      if (isMarked[v].not()) {
        dfs(isConnected, isMarked, groupIds, v, count)
        count++
      }
    }

    return count
  }

  private fun dfs(connected: Array<IntArray>, isMarked: BooleanArray, groupIds: IntArray, v: Int, id: Int) {
    isMarked[v] = true
    groupIds[v] = id

    for (w in 0..connected[v].lastIndex) {
      if (connected[v][w] == 1 && isMarked[w].not()) {
        dfs(connected, isMarked, groupIds, w, id)
      }
    }
  }
}