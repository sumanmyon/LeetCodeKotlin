package core

class Manager private constructor() {

    companion object {
        private var instance: Manager? = null

        fun getInstance(): Manager {
            if (instance == null)
                instance = Manager()
            return instance!!
        }

        fun getInstance2() = synchronized(this) {
            if (instance == null)
                instance = Manager()
            instance
        }

        operator fun invoke() = synchronized(this) {
            if (instance == null)
                instance = Manager()
            instance
        }
    }
}

object Manager2 {

}

fun main() {
    println(Manager.getInstance())
    println(Manager.getInstance())
    println(Manager.getInstance2())
    println(Manager.getInstance2())
    println(Manager())
    println(Manager())
    println(Manager2)
    println(Manager2)
}