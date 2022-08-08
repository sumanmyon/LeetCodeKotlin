package sorting

fun swap(list: ArrayList<Int>, i: Int, j: Int) {
    var temp = list[i]
    list[i] = list[j]
    list[j] = temp
}

fun partition(list: ArrayList<Int>, l: Int, h: Int): Int {
    //find pivot
    var pivot = list[l]
    var i = l
    var j = h

    while (i < j ) {
        //Find element that is less than or equal to pivot
        //and stop
        do {
            i++
        } while (list[i] <= pivot)

        //Find element that is greater than pivot
        //and stop
        do {
            j--
        } while (list[j] > pivot)

        //swap ith and jth element
        if (i < j) swap(list, i, j)
    }

    //sorted pivot at
    swap(list, l, j)
    return j
}

fun quicksort(list: ArrayList<Int>, l: Int, h: Int) {
    if (l < h) {
        var p = partition(list, l, h)
        quicksort(list, l, p)
        quicksort(list, p + 1, h)
    }
}

fun main() {
    val list = arrayListOf<Int>(65, 48, 12, 2, 7, 100, 13, 20, 11)
    quicksort(list, 0, list.size - 1)
    list.forEach {
        println(it)
    }
}