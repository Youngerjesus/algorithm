package com.example.demo.dp.wildcard

class Solution2 {
    val cache = Array(101) { IntArray(101)}

    fun matchMemorized(pattern: String, originalString: String, pIdx: Int, oIdx: Int): Boolean {
        if (cache[pIdx][oIdx] != -1) {
            return cache[pIdx][oIdx] == 1
        }

        var pIdx = pIdx
        var oIdx = oIdx

        while (pIdx < pattern.length && oIdx < originalString.length &&
            (pattern[pIdx] == '?' || pattern[pIdx] == originalString[oIdx])) {
            pIdx += 1
            oIdx += 1
        }

        if (pIdx == pattern.length) {
            return oIdx == originalString.length
        }

        for (skip in 0 until originalString.length - pIdx) {
            if (matchMemorized(pattern.substring(pIdx + 1), originalString.substring(oIdx + skip), pIdx + 1, oIdx + skip)) {
                cache[pIdx][oIdx] = 1
                return true
            }
        }

        cache[pIdx][oIdx] = 0
        return false
    }
}
