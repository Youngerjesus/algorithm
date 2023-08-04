package com.example.demo.hashing.Checking_for_existence.Check_if_the_Sentence_Is_Pangram

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class SolutionTest {

    @Test
    fun `if the sentence contains all alphabet, the sentence is pangram`() {
        val sentence = "abcdefghijklmnopqrstuvwxyz"
        val solution = Solution()
        val ifPangram = solution.checkIfPangram(sentence)
        assertTrue(ifPangram)
    }

    @Test
    fun `if the sentence does not contain all alphabet, the sentence is not pangram`() {
        val sentence = "aaaaaaaa"
        val solution = Solution()
        val ifPangram = solution.checkIfPangram(sentence)
        assertFalse(ifPangram)
    }

}