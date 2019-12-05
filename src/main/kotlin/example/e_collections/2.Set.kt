package example.e_collections

val openIssues: MutableSet<String> = mutableSetOf("uniqueDescr1", "uniqueDescr2", "uniqueDescr3")

fun addIssue(uniqueDesc: String): Boolean {
    return openIssues.add(uniqueDesc)
}

fun getStatusLog(isAdded:Boolean):String {
    return if (isAdded) "registered correctly." else "marked as duplicate and rejected"
}

fun main() {
    val newIssue : String = "uniqueDescr4"
    val anIssueAlreadyIn : String = "uniqueDescr2"
    println("Issue $newIssue : ${getStatusLog(addIssue(newIssue))}")
    println("Issue $anIssueAlreadyIn ${getStatusLog(addIssue(anIssueAlreadyIn))}")
}