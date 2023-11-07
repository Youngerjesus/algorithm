package com.example.demo.graph.dfs.Number_of_Provinces

class Solution2 {
  fun findCircleNum(isConnected: Array<IntArray>): Int {
    val vertexCount = isConnected.size
    val visited = BooleanArray(vertexCount)
    var circleCount = 0

    for (vertex in 0 until vertexCount) {
      if (!visited[vertex]) {
        dfs(isConnected, visited, vertex)
        circleCount++
      }
    }

    return circleCount
  }

  private fun dfs(graph: Array<IntArray>, visited: BooleanArray, vertex: Int) {
    visited[vertex] = true

    for (neighbor in 0 until graph[vertex].size) {
      if (graph[vertex][neighbor] == 1 && !visited[neighbor]) {
        dfs(graph, visited, neighbor)
      }
    }
  }
}