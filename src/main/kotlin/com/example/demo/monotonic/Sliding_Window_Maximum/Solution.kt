package com.example.demo.monotonic.Sliding_Window_Maximum

import java.util.PriorityQueue

class Solution {
    fun maxSlidingWindow(nums: IntArray, k: Int): IntArray {
        val maxHeap = PriorityQueue<Int>(compareByDescending { it })

        val indexMap = mutableMapOf<Int, Int>()

        for (i in 0 until k) {
            indexMap.put(nums[i], i)
            maxHeap.add(nums[i])
        }

        val result = mutableListOf<Int>()
        result.add(maxHeap.peek())

        var left = 1
        for (right in k..nums.lastIndex) {
            while (maxHeap.isNotEmpty() && indexMap[maxHeap.peek()]!! < left) {
                maxHeap.poll()
            }
            maxHeap.add(nums[right])
            indexMap.put(nums[right], right)
            result.add(maxHeap.peek())
            left += 1
        }

        return result.toIntArray()
    }
}