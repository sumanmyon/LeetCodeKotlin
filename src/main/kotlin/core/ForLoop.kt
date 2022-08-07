package core

class ForLoop {
}


fun main() {
    val names = arrayOf("ab", "cd", "df")
    for (n in names) {
        println(n)
    }


    val n = arrayListOf<String>()
    n.add("abc")
    n.add("def")

    for (i in 0 .. n.size-1 step 1) {
        println(n.get(i))
    }

    for (i in 'a' .. 'z' step 1) {
        println(i)
    }

    for(i in 0..n.size-1 step 1){
        println(n.get(i))
    }
}