package com.example.demo.backtracking.combinations

class Solution {
  fun combine(n: Int, k: Int): List<List<Int>> {
    val answer: MutableList<List<Int>> = mutableListOf()
    backtracking(n, k, answer, mutableListOf(), 0)
    return answer
  }

  private fun backtracking(n: Int, k: Int, answer: MutableList<List<Int>>, curr: MutableList<Int>, i: Int) {
    if (curr.size == k) {
      answer.add(curr.toList())
      return
    }

    for (j in i..n) {
      curr.add(j)
      backtracking(n, k, answer, curr, j + 1)
      curr.removeAt(curr.lastIndex)
    }
  }
}