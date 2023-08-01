package com.example.demo.array.Minimum_Value_to_Get_Positive_Step_by_Step_Sum

class Solution {

    fun minStartValue(nums: IntArray): Int {
        val result = IntArray(nums.size)
        result[0] = nums[0]

        for (i in 1..nums.lastIndex) {
            result[i] = nums[i] + result[i - 1]
        }

        var minValue = result[0]

        for (i in 1 until result.size) {
            if (result[i] < minValue) {
                minValue = result[i]
            }
        }

        return if (minValue >= 1) 1 else 1 - minValue
    }
}