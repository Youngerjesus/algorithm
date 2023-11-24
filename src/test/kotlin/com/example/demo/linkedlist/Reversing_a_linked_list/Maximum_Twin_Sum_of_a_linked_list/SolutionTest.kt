package com.example.demo.linkedlist.Reversing_a_linked_list.Maximum_Twin_Sum_of_a_linked_list

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class SolutionTest {
  private val solution = Solution()

  @Test
  fun testCase0() {
    //given
    val head = ListNode(9)
    head.next = ListNode(4)
    head.next?.next = ListNode(2)
    head.next?.next?.next = ListNode(1)
    //when
    val actual = solution.pairSum(head)
    //then
    assertThat(actual).isEqualTo(10)
  }
}