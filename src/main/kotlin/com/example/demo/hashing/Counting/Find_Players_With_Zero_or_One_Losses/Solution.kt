package com.example.demo.hashing.Counting.Find_Players_With_Zero_or_One_Losses

class Solution {
    fun findWinners(matches: Array<IntArray>): List<List<Int>> {
        val winnerCountMap = mutableMapOf<Int, Int>()
        val loserCountMap = mutableMapOf<Int, Int>()

        for ((winner, loser) in matches) {
            if (winnerCountMap.containsKey(winner)) {
                winnerCountMap[winner] = winnerCountMap[winner]!! + 1
            }
            else {
                winnerCountMap[winner] = 1
            }
            if (loserCountMap.containsKey(loser)) {
                loserCountMap[loser] = loserCountMap[loser]!! + 1
            }
            else {
                loserCountMap[loser] = 1
            }
        }

        val results = listOf<MutableList<Int>>(mutableListOf(), mutableListOf())

        for (winner in winnerCountMap.keys.sorted()) {
            if (winnerCountMap[winner]!! >= 1 && loserCountMap.containsKey(winner).not()) {
                results[0].add(winner)
            }
        }

        for (loser in loserCountMap.keys.sorted()) {
            if (loserCountMap[loser] == 1) {
                results[1].add(loser)
            }
        }

        return results
    }
}