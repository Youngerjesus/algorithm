package com.example.demo.linkedlist.Fast_and_slow_pointers.Remove_Nth_Node_From_End_of_List

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test
import kotlin.math.exp

class SolutionTest {

    @Test
    fun testCase0() {
        val head = ListNode(1)
        head.next = ListNode(2)
        head.next!!.next = ListNode(3)
        head.next!!.next!!.next = ListNode(4)
        head.next!!.next!!.next!!.next = ListNode(5)
        val n = 2

        val solution = Solution()
        var actual = solution.removeNthFromEnd(head, n)
        var expected = ListNode(1)
        expected.next = ListNode(2)
        expected.next!!.next = ListNode(3)
        expected.next!!.next!!.next = ListNode(5)

        while (actual != null && actual.next != null) {
            assertEquals(expected.`val`, actual.`val`)
            actual = actual.next
            expected = expected.next!!
        }
    }

    @Test
    fun testCase1() {
        val head = ListNode(1)
        val n = 1
        val solution = Solution()
        var actual = solution.removeNthFromEnd(head, n)
        assertTrue(actual == null)
    }

    @Test
    fun testCase2() {
        val head = ListNode(1)
        head.next = ListNode(2)
        head.next!!.next = ListNode(3)
        head.next!!.next!!.next = ListNode(4)
        head.next!!.next!!.next!!.next = ListNode(5)
        val n = 1

        val solution = Solution()
        var actual = solution.removeNthFromEnd(head, n)
        var expected = ListNode(1)
        expected.next = ListNode(2)
        expected.next!!.next = ListNode(3)
        expected.next!!.next!!.next = ListNode(4)

        while (actual != null && actual.next != null) {
            assertEquals(expected.`val`, actual.`val`)
            actual = actual.next
            expected = expected.next!!
        }
    }

    @Test
    fun testCase3() {
        val head = ListNode(1)
        head.next = ListNode(2)
        val n = 2

        val solution = Solution()
        var actual = solution.removeNthFromEnd(head, n)
        var expected = ListNode(2)

        assertEquals(expected.`val`, actual!!.`val`)
    }
}