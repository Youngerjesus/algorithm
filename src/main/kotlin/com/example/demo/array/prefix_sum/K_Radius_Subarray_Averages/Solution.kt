package com.example.demo.array.prefix_sum.K_Radius_Subarray_Averages

class Solution {
    fun getAverages(nums: IntArray, k: Int): IntArray {
        val prefixSum = LongArray(nums.size)
        prefixSum[0] = nums[0].toLong()

        for (i in 1..nums.lastIndex) {
            prefixSum[i] = nums[i] + prefixSum[i - 1]
        }

        val result = IntArray(nums.size)

        for (i in 0.. nums.lastIndex) {
            if ((i - k < 0) || (i + k > nums.lastIndex)) {
                result[i] = -1
            } else {
                result[i] = ((prefixSum[i + k] - prefixSum[i - k] + nums[i - k]) / (2 * k + 1)).toInt()
            }
        }

        return result
    }
}