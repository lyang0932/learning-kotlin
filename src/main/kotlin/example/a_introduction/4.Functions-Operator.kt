package example.a_introduction

operator fun Int.times(str:String) = str.repeat(this)

operator fun String.get(range:IntRange) = substring(range)

fun main() {
    println(2 * "Bye")
    val str = "always forgive your enemies; nothing annoys them so much"
    println(str[0..14])
}