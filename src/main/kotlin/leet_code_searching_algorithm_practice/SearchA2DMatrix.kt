package leet_code_searching_algorithm_practice

//Write an efficient algorithm that searches for a value target in an m x n integer matrix matrix. This matrix has the following properties:
// 1. Integers in each row are sorted from left to right.
// 2. The first integer of each row is greater than the last integer of the previous row.
//
//Input: matrix = [[1,3,5,7],[10,11,16,20],[23,30,34,60]], target = 3
//Output: true
//
//Input: matrix = [[1,3,5,7],[10,11,16,20],[23,30,34,60]], target = 13
//Output: false

fun searchMatrix(matrix: Array<IntArray>, target: Int): Boolean {
    var result = false

    //check whether target falls under which sub-array list
    var indexAt = -1
    for (i in 0..matrix.size - 1 step 1) {
        val subArraySize = matrix[i].size - 1
        if (matrix[i][0] <= target && matrix[i][subArraySize] >= target) {
            indexAt = i
            break
        }
    }
    //println(indexAt)

    //If we did not found target element within any of 2D-subarray boundary then return false
    if (indexAt == -1) return result

    //Copy found array to new list and
    //search with binary search (Time and Space Complexity)- O(nlog(n))
    val list = matrix[indexAt]
    var beg = 0
    var end = list.size - 1
    //var foundAt = -1

    while (beg <= end) {
        val mid = beg + (end - beg) / 2
        if (list[mid] == target) {
            result = true
            break
        } else if (list[mid] < target) {
            beg = mid + 1
        } else {
            end = mid - 1
        }
    }

    return result
}

fun main() {
//    val matrix = arrayOf<IntArray>(
//        intArrayOf(1, 3, 5, 7),
//        intArrayOf(10, 11, 16, 20),
//        intArrayOf(23, 30, 34, 60),
//    )
//    val target = 3

    val matrix = arrayOf<IntArray>(
        intArrayOf(1, 3, 5, 7),
        intArrayOf(10, 11, 16, 20),
        intArrayOf(23, 30, 34, 60),
    )
    val target = 13

    val result = searchMatrix(matrix = matrix, target = target)
    println(result)
}