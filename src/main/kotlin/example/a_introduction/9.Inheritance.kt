package example.a_introduction

open class Dog {

    open fun sayHello() {
        println("wow wow !")
    }

}

class Yorkshire :Dog(){

    override fun sayHello() {
        println("wif wif !")
    }

}
//-------------------------------------------------------------------

open class Tiger(val origin:String) {
    fun sayHello () {
        println("a tiger from $origin says : grrhhh !")
    }
}

class SiberianTiger : Tiger("Siberia")

//-------------------------------------------------------------------


fun main() {
    val dog : Dog = Yorkshire()
    dog.sayHello()

    val tiger : Tiger = SiberianTiger()
    tiger.sayHello()
}