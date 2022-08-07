package core

class ExtensionEx {
}

fun String.getAllWords(): List<String>{
    //this refers to current string
    return this.split(" ")
}

fun String.changeToGiverString(from: String, to:String): String{
    return this.replace(from,to)
}

fun main(){
    val a = "How are you?"
    val splittedStr = a.getAllWords()
    for (s in splittedStr) {
        println(s)
    }
    println(a.changeToGiverString("o", "a"))
}