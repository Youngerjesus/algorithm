package com.example.demo.divideConquer.majority_element

class Solution {
    fun majorityElement(nums: IntArray): Int {
        val map = mutableMapOf<Int, Int>()
        nums.forEach { num ->
            map.put(num, map.getOrDefault(num, 0) + 1)
            if (map[num]!! > nums.size / 2) return num
        }

        return nums.first()
    }
}
