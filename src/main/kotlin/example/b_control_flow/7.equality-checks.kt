package example.b_control_flow

fun main() {

    val authors = setOf("Shakespeare", "Hemingway", "Twain")
    val authors2 = setOf("Shakespeare", "Hemingway", "Twain" , "")
    val writers = setOf("Twain", "Shakespeare", "Hemingway")

    println(authors == writers) // 结构对比
    println(authors == authors2) // 结构对比
    println(authors === writers) // 引用对比

}