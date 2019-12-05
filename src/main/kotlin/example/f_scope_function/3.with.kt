package example.f_scope_function

// with 是一个非扩展函数，可以简洁地访问其参数的成员：在引用其成员时可以省略实例名称

data class Address(val host:String , val port:Int)

fun main() {
    val address = Address("127.0.0.1" , 80)
    with(address) {
        println("$host:$port")
    }

}