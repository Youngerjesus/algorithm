package com.example.demo.backtracking.Permutations

class Solution {
  private val answer: MutableList<List<Int>> = mutableListOf()

  fun permute(nums: IntArray): List<List<Int>> {
    permuteRecursive(nums, mutableSetOf())
    return answer
  }

  private fun permuteRecursive(nums: IntArray, curr: MutableSet<Int>) {
    if (curr.size == nums.size && curr.isNotEmpty()) {
      answer.add(curr.toList())
    }

    for (n in nums) {
      if (curr.contains(n).not()) {
        curr.add(n)
        permuteRecursive(nums, curr)
        curr.remove(n)
      }
    }
  }
}