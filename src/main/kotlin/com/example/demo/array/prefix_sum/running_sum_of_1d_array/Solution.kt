package com.example.demo.array.prefix_sum.running_sum_of_1d_array

class Solution {

    fun runningSum(nums: IntArray): IntArray {
        val result = IntArray(nums.size)

        result[0] = nums[0]

        for (i in 1..nums.lastIndex) {
            result[i] = nums[i] + result[i - 1]
        }

        return result
    }
}