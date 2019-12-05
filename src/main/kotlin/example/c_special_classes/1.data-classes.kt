package example.c_special_classes

data class User(val name: String, val id: Int)

fun main() {
    val user = User("alex", 1)
    println(user)

    val secondUser = User("alex", 1)
    val thirdUser = User("max", 2)

    println("user == secondUser: ${user == secondUser}")
    println("user == thirdUser: ${user == thirdUser}")

    println(user.hashCode())
    println(secondUser.hashCode())
    println(thirdUser.hashCode())

    // copy()
    println(user.copy())
//    println(user.copy("Max"))
    println(user.copy(id = 2))

    println("name = ${user.component1()}")
    println("name = ${user.component2()}")
}