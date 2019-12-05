package example.e_collections

// 跟 Java 对比 这个是有点坑的 , 没有元素 并且没有指定默认值的时候 , 会抛错  NoSuchElementException
fun main() {
    val map = mapOf("key" to 42)
    val value1 = map["key"]// 返回42
    val value2 = map["key2"]// 返回null

    val value3: Int = map.getValue("key") // 返回42

    val mapWithDefault = map.withDefault { k -> k.length }

    val value4 = mapWithDefault.getValue("key2") // 返回4

    map.getValue("key2")


}