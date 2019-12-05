package example.b_control_flow

fun separator() = println("------------------------------------")

fun e1() {
    for (i in 0..3) {
        println(i)
    }
}

fun e2() {
    separator()
    for(i in 2..8 step 2) {
        println(i)
    }
}

fun e3(){
    separator()
    for(i in 3 downTo 0){
        println(i)
    }
}

fun main() {

    e1()
    e2()
    e3()

}