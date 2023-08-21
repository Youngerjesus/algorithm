package com.example.demo.hashing.More_Hashing_Examples.Max_Sum_of_a_Pair_With_Equal_Sum_of_Digits

class Solution {
    fun maximumSum(nums: IntArray): Int {
        val map = mutableMapOf<Int, Int>()

        var max = -1
        for (n in nums) {
            val digitSum = sumOfDigit(n)

            if (map.containsKey(digitSum)) {
                max = Math.max(max, map[digitSum]!! + n)

                val previousNumber = map[digitSum]!!
                if (previousNumber < n) {
                    map.put(digitSum, n)
                }
            } else {
                map.put(digitSum, n)
            }
        }

        return max
    }

    private fun sumOfDigit(n: Int): Int {
        var n = n
        var sum = 0
        while (n > 0) {
            sum += n % 10
            n /= 10
        }
        return sum
    }
}