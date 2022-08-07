package core

data class DataClassEx(var name: String, var age: Int)

class DataClassEx2(var name: String, var age: Int)

fun main(){
    var u1 = DataClassEx(name = "Suman Neupane", age = 2)
    var u2 = DataClassEx(name = "Suman Neupane", age = 2)

    if (u1 == u2){
        println("Equal")
    }else{
        println("Not Equal")
    }

    var u11 = DataClassEx2(name = "Suman Neupane", age = 2)
    var u21 = DataClassEx2(name = "Suman Neupane", age = 2)

    if (u11 == u21){
        println("Equal")
    }else{
        println("Not Equal")
    }
}