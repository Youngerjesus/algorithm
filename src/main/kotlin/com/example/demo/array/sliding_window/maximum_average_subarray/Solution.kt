package com.example.demo.array.sliding_window.maximum_average_subarray

class Solution {
    fun findMaxAverage(nums: IntArray, k: Int): Double {
        var curr = 0

        for (i in 0 until k) {
            curr += nums[i]
        }

        var ans = curr

        for (i in k..nums.lastIndex) {
            curr += nums[i] - nums[i- k]

            ans = Math.max(curr, ans)
        }


        return (ans / k.toDouble())
    }
}