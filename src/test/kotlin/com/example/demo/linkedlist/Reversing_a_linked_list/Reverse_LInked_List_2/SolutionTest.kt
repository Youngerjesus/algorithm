package com.example.demo.linkedlist.Reversing_a_linked_list.Reverse_LInked_List_2

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
        head.next!!.next!!.next!!.next!!.next = ListNode(6)

        val left = 2
        val right = 5

        val solution = Solution()
        val actual = solution.reverseBetween(head, left, right)

        assertEquals(5, actual!!.next!!.`val`)
        assertEquals(4, actual.next!!.next!!.`val`)
        assertEquals(3, actual.next!!.next!!.next!!.`val`)
        assertEquals(2, actual.next!!.next!!.next!!.next!!.`val`)
    }

    @Test
    fun testCase1() {
        val head = ListNode(1)
        head.next = ListNode(2)
        head.next!!.next = ListNode(3)
        head.next!!.next!!.next = ListNode(4)
        head.next!!.next!!.next!!.next = ListNode(5)
        head.next!!.next!!.next!!.next!!.next = ListNode(6)

        val left = 2
        val right = 2

        val solution = Solution()
        val actual = solution.reverseBetween(head, left, right)

        assertEquals(2, actual!!.next!!.`val`)
        assertEquals(3, actual.next!!.next!!.`val`)
        assertEquals(4, actual.next!!.next!!.next!!.`val`)
        assertEquals(5, actual.next!!.next!!.next!!.next!!.`val`)
    }

    @Test
    fun testCase2() {
        val head = ListNode(1)
        head.next = ListNode(2)
        head.next!!.next = ListNode(3)
        head.next!!.next!!.next = ListNode(4)
        head.next!!.next!!.next!!.next = ListNode(5)

        val left = 2
        val right = 4

        val solution = Solution()
        val actual = solution.reverseBetween(head, left, right)

        assertEquals(4, actual!!.next!!.`val`)
        assertEquals(3, actual.next!!.next!!.`val`)
        assertEquals(2, actual.next!!.next!!.next!!.`val`)
    }

    @Test
    fun testCase3() {
        val head = ListNode(3)
        head.next = ListNode(5)

        val left = 1
        val right = 2

        val solution = Solution()
        val actual = solution.reverseBetween(head, left, right)

        assertEquals(5, actual!!.`val`)
        assertEquals(3, actual.next!!.`val`)
    }
}