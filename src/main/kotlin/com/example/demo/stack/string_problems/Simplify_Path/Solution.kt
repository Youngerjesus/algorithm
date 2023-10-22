package com.example.demo.stack.string_problems.Simplify_Path

class Solution {
    fun simplifyPath(path: String): String {
        val stack = ArrayDeque<String>()

        val split = path.split("/")

        for (s in split) {
            if (s == ".." && stack.isNotEmpty()) {
                stack.removeLast()
            }
            else if (s != "/" && s != "." && s != ".." && s.isNotEmpty()) {
                stack.addLast(s)
            }
        }

        return stack.joinToString(separator = "/", prefix = "/")
    }
}