package leet_code_searching_algorithm_practice

//Find Minimum in Rotated Sorted Array
fun findMin(nums: IntArray): Int {
    var beg = 0
    var end = nums.size - 1
    var minValue = 0

    while (beg <= end) {
        if(nums[beg] == nums[end]){
            minValue = beg
            break
        } else if (nums[beg] > nums[end]) {
            beg = beg + 1
        } else if (nums[beg] < nums[end]) {
            end = end - 1
        }
    }
    return nums[minValue]
}

//Find Minimum in Rotated Sorted Array II
fun findMin2(nums: IntArray): Int {
    var beg = 0
    var end = nums.size - 1
    var minValue = 0

    while (beg <= end) {
        if(nums[beg] == nums[end]){
            minValue = beg
            beg = beg + 1
        } else if (nums[beg] > nums[end]) {
            beg = beg + 1
        } else if (nums[beg] < nums[end]) {
            end = end - 1
        }
    }
    return nums[minValue]
}


fun main() {
    //Find Minimum in Rotated Sorted Array
    //val nums = arrayListOf<Int>(3, 4, 5, 1, 2)
    //val nums = arrayListOf<Int>(4,5,6,7,0,1,2)
    //val nums = arrayListOf<Int>(11,13,15,17)
    //val result = findMin(nums.toIntArray())
    //println(result)


    //Find Minimum in Rotated Sorted Array II
    //val nums2 = arrayListOf<Int>(1,3,5)
    val nums2 = arrayListOf<Int>(2,2,2,0,1)
    //val nums2 = arrayListOf<Int>(3,1,3)

    val result2 = findMin2(nums2.toIntArray())
    println(result2)
}