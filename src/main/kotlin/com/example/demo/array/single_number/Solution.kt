package com.example.demo.array.single_number

class Solution {
    fun singleNumber(nums: IntArray): Int {
        var result = 0
        val map = mutableMapOf<Int, Int>()

        nums.forEachIndexed { index, num ->
            if (map.contains(num)) {
                result -= num
            } else {
                map.put(num, index)
                result += num
            }
        }

        return result
    }
}
