package com.example.demo.backtracking.Subsets

class Solution {
  fun subsets(nums: IntArray): List<List<Int>> {
    val answer: MutableList<List<Int>> = mutableListOf()
    backtracking(nums, answer, 0, mutableListOf())
    return answer
  }

  private fun backtracking(nums: IntArray, answer: MutableList<List<Int>>, i: Int, curr: MutableList<Int>) {
    if (i > nums.size) {
      return
    }

    answer.add(curr.toMutableList())
    for (j in i..nums.lastIndex) {
      curr.add(nums[j])
      backtracking(nums, answer, j + 1, curr)
      curr.removeAt(curr.lastIndex)
    }
  }
}