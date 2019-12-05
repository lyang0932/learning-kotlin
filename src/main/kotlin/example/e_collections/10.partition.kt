package example.e_collections


val numberList = listOf(1, -2, 3, -4, 5, -6)

fun main() {

    val evenOdd = numberList.partition { it % 2 == 0 }

    val (positives, negatives) = numberList.partition { it > 0 }

    evenOdd.first.forEach { println(it) }
    println("---------------------------")
    evenOdd.second.forEach { println(it) }
    println("---------------------------")
    positives.forEach { println(it) }
    println("---------------------------")
    negatives.forEach { println(it) }

}
