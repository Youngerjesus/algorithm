package com.example.demo.linkedlist.Fast_and_slow_pointers.Middle_of_the_linked_list

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class SolutionTest {

    @Test
    fun testCase0() {
        val head = ListNode(1)
        head.next = ListNode(2)
        head.next!!.next = ListNode(3)
        head.next!!.next!!.next = ListNode(4)
        head.next!!.next!!.next!!.next = ListNode(5)

        val solution = Solution()
        val actual = solution.middleNode(head)
        val expected = ListNode(3)
        assertEquals(expected.value, actual!!.value)
    }

    @Test
    fun testCase1() {
        val head = null
        val solution = Solution()
        val actual = solution.middleNode(head)
        assertTrue(actual == null)
    }
}