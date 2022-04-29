package com.example.demo.Find_First_and_Last_Position_of_Element_in_Sorted_Array

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test

class SolutionTest {
    var solution = Solution()

    @BeforeEach
    fun setUp() {
        solution = Solution()
    }

    @Test
    fun `binary_search_테스트`() {
        // given
        val nums = intArrayOf(1,2,3,4,5,6,7,8)
        val target = 5
        // when
        val result = solution.binarySearch(nums, target)
        // then
        assertEquals(result, 4)
    }

    @Test
    fun `intArray_test`() {
        //given
        val array = IntArray(2)
        //when
        //then
        array.set(0, -1)
    }

    @Test
    fun `testCase_1`() {
        //given
        val nums = intArrayOf(5,7,7,8,8,10)
        val target = 8
        //when
        val result = solution.searchRange(nums, target)
        //then
        assertArrayEquals(result, intArrayOf(3, 4))
    }

    @Test
    fun `testCase_2`() {
        //given
        val nums = intArrayOf(5,7,7,8,8,10)
        val target = 6
        //when
        val result = solution.searchRange(nums, target)
        //then
        assertArrayEquals(result, intArrayOf(-1, -1))
    }

    @Test
    fun `testCase_3`() {
        //given
        val nums = intArrayOf()
        val target = 0
        //when
        val result = solution.searchRange(nums, target)
        //then
        assertArrayEquals(result , intArrayOf(-1, -1))
    }

    @Test
    fun `testCase_4`() {
        //given
        val nums = intArrayOf(1)
        val target = 1
        //when
        val result = solution.searchRange(nums, target)
        //then
        assertArrayEquals(result, intArrayOf(0, 0))
    }

    @Test
    fun `testCase_5`() {
        //given
        val nums = intArrayOf(2, 2)
        val target = 2
        //when
        val result = solution.searchRange(nums, target)
        //then
        assertArrayEquals(result, intArrayOf(0, 1))
    }

    @Test
    fun `testCase_6`() {
        //given
        val nums = intArrayOf(1, 4)
        val target = 4
        //when
        val result = solution.searchRange(nums, target)
        //then
        assertArrayEquals(result, intArrayOf(1, 1))
    }

    @Test
    fun `testCase_7`() {
        //given
        val nums = intArrayOf(1, 2, 3)
        val target = 3
        //when
        val result = solution.searchRange(nums, target)
        //then
        assertArrayEquals(result, intArrayOf(2, 2))
    }

    @Test
    fun `testCase_8`() {
        //given
        val nums = intArrayOf(0,0,2,3,4,4,4,5)
        val target = 5
        //when
        val result = solution.searchRange(nums, target)
        //then
        assertArrayEquals(result, intArrayOf(7, 7))
    }
}
