package example.f_scope_function

data class Person(var name: String, var age: Int = 0, var about: String = "")

// apply executes a block of code on an object and returns the object itself.
// Inside the block, the object is referenced by this. This function is handy for initializing objects.
fun main() {
    val jake = Person("jack").apply {
        age = 32
        about = "from london"
    }
    println(jake)
}