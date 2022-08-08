package searching

class LinearSearch {

    //Here we assume list is list of integer array
    //and toFind is to find that number in list
    //If we found that number in list then we return the index of that number in list
    //else -1
    fun searchElement(list: ArrayList<Int>, toFind: Int): Int {
        val length = list.size
        var result = -1

        for (i in 0..length - 1 step 1) {
            if (list.get(i) == toFind) {
                result = i
                break
            }
        }
        return result
    }

    fun repeate(list: ArrayList<Int>, toFind: Int, index: Int): Int {
        if (index >= list.size) return -1
        else if (list[index] == toFind) return index
        else return repeate(list, toFind, index + 1)
    }

    fun searchElementInRecursiveWay(list: ArrayList<Int>, toFind: Int): Int {
        return repeate(list, toFind, 0)
    }
}

fun main() {

    val lists = arrayListOf<Int>(10, 20, 80, 30, 60, 50, 110, 100, 130, 170)
    val find = 110

    val search = LinearSearch()
    val result = search.searchElement(list = lists, toFind = find)
    println("result= ${result}")


    val result2 = search.searchElementInRecursiveWay(list = lists, toFind = find)
    println("found At = ${result2}")
}


