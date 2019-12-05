package example.a_introduction

fun printAll(vararg messages: String) {
    for (m in messages) println(m)
}

fun printAllWithPrefix(vararg messages: String, prefix: String) {
    for (m in messages) println("$prefix-$m")
}

fun log(vararg entries: String) {
    printAll(*entries)
}

fun main() {
    printAll("hello", "hallo", "salut", "hola", "你好")
    printAllWithPrefix("hello", "hallo", "salut", "hola", "你好", prefix = "greeting")
    log(* arrayOf("hello", "hallo", "salut", "hola", "你好"))//展开运算符
}