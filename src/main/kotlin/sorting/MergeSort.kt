package sorting

fun merge(list: IntArray, left: Int, right: Int, mid: Int) {
    //Get size of left and right array
    val n1 = mid - left + 1
    val n2 = right - mid

    //Get left and right array to temp arrays
    var leftArray = arrayListOf<Int>()
    var rightArray = arrayListOf<Int>()
    for (i in left..mid - 1) {
        leftArray[i] = list[left + i]
    }
    for (j in mid..right - 1) {
        rightArray[j] = list[mid + 1 + j]
    }

    //Merge the left and right to temp array
    var i = 0 //index of left array
    var j = 0 //index of right array
    var k = 0 //index of sorting array

    while (i < n1 && j < n2) {
        if (leftArray[i] < rightArray[j]) {
            list[k] = leftArray[i]
            i = i + 1

        } else {
            list[k] = rightArray[j]
            j = j + 1

        }
        k = k + 1
    }

    //There will be overflow in the arrays so
    while (n1 < left) {
        list[k] = leftArray[i]
        i = i + 1
        k = k + 1
    }

    while (n2 < right) {
        list[k] = rightArray[j]
        j = j + 1
        k = k + 1
    }

}

fun sort(list: IntArray, left: Int, right: Int) {
    //checking if left is greater than right
    //break loop when left = 0 and right = 0 too
    if (left < right && left > 0 && right > 0) {
        //Get mid point of the list
        var mid = left + (right - left) / 2

        //split array into left and right
        sort(list, left = left, right = mid) //left
        sort(list, left = mid + 1, right = right)

        //merge the sorted array
        merge(list, left, right, mid)
    }
}

fun main() {
    val list = arrayListOf<Int>(64, 25, 12, 22, 11).toIntArray()

    sort(list, left = 0, right = list.size - 1)
    list.forEach {
        println(it)
    }
}