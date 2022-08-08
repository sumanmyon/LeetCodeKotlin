package sorting

class BubbleSort {
}

fun main() {
    val list = arrayListOf<Int>(64, 25, 12, 22, 11)

    //check first two element (beg = 0, end = 1) and swap it
    //then check second two element (beg = 1, end = 2) and swap it
    //Here, At end of every loop, largest value of list will be at first/last index of an array.
    //So update sorted index by plus 1

    for (i in 0..list.size - 1 step 1) {
        for (j in i..list.size - 1 step 1) {
            if (list[i] > list[j]) {
                val temp = list[i]
                list[i] = list[j]
                list[j] = temp
            }
        }
    }

    list.forEach {
        println(it)
    }

}
