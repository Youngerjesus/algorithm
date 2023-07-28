package com.example.demo.array.two_pointers.reverse_string

class Solution {
    fun reverseString(s: CharArray): Unit {
        var i = 0;
        var j = s.lastIndex

        while (i < j) {
            if (s[i] != s[j]) {
                val temp = s[i]
                s[i] = s[j]
                s[j] = temp
            }
            i++
            j--
        }
    }
}