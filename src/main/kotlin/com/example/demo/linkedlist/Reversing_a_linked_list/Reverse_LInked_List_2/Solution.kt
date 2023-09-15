package com.example.demo.linkedlist.Reversing_a_linked_list.Reverse_LInked_List_2

class Solution {

//    fun reverseBetween(head: ListNode?, left: Int, right: Int): ListNode? {
//        if (left == right) return head
//
//        var rightNode = head
//        for (i in 1 until right) {
//            rightNode = rightNode?.next
//        }
//
//        var leftNode = head
//        var prevLeftNode: ListNode? = null
//        for (i in 1 until left) {
//            prevLeftNode = leftNode
//            leftNode = leftNode?.next
//        }
//
//        var prevNode = leftNode
//        var currentNode = leftNode?.next
//
//        prevLeftNode?.next = rightNode
//        leftNode?.next = rightNode?.next
//
//        for (i in left + 1..right) {
//            val nextNode = currentNode?.next
//            currentNode?.next = prevNode
//            prevNode = currentNode
//            currentNode = nextNode
//        }
//
//        return if (left == 1) prevNode else head
//    }

    fun reverseBetween(head: ListNode?, left: Int, right: Int): ListNode? {
        val temp = ListNode(-1)
        var prev: ListNode? = temp
        temp.next = head

        for (i in 0 until left - 1) {
            prev = prev?.next
        }

        var cur = prev?.next

        for (i in 0 until right - left) {
            val ptr = prev?.next
            prev?.next = cur?.next
            cur?.next = cur?.next?.next
            prev?.next?.next = ptr
        }

        return temp.next
    }
}


class ListNode (var `val`: Int) {
    var next: ListNode? = null
}
