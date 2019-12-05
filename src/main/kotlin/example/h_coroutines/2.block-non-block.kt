package example.h_coroutines

import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking
//1.
//fun main() = runBlocking<Unit> {
//    GlobalScope.launch {
//        delay(1000L)
//        println("world!")
//    }
//    print("Hello,")
//    runBlocking {
//        delay(2000L)
//    }
//}


//2.
//suspend fun main() {
//    val job = GlobalScope.launch {
//        delay(1000L)
//        println("world")
//    }
//    print("Hello,")
//    job.join()
//}
//3.
fun main() = runBlocking {
    launch {
        delay(1000L)
        println("World!")
    }
    print("Hello , ")
}

