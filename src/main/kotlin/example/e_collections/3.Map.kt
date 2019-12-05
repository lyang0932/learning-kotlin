package example.e_collections

const val POINTS_X_PASS : Int = 15

val EZPassAccounts : MutableMap<Int , Int> = mutableMapOf(1 to 100 , 2 to 100 , 3 to 100)

val EZPassReport :Map<Int,Int> = EZPassAccounts

fun updatePointsCredit(accountId:Int) {
    if (EZPassAccounts.containsKey(accountId)) {
        println("updating $accountId")
        EZPassAccounts[accountId] = EZPassAccounts.getValue(accountId) + POINTS_X_PASS
    } else {
        println("error : Trying to update a non-existing account (id: $accountId)")
    }
}

fun accountsReport(){
    println("EZ-Pass report:")
    EZPassAccounts.forEach { (k, v) ->
        println("ID : $k  : credit $v")
    }
}

fun main() {
    accountsReport()
    updatePointsCredit(1)
    updatePointsCredit(1)
    updatePointsCredit(5)
    accountsReport()
}