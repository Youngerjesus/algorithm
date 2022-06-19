package com.example.demo.dp.lis

// TODO 완전 탐색을 하면 가능하다.
// TODO 메모라이제이션을 거는 것도 가능하다. 이 이후에 증가 수열이 없다라는 정보.
// TODO 그리드하게 풀 수는 없는 것 같다.
// TODO 증가 부분 수열 중 최고의 길이를 구하는 것이므로 최적화 답의 부분수열도 최적의 길이를 가져야한다.
class Solution {

    // 가장 간단한 완전 탐색
    fun lis1(a: List<Int>): Int {
        if (a.isEmpty()) return 0

        var ret = 0

        for ((i, e) in a.withIndex()) {
            val b = mutableListOf<Int>()

            for (j in i until a.size) {
               if (e < a[j]) {
                   b.add(a[j])
               }
            }

            ret = Math.max(ret, 1 + lis1(b))
        }

        return ret
    }


    val cache: Array<Int> = Array(100) { -1 }
    val S = listOf<Int>()

    fun lis2(start: Int): Int {
        if (cache[start] != -1) return cache[start]

        cache[start] = 1
        var ret = 1

        for (next in start + 1 until S.size) {
            if (S[next] > S[start]) {
                ret = Math.max(ret, lis2(next) + 1)
            }
        }

        cache[start] = ret
        return ret
    }
}
