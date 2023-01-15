package com.example.demo.kmp.LongestHappyPrefix

class Solution {
    fun longestPrefix(s: String): String {
        if (s.isEmpty()) return ""

        val finiteAutomationArray = buildFiniteAutomation(s)

        return s.substring(0, finiteAutomationArray[s.length])
    }

    private fun buildFiniteAutomation(s: String): Array<Int> {
        val result = Array(s.length + 1) { it }

        var j = 0
        result[0] = 0
        result[1] = 0

        for (i in 1..s.lastIndex) {
            while (s[i] != s[j] && j > 0) {
                j = result[j]
            }

            if (s[i] == s[j]) {
                j++
            }

            result[i + 1] = j
        }

        return result
    }
}
