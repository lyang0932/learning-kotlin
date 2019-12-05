package example.h_coroutines

import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

fun main() {

    GlobalScope.launch {
        delay(1000L)
        println(" world")
    }

    print("hello,")
    Thread.sleep(2000L)
}