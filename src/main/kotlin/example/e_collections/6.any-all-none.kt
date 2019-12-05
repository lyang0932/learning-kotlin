package example.e_collections

val anyNegative = numbers.any { it < 0 }
val anyGT6 = numbers.any { it > 6 }

val allEven = numbers.all { it % 2 == 0 }
val allLess6 = numbers.all { it < 6 }

val noneEven = numbers.none { it % 2 == 1 }
val noneLess6 = numbers.none { it > 6 }

fun main() {
    // Function any
    println("anyNegative : $anyNegative")
    println("anyGT6 : $anyGT6")

    // Function all
    println("allEven : $allEven")
    println("allLess6 : $allLess6")

    // Function none
    println("noneEven : $noneEven")
    println("noneLess6 : $noneLess6")

}