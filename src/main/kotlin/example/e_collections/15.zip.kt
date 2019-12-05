package example.e_collections


//zip 会将两个 集合 合并到一个集合里 , 默认情况下 , 同一下标 有一个 Pair 元素 , 也可以自己定义 合并成什么样的元素
// Collection<Pair>
fun main() {

    val list1 = listOf("a", "b", "c")
    val list2 = listOf(1, 2, 3, 4, 5, 6)

    val resultPairs = list1 zip list2

    val resultReduce = list1.zip(list2) { a, b -> "$a$b" }

    resultPairs.forEach { println("first:${it.first} second:${it.second}") }
    println("---------------")
    resultReduce.forEach { println(it) }
}