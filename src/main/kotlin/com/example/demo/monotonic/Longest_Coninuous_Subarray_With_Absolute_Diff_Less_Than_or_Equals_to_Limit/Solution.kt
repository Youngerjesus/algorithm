package com.example.demo.monotonic.Longest_Coninuous_Subarray_With_Absolute_Diff_Less_Than_or_Equals_to_Limit

class Solution {
    fun longestSubarray(nums: IntArray, limit: Int): Int {
        val maxStack = ArrayDeque<Int>()
        val minStack = ArrayDeque<Int>()

        var ans = 0
        var left = 0
        var right = 0
        for (i in 0..nums.lastIndex) {
            if (maxStack.isEmpty() || nums[maxStack.last()] > nums[i]) {
                maxStack.addLast(i)
            } else {
                while (maxStack.isNotEmpty() && nums[maxStack.last()] <= nums[i]) {
                    maxStack.removeLast()
                }
                maxStack.addLast(i)
            }


            if (minStack.isEmpty() || nums[minStack.last()] < nums[i]) {
                minStack.addLast(i)
            } else {
                while (minStack.isNotEmpty() && nums[minStack.last()] >= nums[i]) {
                    minStack.removeLast()
                }
                minStack.addLast(i)
            }

            if (isGreater(nums[maxStack.first()] - nums[minStack.first()], limit)) {
                if (maxStack.first() < minStack.first()) {
                    while (maxStack.isNotEmpty() && isGreater(nums[maxStack.first()] - nums[minStack.first()], limit)) {
                        left = maxStack.removeFirst() + 1
                    }
                }
                else {
                    while (minStack.isNotEmpty() && isGreater(nums[maxStack.first()] - nums[minStack.first()], limit)) {
                        left = minStack.removeFirst() + 1
                    }
                }
            }

            ans = Math.max(ans, right - left + 1)
            right++
        }

        return ans
    }

    private fun isGreater(first: Int, second: Int): Boolean {
        return first > second
    }
}