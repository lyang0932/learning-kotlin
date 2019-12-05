package example.g_delegation

interface SoundBehavior {
    fun makeSound()
}

class ScreamBehavior(private val n:String) : SoundBehavior {
    override fun makeSound() = println("${n.toUpperCase()}")
}

class RockAndRollBehavior(private val n:String):SoundBehavior {
    override fun makeSound() = println("I'm th king of rock 'n' roll: $n")
}

class TomAraya(n:String) : SoundBehavior by ScreamBehavior(n)

class ElvisPresley(n:String) : SoundBehavior by RockAndRollBehavior(n)

fun main() {
    val tomAraya = TomAraya("Trash Metal")
    tomAraya.makeSound()

    val elvisPresley = ElvisPresley("Dancin' to the Jailhouse Rock")
    elvisPresley.makeSound()
}