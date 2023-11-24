package com.example.demo.linkedlist.Reversing_a_linked_list

import com.example.demo.linkedlist.Reversing_a_linked_list.Maximum_Twin_Sum_of_a_linked_list.ListNode
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
    }
}