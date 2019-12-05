package example.e_collections

val words = listOf("Lets" , "find" , "something" , "in" , "collection" , "somehow")
val empty = emptyList<String>()

// first , last
val first = words.find { it.startsWith("some") }
val last = words.findLast { it.startsWith("some") }
val nothing = words.find { it.contains("nothing") }

//firstOrNull , lastOrNull

fun main() {
    println(first)
    println(last)
    println(nothing)
    println(nothing?:"空")
    println(empty.findLast { it.startsWith("z") })
}