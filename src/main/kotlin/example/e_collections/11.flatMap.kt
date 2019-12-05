package example.e_collections

// flatMap transform each element of a collection into an iterable object and builds a single list of the transformation result
fun main() {
    val numbers = listOf(1, 2, 3)

    numbers.flatMap { listOf(it, it, it) }.forEach { println(it) }
}