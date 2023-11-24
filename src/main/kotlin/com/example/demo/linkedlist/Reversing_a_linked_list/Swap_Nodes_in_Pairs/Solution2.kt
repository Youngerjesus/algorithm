package com.example.demo.linkedlist.Reversing_a_linked_list.Swap_Nodes_in_Pairs

class Solution2 {
  fun swapPairs(head: ListNode?): ListNode? {
    val dummy = head?.next ?: head
    var prev: ListNode? = null

    var current = head
    while (current?.next != null) {
      if (prev != null) {
        prev.next = current.next
      }
      prev = current

      val next = current.next?.next

      current.next?.next = current

      current = next
    }

    return dummy
  }
}