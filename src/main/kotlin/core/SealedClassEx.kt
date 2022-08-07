package core

abstract class Sum(){

}

class SealedClassEx: Sum() {
}


sealed class Data {
    data class SUCCESS(val value: String) : Data()
    data class FAILURE(val value: String) : Data()
    object LOADING : Data()
}

fun getData(): Data {
    //return Data.FAILURE(value = (10..100).random().toString())
    return  Data.LOADING
}

fun main() {
    val data = getData()
    when (data) {
        is Data.SUCCESS -> {
            println(data)
        }
        is Data.FAILURE -> {
            println(data)
        }
        Data.LOADING -> {
            println(data)
        }
    }

}