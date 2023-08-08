package com.example.demo.hashing.Counting.Largest_Unique_Number

import kotlin.math.max

class Solution {
    fun largestUniqueNumber(nums: IntArray): Int {
        val integerCountMap = mutableMapOf<Int, Int>()

        for (n in nums) {
            integerCountMap[n] = (integerCountMap[n] ?: 0) + 1
        }

        var max = -1

        for (n in nums) {
            if (integerCountMap[n] == 1) {
                max = max(max, n)
            }
        }

        return max
    }
}