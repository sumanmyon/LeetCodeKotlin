package searching

class BinarySearchInIterativeWay {

    //This function will search in iterative way
    fun searchElement(list: ArrayList<Int>, toFind: Int): Int {
        var beg = 0
        var end = list.size - 1

        while (beg <= end) {
            val mid = beg + (end - beg) / 2
            val value = list[mid]

            if (value == toFind) {
                return mid
            } else if (value < toFind) {
                beg = mid + 1
            } else {
                end = mid - 1
            }
        }

        return -1
    }
}

class BinarySearchInRecursiveWay {
    //This function will search in Recursive way

    fun repeatFun(list: ArrayList<Int>, toFind: Int, beg: Int, end: Int): Int {
        if (beg >= end) return -1

        val mid = beg + (end - beg) / 2
        val value = list[mid]

        if (value == toFind){
            return mid
        }
        else if (value < toFind){
            return repeatFun(list, toFind, beg = mid + 1, end = end)
        }
        else{
            return repeatFun(list, toFind, beg = beg, end = mid - 1)
        }
    }


    fun searchElement(list: ArrayList<Int>, toFind: Int): Int {
        return repeatFun(list, toFind, beg = 0, end = list.size - 1)
    }
}

fun main() {

    val lists = arrayListOf(2, 3, 4, 10, 40)
    val find = 3

    val searchInIterativeWay = BinarySearchInIterativeWay()
    val result = searchInIterativeWay.searchElement(list = lists, toFind = find)
    println("found at= ${result}")

    val searchInRecursiveWay = BinarySearchInRecursiveWay()
    val result2 = searchInRecursiveWay.searchElement(list= lists, toFind = find)
    print("found at= ${result2}")
}


