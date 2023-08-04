package com.example.demo.hashing.Checking_for_existence.Counting_Elements

class Solution {

    fun countElements(arr: IntArray): Int {
        var count = 0
        val set = mutableSetOf<Int>()

        for (n in arr) {
            set.add(n)
        }

        for (n in arr) {
            if (set.contains(n) && set.contains(n + 1)) {
                count++
            }
        }

        return count
    }
}