package sorting

class InsertionSort {
}

fun main() {
    val list = arrayListOf<Int>(64, 25, 12, 22, 11)

    //assume first index is sorted so start with index 1.
    //backtrack to 0 and check whether current index value is smaller than pervious index. Swap them
    //At the end of loop, swap current index value and beg value

    for (i in 1..list.size - 1) {
        var j = i
        var temp = list[j]

        //back tracking and swaping older sorted up to index
        while (j >= 0 && list[j] > temp) {
            list[j] = list[j - 1]
            j = j - 1
        }

        //add value to particular index
        list[j] = temp
    }

    list.forEach {
        println(it)
    }
}