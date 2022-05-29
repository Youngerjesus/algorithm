package com.example.demo.dp.wildcard

// TODO (1) 쪼갠 패턴의 매칭을 시도할 때 메모리제이션을 어떻게 해야하는지. -> 몇 번째 조각이 문자열 어디까지 대응되었는지를 메모리제이션 하면 되지 않을까?
// TODO (2) 내가 설계한 알고리즘이 시간이 가장 오래걸리는 케이스가 뭔지, -> 중복되는 계산이 많을 수 있다. '*' 가 많은 경우
// TODO (3) pseudocode 로 설명할 수 있는지.
// TODO (4) 시간 복잡도가 어떻게 되는지.
// TODO (5) 구체적인 중복 계산 사례를 찾을 수 있는지.
// TODO 중복 없이 호출할 수 있는 케이스는 pattern 의 최대 사이즈 (= 100) originalString 의 최대 사이즈 (= 100) 안에 있는 케이스들 밖에 없다.
class Solution1 {
    fun match(pattern: String, originalString: String): Boolean {
        var pos = 0
        while (pattern.length >= pos && originalString.length >= pos &&
                (pattern[pos] == originalString[pos] || pattern[pos] == '?')
        ) {
            pos++
        }

        if (pos == pattern.length) {
            return pos == originalString.length
        }

        if (pattern[pos] == '*') {
            for (skip in 0 until originalString.length - pos) {
                if (match(pattern.substring(pos + 1), originalString.substring(pos + skip))) {
                    return true
                }
            }
        }

        return false
    }
}
