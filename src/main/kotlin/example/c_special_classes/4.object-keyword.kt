package example.c_special_classes

import java.util.*


class LuckDispatcher {
    fun getNumber() {
        var objRandom = Random()
        println(objRandom.nextInt(90))
    }
}


fun rentPrice(standardDays: Int, festivityDays: Int, specialDays: Int): Unit {
    // 使用 object 关键字 创建 匿名类
    val dayRates = object {
        var standard: Int = 30 * standardDays
        var festivityDays: Int = 50 * festivityDays
        var special: Int = 100 * specialDays
    }

    val total = dayRates.standard + dayRates.festivityDays + dayRates.special
    println("total price : $$total")
}

object DoAuth {
    fun takeParams(username: String, password: String) {
        println("input Auth parameters = $username:$password")
    }
}

class BigBen {
     companion object Bonger {
         fun getBongs(times:Int) {
             for (i in 1 .. times) {
                 println("bong")
             }
         }
     }
}


fun main() {
    //
    val d1 = LuckDispatcher()
    val d2 = LuckDispatcher()
    d1.getNumber()
    d2.getNumber()
    // object expression
    rentPrice(10, 2, 1)

    // object declaration
    DoAuth.takeParams("foo" , "qwe")

    // companion objects
    BigBen.getBongs(12)
}