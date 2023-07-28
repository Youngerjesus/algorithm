package com.example.demo.array.two_pointers.squares_of_a_sorted_array


class Solution {
    fun sortedSquares(nums: IntArray): IntArray {
        val startIndex = nums.indexOfFirst { it >= 0 }
        val result = IntArray(nums.size)


        if (isContainNegativeNumbers(nums, startIndex)) {
            appendToResult(nums, result, 0, nums.lastIndex, "DESC")
        }
        else if (isContainPositiveNumbers(startIndex)) {
            appendToResult(nums, result, 0, 0, "ASC")
        }
        else {
            var i = startIndex + 1
            var j = startIndex - 1
            var k = 0

            if (isContainZero(nums, startIndex)) {
                result[0] = 0
                k++
            } else {
                i -= 1
            }

            while (i <= nums.lastIndex && j >= 0) {
                val n1 = nums[i].square()
                val n2 = nums[j].square()

                if (n1 > n2) {
                    result[k++] = n2
                    j--
                }
                else if (n1 < n2) {
                    result[k++] = n1
                    i++
                } else {
                    result[k++] = n1
                    result[k++] = n2
                    i++
                    j--
                }
            }

            appendToResult(nums, result, k, i, "ASC")
            appendToResult(nums, result, k, j, "DESC")
        }

        return result
    }

    private fun appendToResult(nums: IntArray, result: IntArray, resultStartIndex: Int, numsStartIndex: Int, isDirection: String) {
        var i = resultStartIndex
        var j = numsStartIndex

        if (isDirection == "ASC") {
            while (j <= nums.lastIndex) {
                result[i++] = nums[j++].square()
            }
        }
        else if (isDirection == "DESC"){
            while (j >= 0) {
                result[i++] = nums[j--].square()
            }
        }
    }

    private fun isContainZero(nums: IntArray, startIndex: Int) = nums[startIndex] == 0

    private fun isContainPositiveNumbers(startIndex: Int) = startIndex == 0

    private fun isContainNegativeNumbers(nums: IntArray, startIndex: Int): Boolean = startIndex == -1 || startIndex == nums.lastIndex

    private fun Int.square(): Int {
        return this * this
    }
}