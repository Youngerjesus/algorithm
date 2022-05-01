package com.example.demo.Unique_Paths

class Solution {
    lateinit var cache: Array<IntArray>

    fun uniquePaths(m: Int, n: Int): Int {
        cache = initCache(m, n)

        for (i in 0 until m) {
            for (j in 0 until n) {
                if (i == 0) {
                    cache[i][j] = 1
                }
                else if (j == 0) {
                    cache[i][j] = 1
                }
                else {
                    cache[i][j] = cache[i - 1][j] + cache[i][j - 1]
                }
            }
        }

        return cache[m - 1][n - 1]
    }

    private fun initCache(m: Int, n: Int) = Array(m) { IntArray(n) }
}
