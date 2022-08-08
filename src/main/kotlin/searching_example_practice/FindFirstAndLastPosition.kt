package searching_example_practice

/**
 * Find First and Last Position of Element in Sorted Array
 * Given an array of integers nums sorted in non-decreasing order, find the starting and ending position of a given target value.
 * If target is not found in the array, return [-1, -1].
 *
 * You must write an algorithm with O(log n) runtime complexity.
 *
 * Example 1:
 * Input: nums = [5,7,7,8,8,10], target = 8
 * Output: [3,4]
 *
 * Example 2:
 * Input: nums = [5,7,7,8,8,10], target = 6
 * Output: [-1,-1]
 *
 * Example 3:
 * Input: nums = [], target = 0
 * Output: [-1,-1]
 */

fun left(nums: IntArray, target: Int): Int {
    var beg = 0
    var end = nums.size - 1
    var found = -1

    while (beg <= end) {
        val mid = beg + (end - beg) / 2

        if (nums[mid] == target) {
            found = mid
        }

        //decrease mid value even we found mid
        if (nums[mid] < target) beg = mid + 1
        else end = mid - 1
    }

    return found
}

fun right(nums: IntArray, target: Int): Int {

    var beg = 0
    var end = nums.size - 1
    var found = -1

    while (beg <= end) {
        val mid = beg + (end - beg) / 2

        if (nums[mid] == target) {
            found = mid
        }

        //increase mid value even we found mid
        if (nums[mid] <= target) beg = mid + 1
        else end = mid - 1
    }

    return found
}

fun searchRange(nums: IntArray, target: Int): IntArray {
    val result = arrayOf(-1, -1)
    val leftMostIndex = left(nums, target)
    val rightMostIndex = right(nums, target)
    result[0] = leftMostIndex
    result[1] = rightMostIndex
    return result.toIntArray()
}


fun main() {
    val nums = arrayOf(5, 7, 7, 8, 8, 8, 8, 10) //arrayListOf<Int>() //
    val find = 8

    val result = searchRange(nums.toIntArray(), find)
    println("[${result[0]},${result[1]}]")
}

