package core

class ComparisonAndLogicalOperators {
}

fun sum(a: Int, b: Int): Int {
    return a + b
}

fun sum(a: Double = 0.0, b: Double = 0.0) = a + b


fun main(): Unit {
    true and false
    true or true
    true xor true

    println(sum(a = 1.0, b = 9.0))


    val c = (2 > 1) || (3 > 2) && (2 < 3)
    println(c)

    if (c) {
        println(c)
    }

    for (i in 0..10 step 1) {
        //if (i == 4) continue

        // if(i in 4..7) continue
        if (i !in 4..7) continue

        println(i)
    }

    for (i in 0..10 step 1) {
        val result = if (i !in 4..7) "+" else "-"

        println("${result}${i}")
    }


    val time = 12
    when (time) {
        in 0..11 -> println("Good Morning")
        12 -> println("Lunch Time")
        13, 14 -> println("Nap Time")
        else -> println("Good Day")
    }
}