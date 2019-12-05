package example.e_collections

val doubled = numbers.map{ x -> x * 2 }

val tripled = numbers.map { it * 3 }

fun main() {
    for (x in doubled) println(x)
    println("-----------------")
    for (x in tripled) println(x)
}