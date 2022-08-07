package core

class EnumAndSealedEx {

}

enum class Color {
    RED,
    GREEN,
    BLUE
}

enum class Color2(val colorName: String, val colorValue: Int) {
    RED("Red", 10),
    GREEN("Green", 20),
    BLUE("Blue", 30),
}

interface DoColor{
    fun doColor()
}
enum class Color3(val colorName: String, val colorValue: Int):DoColor {
    RED("Red", 10) {
        override fun doColor() {
            println("Color is ${colorName}")
        }
    },
    GREEN("Green", 20) {
        override fun doColor() {
            println("Color is ${colorName}")
        }
    },
    BLUE("Blue", 30) {
        override fun doColor() {
            println("Color is ${colorName}")
        }
    },
}


fun main(){
    Color.values().forEach {
        println(it)
    }

    val color = Color2.BLUE
    when(color){
        Color2.RED ->  println("Color is ${color.colorName}")
        Color2.GREEN ->  println("Color is ${color.name}")
        Color2.BLUE ->  println("Color is ${Color.BLUE}")
    }

    val color3 = Color3.RED.doColor()
}