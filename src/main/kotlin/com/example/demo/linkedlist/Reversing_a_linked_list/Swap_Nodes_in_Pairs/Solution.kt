package com.example.demo.linkedlist.Reversing_a_linked_list.Swap_Nodes_in_Pairs

class Solution {

  fun swapPairs(head: ListNode?): ListNode? {
    var current = head
    var next = head?.next
    val result = head?.next ?: head

    while (current != null && next != null) {
      val nextPairFirst = next.next
      val nextPairSecond = next.next?.next

      next.next = current
      current.next = nextPairFirst

      current = nextPairFirst
      next = nextPairSecond
    }

    return result
  }
}

class ListNode(var `val`: Int) {
  var next: ListNode? = null
}