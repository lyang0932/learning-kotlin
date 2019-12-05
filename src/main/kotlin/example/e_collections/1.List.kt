package example.e_collections

// List : read-only
// MutableList : mutable

var systemUsers: MutableList<Int> = mutableListOf(1, 2, 3)
val sudoers: List<Int> = systemUsers

fun addSudoer(newUser: Int) {
    systemUsers.add(newUser)
}

fun getSysSudoers(): List<Int> {
    return sudoers
}

fun main() {
    addSudoer(4)
    println(" sudoers : ${getSysSudoers().size}")
    getSysSudoers().forEach {
        println("some useful info on user $it")
    }
}