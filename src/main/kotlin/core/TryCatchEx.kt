package core

class TryCatchEx {
}

fun main() {
    var a = 15
    var b = 0

    try {
        var c = a / b
        println(c)
    } catch (e: Exception) {
        println(e.message)
    } finally {
        println("It will always executed at end of try-catch block")
    }


    var z = try {
        a / b
    } catch (e: Exception) {
        0
    }

    println(z)
}