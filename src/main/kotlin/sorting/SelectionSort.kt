package sorting

class SelectionSort {
}


fun main(){
    val list = arrayListOf<Int>(64, 25, 12, 22, 11)

    //search minIndex in a loop.
    //At end of each loop swap list[beg] and list[minIndex].
    //Here, At end of every loop, largest value of list will be at first index of an array.
    //So update sorted index by plus 1

    for (i in 0..list.size-1 step 1){
        var minimumIndex= i

        for (j in i+1..list.size-1 step 1){
            if (list[minimumIndex] > list[j]){
                minimumIndex = j
            }
        }

        //swap i and minimum
        val temp = list[i]
        list[i] = list[minimumIndex]
        list[minimumIndex] = temp
    }

   list.forEach {
       println(it)
   }
}