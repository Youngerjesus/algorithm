package com.example.demo.array.sliding_window.max_consecutive_ones_III

class Solution {
    fun longestOnes(nums: IntArray, k: Int): Int {
        var left = 0
        var right = 0
        var curr = 0
        var ans = 0

        for (i in 0..nums.lastIndex) {
            if (nums[i] == 0) {
                curr++
            }

            while (curr > k) {
                if (nums[left] == 0) {
                    curr--
                }
                left++
            }

            ans = Math.max(ans, right - left + 1)

            right++
        }

        return ans
    }
}