package example.e_collections


// 安全的访问 集合元素 ; 当下标越界的时候, 会使用默认值
fun main() {

    // list
    val list = listOf(0, 10, 20)
    println(list.getOrElse(1) { 12 })
    println(list.getOrElse(10) { 12 })

    // map
    val map = mutableMapOf<String,Int?>()


}