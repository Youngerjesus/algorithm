package com.example.demo.binarySearch.Find_First_and_Last_Position_of_Element_in_Sorted_Array

class Solution {
    fun searchRange(nums: IntArray, target: Int): IntArray {
        if (nums.isEmpty()) return intArrayOf(-1, -1)

        val position = binarySearch(nums, target) ?: -1

        if (position < 0) {
            return intArrayOf(-1, -1)
        }

        val result = IntArray(2)

        for (i in 0..position) {
            if (nums[position - i] == target) {
                result.set(0, position - i)
            }
            else break
        }

        for (i in position..nums.lastIndex) {
            if (nums[i] == target) {
                result.set(1, i)
            }
            else break
        }

        return result
    }

    fun binarySearch(nums: IntArray, target: Int): Int? {
        if (nums.first() == target) {
            return 0
        }

        if (nums.last() == target) {
            return nums.lastIndex
        }

        return nums.binarySearch(target, 0, nums.lastIndex)
    }
}
