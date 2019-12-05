package example.e_collections

val totalCount = numbers.count()
val evenCount = numbers.count { it % 2 == 0 }

fun main() {
    println("totalCount : $totalCount")
    println("evenCount : $evenCount")
}
