package example.b_control_flow

fun forExample(){
    val cakes = listOf("carrot" , "cheese" , "chocolate")
    for (cake in cakes) {
        println("Yummy , it's a $cake cake !")
    }
}

fun eatACake() = println("eat a cake")
fun bakeACake() = println("bake a cake")

fun whileExample(){
    var cakesEaten = 0
    var cakesBaked = 0
    while (cakesEaten < 5) {
        eatACake()
        cakesEaten ++
    }

    do {
        bakeACake()
        cakesBaked ++
    } while (cakesBaked < cakesEaten)
}

class Animal(val name:String)

class Zoo(private val animals:List<Animal>) {
    operator fun iterator() : Iterator<Animal> {
        return animals.iterator()
    }
}

fun iteratorsExample() {
    val zoo = Zoo(listOf(Animal("zebra") ,Animal("line")))
    for ( animal in zoo) println("watch out , it's a ${animal.name}")
}

fun main() {
    forExample()

    whileExample()

    iteratorsExample()
}