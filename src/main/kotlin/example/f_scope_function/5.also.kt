package example.f_scope_function

fun main() {
    val numbers = mutableListOf(1 ,2 ,3 ,4)
    numbers.also { println("the list elements before adding new one:$it") }

}