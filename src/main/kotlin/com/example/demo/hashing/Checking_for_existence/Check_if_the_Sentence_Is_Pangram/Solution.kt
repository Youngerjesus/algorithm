package com.example.demo.hashing.Checking_for_existence.Check_if_the_Sentence_Is_Pangram

class Solution {
    fun checkIfPangram(sentence: String): Boolean {
        val set = mutableSetOf<Char>()

        for (c in sentence) {
            if (set.contains(c).not()) {
                set.add(c)
                if (set.size == 26) {
                    return true
                }
            }
        }

        return false
    }
}