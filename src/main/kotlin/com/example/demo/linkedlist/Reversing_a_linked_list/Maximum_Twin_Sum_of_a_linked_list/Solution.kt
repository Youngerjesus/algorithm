package com.example.demo.linkedlist.Reversing_a_linked_list.Maximum_Twin_Sum_of_a_linked_list

class Solution {
  fun pairSum(head: ListNode?): Int {
    val middle = findMiddleNode(head)
    val tail: ListNode? = reverse(middle)
    return calculateTwinSum(tail, head)
  }

  private fun calculateTwinSum(prev: ListNode?, head: ListNode?): Int {
    var max = Int.MIN_VALUE
    var tail = prev
    var head = head
    while (tail != null && head != null) {
      max = maxOf(tail.`val` + head.`val`, max)
      tail = tail.next
      head = head.next
    }
    return max
  }

  private fun reverse(middle: ListNode?): ListNode? {
    var reverse = middle
    var prev: ListNode? = null
    while (reverse != null) {
      val next = reverse.next
      reverse.next = prev
      prev = reverse
      reverse = next
    }
    return prev
  }

  private fun findMiddleNode(head: ListNode?): ListNode? {
    var fast = head
    var slow = head

    while (fast != null) {
      fast = fast.next?.next
      slow = slow?.next
    }
    return slow
  }
}

class ListNode(var `val`: Int) {
  var next: ListNode? = null
}