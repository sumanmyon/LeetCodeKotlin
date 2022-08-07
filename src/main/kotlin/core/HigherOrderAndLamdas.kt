package core

import kotlin.concurrent.thread

class HigherOrderAndLamdas {
}

fun rollDice(
    range: IntRange,
    time: Int,
    callback: (result: Int) -> Unit
) {
    for (i in 0..time - 1) {
        val result = range.random()
        callback(result)
    }
}

fun rollDice(
    callback: ((result: Int) -> Unit)? = null
): String {
    thread {
        Thread.sleep(3000)
        callback?.invoke(4)
    }
    return "Dice Rolled"
}

fun main() {
    rollDice(range = 1..6, time = 4) { result ->
        println(result)
    }

    val result = rollDice()
    println(result)

    rollDice{
        println(it)
    }
}