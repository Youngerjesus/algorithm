package com.example.demo.linkedlist.Reversing_a_linked_list

class Solution {
    fun swapPairs(head: ListNode?): ListNode? {
        var head = head
        if (head?.next == null) return head

        val dummy = head.next!!
        var prev: ListNode? = null

        while (head?.next != null) {
            if (prev != null) {
                prev.next = head?.next
            }
            prev = head

            val nextNode = head?.next!!.next
            head?.next?.next = head

            head?.next = nextNode
            head = nextNode
        }

        return dummy
    }

}

class ListNode (val data: Int) {
    var next: ListNode? = null
}