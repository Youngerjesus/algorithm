package com.example.demo.linkedlist.Fast_and_slow_pointers.Remove_Nth_Node_From_End_of_List

class Solution {
    fun removeNthFromEnd(head: ListNode?, n: Int): ListNode? {
        if (head?.next == null) return null

        var fast = head
        var slow = head

        for (i in 0 until n) {
            fast = fast!!.next
        }

        if (fast == null) {
            slow = slow.next
            return slow
        }

        while (fast?.next != null) {
            slow = slow!!.next
            fast = fast.next
        }

        if (slow!!.next?.next == null) {
            slow.next = null
        } else {
            slow.next = slow.next!!.next
        }

        return head
    }
}

class ListNode(var `val`: Int) {
    var next: ListNode? = null
}