package example.c_special_classes

enum class State { IDLE, RUNNING, FINISHED }

fun parseMessage(state: State): String {
    return when (State.RUNNING) {
        State.IDLE -> "It's idle"
        State.RUNNING -> "It's running"
        State.FINISHED -> " It's finished"
    }
}

enum class Color(val rgb: Int) {
    RED(0xFF0000),
    GREEN(0x00FF00),
    BLUE(0x0000FF),
    YELLOW(0xFFFF00);

    fun containsRed() = (this.rgb and 0xFF0000 != 0)
}

fun main() {
    println(parseMessage(State.RUNNING))

    println("-------------------------------------------------------")

    val red = Color.RED
    println(red)
    println(red.containsRed())
    println(Color.BLUE.containsRed())
}
