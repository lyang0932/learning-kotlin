package example.g_delegation

class LazySample {
    init {
        println("created !")
    }

    val lazyStr: String by lazy {
        println("computed!")
        "my lazy"
    }

}

fun main() {
    val sample = LazySample()
    println("lazyStr = ${sample.lazyStr}") // 第一次 调用 get  传递给 lazy 的lambda 表达式 作为参数, 并保存结果
    println(" = ${sample.lazyStr}") // 再次 调用 get 返回保存的结果
}