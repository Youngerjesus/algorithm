package com.example.demo.monotonic.Longest_Coninuous_Subarray_With_Absolute_Diff_Less_Than_or_Equals_to_Limit

import kotlin.math.max

class Solution2 {
    fun longestSubarray(nums: IntArray, limit: Int): Int {
        val maxDeque = ArrayDeque<Int>()
        val minDeque = ArrayDeque<Int>()

        var maxDifferenceExceedsLimit: (Int, Int) -> Boolean = { maxIndex, minIndex -> nums[maxIndex] - nums[minIndex] > limit }
        var start = 0
        var longest = 0

        nums.forEachIndexed { end, _ ->
            maintainDeque(maxDeque, nums, end) { current, last -> current > last }
            maintainDeque(minDeque, nums, end) { current, last -> current < last }

            while (maxDifferenceExceedsLimit(maxDeque.first(), minDeque.first())) {
                start = if (maxDeque.first() < minDeque.first()) {
                    maxDeque.removeFirst() + 1
                } else {
                    minDeque.removeFirst() + 1
                }
            }

            longest = max(longest, end - start + 1)
        }

        return longest
    }

    private fun maintainDeque(deque: ArrayDeque<Int>, nums: IntArray, index: Int, comparator: (Int, Int) -> Boolean) {
        while (deque.isNotEmpty() && comparator(nums[index], nums[deque.last()])) {
            deque.removeLast()
        }
        deque.addLast(index)
    }
}