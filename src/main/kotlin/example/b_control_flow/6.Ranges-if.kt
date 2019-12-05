package example.b_control_flow

fun main() {

    val x = 2
    if (x in 1..10) println(x)
    println("------------------------------")
    if (x !in 1..4) println(x)

}