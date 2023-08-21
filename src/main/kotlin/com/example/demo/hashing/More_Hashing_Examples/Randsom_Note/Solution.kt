package com.example.demo.hashing.More_Hashing_Examples.Randsom_Note

class Solution {
    fun canConstruct(ransomNote: String, magazine: String): Boolean {
        val ransomNoteMap = mutableMapOf<Char, Int>()
        val magazineMap = mutableMapOf<Char, Int>()

        for (s in ransomNote) {
            ransomNoteMap.put(s, ransomNoteMap.getOrDefault(s, 0) + 1)
        }

        for (s in magazine) {
            magazineMap.put(s, magazineMap.getOrDefault(s, 0) + 1)
        }

        return ransomNoteMap.keys.all { ransomNoteMap[it]!! <= magazineMap.getOrDefault(it, 0)}
    }
}