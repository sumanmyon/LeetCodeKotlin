package leet_code_searching_algorithm_practice

//There is an integer array nums sorted in non-decreasing order (not necessarily with distinct values).
//Before being passed to your function, nums is rotated at an unknown pivot index k (0 <= k < nums.length)
// such that the resulting array is [nums[k], nums[k+1], ..., nums[n-1], nums[0], nums[1], ..., nums[k-1]]
// (0-indexed). For example, [0,1,2,4,4,4,5,6,6,7] might be rotated at pivot index 5 and
// become [4,5,6,6,7,0,1,2,4,4].
//
//Given the array nums after the rotation and an integer target, return true if target is in nums,
// or false if it is not in nums.
//
//You must decrease the overall operation steps as much as possible.
//
//Example 1:
//Input: nums = [2,5,6,0,0,1,2], target = 0
//Output: true
//
//Example 2:
//Input: nums = [2,5,6,0,0,1,2], target = 3
//Output: false

fun search(nums: IntArray, target: Int): Boolean {
    var foundTarget = false

    //Find the index from where nums list is sorted
    var indexAt = -1
    for (i in 0..nums.size - 1) {
        val c = i + 1
        if (i < nums.size - 1 && nums[i] > nums[c]) {
            indexAt = i + 1
            break
        }
    }
    println(indexAt)
    println("-----------")


    //formate num list to ascending order according to index found
    var list = IntArray(nums.size)
    if (indexAt > -1) {
        for (i in 0..nums.size - 1) {
            val putAt = (i + indexAt) % nums.size //(i + indexAt) / nums.size
            list[i] = nums[putAt]
        }
    } else {
        list = nums
    }
    list.forEach {
        println(it)
    }


    //Binary search to find target
    var beg = 0
    var end = nums.size - 1
    while (beg <= end) {
        val mid = beg + (end - beg) / 2
        if (list[mid] == target) {
            foundTarget = true
            break
        } else if (list[mid] < target) {
            beg = mid + 1
        } else {
            end = mid - 1
        }
    }

    return foundTarget
}


fun search2(nums: IntArray, target: Int): Boolean {
    //Binary search to find target
    var foundTarget = false
    var beg = 0
    var end = nums.size - 1
    while (beg <= end) {
        //no need to find mid,
        // just increase beg and decrease end, you will find ans
        if (nums[beg] == target || nums[end] == target) {
            foundTarget = true
            break
        } else if (nums[beg] < target) {
            beg = beg + 1
        } else if (nums[end] > target) {
            end = end - 1
        } else {
            break
        }
    }


    return foundTarget
}


fun main() {
    val nums = intArrayOf(2, 5, 6, 0, 0, 1, 2)
//    val nums = intArrayOf(0, 0, 1, 2)
//    val target = 3
//    val nums = intArrayOf(1,0,1,1,1)
//    val nums = intArrayOf(1,1)
    val target = 3

    val result = search2(nums = nums, target = target)
    println(result)
}