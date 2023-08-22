package com.example.demo.linkedlist.Fast_and_slow_pointers.Middle_of_the_linked_list

class Solution {
    fun middleNode(head: ListNode?): ListNode? {
        var fast = head
        var slow = head

        while (fast?.next != null) {
            fast = fast.next!!.next
            slow = slow!!.next
        }
        return slow
    }
}

class ListNode(var value: Int) {
    var next: ListNode? = null
}