package example.e_collections

data class Person(val name: String, val city: String, val phone: String)

val peoples =
        listOf(
                Person("John", "Boston", "+1-888-123456"),
                Person("Sarah", "Munich", "+49-777-789123"),
                Person("Svyatoslav", "Saint-Petersburg", "+7-999-456789"),
                Person("Vasilisa", "Saint-Petersburg", "+7-999-123456"))

fun main() {
    val phoneBook = peoples.associateBy { it.phone }
//    val cityBook = peoples.associateBy { it.city }.forEach { (t, u) -> println(u) }
    val cityBook = peoples.associateBy(Person::phone, Person::city)
    phoneBook.forEach { (k,v) -> println("k:$k , v:$v") }
    println("---------------------")
    cityBook .forEach { (k,v) -> println("k:$k , v:$v")}
    println("---------------------")
    val peopleCities = peoples.groupBy(Person::city, Person::name).forEach{(k,v)-> println("k:$k , v:$v")}
}