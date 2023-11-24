package com.example.demo.linkedlist.Reversing_a_linked_list.Swap_Nodes_in_Pairs

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class SolutionTest {
  private val solution = Solution()

  @Test
  fun testCase0() {
    //given
    val head = ListNode(1)
    head.next = ListNode(2)
    head.next?.next = ListNode(3)
    head.next?.next?.next = ListNode(4)
    head.next?.next?.next?.next = ListNode(5)
    head.next?.next?.next?.next?.next = ListNode(6)
    //when
    val actual = solution.swapPairs(head)
    //then
    assertThat(actual?.`val`).isEqualTo(2)
    assertThat(actual?.next?.`val`).isEqualTo(1)
    assertThat(actual?.next?.next?.`val`).isEqualTo(4)
    assertThat(actual?.next?.next?.next?.`val`).isEqualTo(3)
    assertThat(actual?.next?.next?.next?.next?.`val`).isEqualTo(6)
    assertThat(actual?.next?.next?.next?.next?.next?.`val`).isEqualTo(5)
  }
}