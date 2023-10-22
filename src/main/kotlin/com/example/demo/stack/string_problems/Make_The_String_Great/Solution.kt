package com.example.demo.stack.string_problems.Make_The_String_Great

class Solution {
    fun makeGood(s: String): String {
        val stack = ArrayDeque<Char>()

        for (c in s) {
            val last = runCatching { stack.last() }.getOrNull()

            if (last?.lowercase() == c.lowercase()) {
               if ((last.isLowerCase() && c.isUpperCase()) || (last.isUpperCase() && c.isLowerCase())) {
                   stack.removeLast()
                   continue
               }
            }

            stack.addLast(c)

        }

        return stack.joinToString(separator = "")
    }
}