package leet_code_searching_algorithm_practice


fun mySqrt(x: Int): Int {
    if (x <= 1) return x

    var beg = 1
    var end = x
    var result = 0

    while (beg <= end) {
        val mid = beg + (end - beg) / 2

        if (mid <= x / mid) {
            beg = mid + 1
            result = mid
        } else {
            end = mid - 1
        }
    }
    return result
}

//289398

fun main() {
    val x = 2147395600
    val result = mySqrt(x)
    println(result)

    println(Math.sqrt(x.toDouble()))
}