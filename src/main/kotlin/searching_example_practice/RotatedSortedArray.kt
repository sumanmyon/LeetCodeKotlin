package searching_example_practice

class RotatedSortedArray {
}

fun search(nums: IntArray, target: Int): Int {
    var temp = nums
    temp = temp.sorted().toIntArray()

    var beg = 0;
    var end = temp.size - 1

    var foundIndex = -1

    while (beg <= end) {
        val mid = beg + (end - beg) / 2

        if (temp[mid] == target) {
            foundIndex = temp[mid]
            //break
        }
        if (temp[mid] < target) {
            beg = mid + 1
        } else {
            end = mid - 1
        }
    }


    if (foundIndex > -1) {
        val r = nums.indexOf(foundIndex)
        return r
    }
    return foundIndex
}

fun main() {
    val nums = arrayListOf<Int>(4,5,6,7,0,1,2)
    val target = 1
    val result = search(nums.toIntArray(), target)
    println("We can insert element at= ${result}")
}