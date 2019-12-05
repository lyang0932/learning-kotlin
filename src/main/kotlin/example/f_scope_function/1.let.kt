package example.f_scope_function


fun printNonNull(str:String?){

    println("printing \"$str\"")

    str?.let {
        println(it)
    }
}

// The Kotlin standard library function let can be used for scoping and null-checks.
// When called on an object, let executes the given block of code and returns the result of its last expression.
// The object is accessible inside the block by the reference it
fun main() {
    val empty = "test".let {
        println(it)
        it.isEmpty()
    }
    println("is empty : $empty")

    println("-----------------")

    printNonNull(null)

    println("-----------------")

    printNonNull("string")
}