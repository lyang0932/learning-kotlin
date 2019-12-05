package example.c_special_classes


// 密封类 , 所有的子类 必须在相同的文件中 , 不允许其他类 继承密封类
sealed class Mammal(val name: String)

class Cat(private val catName: String) : Mammal(catName)

class Human(private val humanName: String, val Job: String) : Mammal(humanName)

fun greetMammal(mammal: Mammal): String {
    return when (mammal) {
        is Human -> "Hello ${mammal.name}; You're working as a ${mammal.Job}"
        is Cat -> "Hello ${mammal.name}"
    }
}

fun main() {
    println(greetMammal(Cat("Snowy")))
}
