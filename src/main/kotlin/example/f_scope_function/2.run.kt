package example.f_scope_function

fun printNullableLength(ns:String?) {
    println("for \"$ns\":")
    ns?.run {
        println("\tis empty? " + isEmpty())
        println("\tlength = $length")
        length
    }
}


// Like let, run is another scoping function from the standard library.
// Basically, it does the same: executes a code block and returns its result.
// The difference is that inside run the object is accessed by this.
// This is useful when you want to call the object's methods rather than pass it as an argument.
fun main() {
    printNonNull(null)
    println("------------")
    printNonNull("")
    println("------------")
    printNonNull("some string with kotlin")
}