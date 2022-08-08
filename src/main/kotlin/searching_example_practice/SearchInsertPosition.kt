package searching_example_practice

class SearchInsertPosition {
}

fun searchInsert(nums: IntArray, target: Int): Int {
    var beg = 0
    var end = nums.size - 1

    while (beg <= end) {
        val mid = beg + (end - beg) / 2

        if (nums[mid] == target) return mid
        else if (nums[mid] < target) beg = mid + 1
        else end = mid - 1
    }

    return beg
}

fun main() {
    val nums = arrayListOf<Int>(1, 3, 5, 6)
    val target = 8
    val result = searchInsert(nums.toIntArray(), target)
    println("We can insert element at= ${result}")
}