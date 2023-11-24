package com.example.demo.backtracking.Combination_Sum

class Solution {
  fun combinationSum(candidates: IntArray, target: Int): List<List<Int>> {
    val answer: MutableList<List<Int>> = mutableListOf()
    backtracking(candidates, target, answer, mutableListOf(), 0, 0)
    return answer
  }

  private fun backtracking(candidates: IntArray, target: Int, answer: MutableList<List<Int>>, path: MutableList<Int>, start: Int, curr: Int) {
    if (curr == target) {
      answer.add(path.toList())
      return
    }

    for (j in start..candidates.lastIndex) {
      val num = candidates[j]
      if (curr + num <= target) {
        path.add(num)
        backtracking(candidates, target, answer, path, j, curr + num)
        path.removeAt(path.lastIndex)
      }
    }
  }
}