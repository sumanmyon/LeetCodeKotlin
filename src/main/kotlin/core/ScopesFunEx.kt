package core

class ScopesFunEx {
}

class Square(
    private val width: Int,
    private val height: Int,
    private var color: String? = null,
    private var text: String? = null
) {
    fun fillColor(color: String) {
        this.color = color
        println("$color color filled")
    }

    fun addText(text: String) {
        this.text = text
        println("\"$text\" text added")
    }

    override fun toString(): String {
        return "Square(width=$width, height=$height, color=$color, text=$text)"
    }
}

fun letEx() {
    println("-----------let-------------")
    val square = Square(10, 20).let {
        it.fillColor("RED")
        it.addText("Some text")
        //last line will be return-> it, Unit-> if we dont provide
        it
    }

    //let is also used for null checks
    var square2: Square? = null
    square2?.let {
        it.fillColor("RED")
        it.addText("Some text")
        it
    }

    println(square)
    println(square2)
}

fun letRun() {
    println("-----------run-------------")
    val square = Square(10, 20).run {
        this.fillColor("RED")
        this.addText("Some text")
        //Return value is not required because this is returned itself
    }

    println(square)
}

fun letWith() {
    println("-----------with-------------")
    val square = Square(10, 20)
    //if you need to add to same function and need to call same function again and again
    with(square) {
        this.fillColor("RED")
        this.addText("Some text")
        //Return value is not required because this is returned itself
    }

    println(square)

}

fun letApply() {
    println("-----------apply-------------")
    val square = Square(10, 20).apply {
        fillColor("RED")
        addText("Some text")
        //Return value is not required because this is returned itself
    }

    println(square)
}

fun letAlso() {
    println("-----------apply-------------")
    val square = Square(10, 20).also {
        it.fillColor("RED")
        it.addText("Some text")
        //Return value is not required because this is returned itself
    }

    println(square)
}


fun main() {
    letEx()
    letRun()
    letWith()
    letApply()
    letAlso()
}























