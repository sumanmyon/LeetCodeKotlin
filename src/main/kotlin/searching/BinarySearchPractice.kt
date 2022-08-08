package searching

interface BinarySearch {
    fun search(list: ArrayList<Int>, toFind: Int): Int
}

class BinarySearchInIterative : BinarySearch {
    override fun search(list: ArrayList<Int>, toFind: Int): Int {
        var beg = 0
        var end = list.size - 1

        while (beg <= end) {
            val mid = beg + (end - beg) / 2

            if (list[mid] == toFind) {
                return mid
            } else if (list[mid] < toFind) {
                beg = mid + 1
            } else {
                end = mid - 1
            }
        }

        return -1
    }
}


class BinarySearchInRecursive : BinarySearch {
    private fun repeatSelf(list: ArrayList<Int>, toFind: Int, beg: Int, end: Int): Int {
        if (beg <= end) {
            val mid = beg + (end - beg) / 2

            if (list[mid] == toFind) {
                return mid
            } else if (list[mid] < toFind) {
                return repeatSelf(list, toFind, beg = mid + 1, end = end)
            } else {
                return repeatSelf(list, toFind, beg = beg, end = mid - 1)
            }
        }
        return -1
    }


    override fun search(list: ArrayList<Int>, toFind: Int): Int {
        return repeatSelf(list = list, toFind = toFind, beg = 0, end = list.size - 1)
    }

}


fun main() {
    //base case ko ho vanda
    // mid = beg + (end - beg) /2

    val sortedList = arrayListOf<Int>(1, 3, 4, 7, 10, 13, 21, 56)
    val findThisElementInArray = 21

    //Iterative Way
    val searchInIterativeWay = BinarySearchInIterative()
    val result1 = searchInIterativeWay.search(list = sortedList, toFind = findThisElementInArray)
    println("Found At= ${result1}")


    //Recursive Way
    val searchInRecursiveWay = BinarySearchInRecursive()
    val result2 = searchInRecursiveWay.search(list = sortedList, toFind = findThisElementInArray)
    println("Found At= ${result2}")
}


