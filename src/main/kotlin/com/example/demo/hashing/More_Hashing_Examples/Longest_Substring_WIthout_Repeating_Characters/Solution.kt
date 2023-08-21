package com.example.demo.hashing.More_Hashing_Examples.Longest_Substring_WIthout_Repeating_Characters

class Solution {
    fun lengthOfLongestSubstring(s: String): Int {
        val map = mutableMapOf<Char, Int>()
        var max = 0

        var left = 0
        var right = 0

        s.forEachIndexed { index, c ->
            if (map.containsKey(c).not()) {
                map.put(c, index)
                right++
            }
            else {
                max = Math.max(max, right - left)
                val to = map[c]!!
                for (i in left..to) {
                    map.remove(s[i])
                }
                map.put(c, right)
                left = to + 1
                right++
            }
        }

        max = Math.max(max, right - left)
        return max
    }
}