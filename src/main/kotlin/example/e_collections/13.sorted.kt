package example.e_collections

fun main() {
    val shuffled = listOf(5, 4, 3, 2, 1)
    val natural = shuffled.sorted()
    val inverted = shuffled.sortedBy { -it } // selector function

    shuffled.forEach { println(it) }
    println("-------------")
    natural.forEach { println(it) }
    println("-------------")
    inverted.forEach { println(it) }
}