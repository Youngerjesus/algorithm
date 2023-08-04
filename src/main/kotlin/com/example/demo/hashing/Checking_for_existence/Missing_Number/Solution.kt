package com.example.demo.hashing.Checking_for_existence.Missing_Number

import kotlin.math.max

class Solution {
    fun missingNumber(nums: IntArray): Int {
        val max = nums.size
        val set = mutableSetOf<Int>()

        for (n in nums) {
            set.add(n)
        }

        for (i in 0..max) {
            if (set.contains(i).not()) {
                return i
            }
        }

        throw IllegalArgumentException("invalid nums: $nums")
    }

//    fun missingNumber(nums: IntArray): Int {
//        var sum = 0
//        val originalSum = (nums.size * (nums.size + 1)) / 2
//
//        for (n in nums) {
//            sum += n
//        }
//
//        return originalSum - sum
//    }
}