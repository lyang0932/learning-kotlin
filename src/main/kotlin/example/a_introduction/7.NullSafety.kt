package example.a_introduction


fun strLength(notNull: String): Int {
    return notNull.length
}

fun describeString(maybeString: String?): String {
    return if (maybeString.isNullOrBlank()) {
        "empty or null String"
    } else {
        "string of length ${maybeString.length}"
    }
}


fun main() {
    var neverNull: String = "This can't be null"
//    neverNull = null; // compilation error
    var nullable: String? = "You can keep a null here"
    nullable = null;
    println(nullable)

    var inferredNonNull = "the compiler assumes non-null"
//    inferredNonNull = null

    println(strLength(neverNull))
//    println(strLength(nullable))

    println(describeString(neverNull))
    println(describeString(nullable))
}