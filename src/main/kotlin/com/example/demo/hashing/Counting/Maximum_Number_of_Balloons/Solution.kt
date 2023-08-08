package com.example.demo.hashing.Counting.Maximum_Number_of_Balloons

import kotlin.math.min

class Solution {
    fun maxNumberOfBalloons(text: String): Int {
        val characterCountMap = mutableMapOf<Char, Int>()

        for (c in text) {
            characterCountMap[c] = (characterCountMap[c] ?: 0) + 1
        }

        var min = Int.MAX_VALUE

        for (c in "ban") {
            min = min(characterCountMap[c] ?: 0, min)
        }

        min = minCount(characterCountMap, 'l', min)
        min = minCount(characterCountMap, 'o', min)

        return min
    }

    private fun minCount(countMap: Map<Char, Int>, c: Char, min: Int, product: Int = 2): Int {
        return when (countMap.containsKey(c)) {
            true -> {
                if (countMap[c]!! / product < min) {
                    countMap[c]!! / product
                }
                else {
                    min
                }
            }
            false -> 0
        }
    }
}