package example.b_control_flow

import example.a_introduction.Dog

fun cases(obj: Any) {
    when (obj) {
        1 -> println("one")
        "Hello" -> println("greeting")
        is Long -> println("Long")
        !is String -> println("not a String")
        else -> println("unknown")
    }
}

fun main() {
    cases("Hello")
    cases(1)
    cases(0L)
    cases(Dog())
    cases("hello")
}