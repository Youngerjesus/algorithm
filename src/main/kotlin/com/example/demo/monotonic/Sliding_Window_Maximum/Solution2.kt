package com.example.demo.monotonic.Sliding_Window_Maximum

class Solution2 {
    fun maxSlidingWindow(nums: IntArray, k: Int): IntArray {
        val ans = IntArray(nums.size - k + 1)
        val queue = ArrayDeque<Int>()

        for (i in 0..nums.lastIndex) {

            while (queue.isNotEmpty() && nums[i] > nums[queue.last()]) {
                queue.removeLast()
            }

            queue.addLast(i)

            if (queue.first() + k == i) {
                queue.removeFirst()
            }

            if (i >= k - 1) {
                ans[i - k + 1] = nums[queue.first()]
            }
        }

        return ans
    }
}