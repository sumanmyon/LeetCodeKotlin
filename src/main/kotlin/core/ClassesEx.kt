package core

class ClassesEx {
}

class User(val name: String, var age: Int) {

}


class Name(name: String, var age: Int) {
    val name: String

    init {
        if (name.isBlank()) {
            this.name = "No name"
        } else {
            this.name = name
        }
    }

    public constructor(n: String) : this(n, age = 1) {

    }

}
