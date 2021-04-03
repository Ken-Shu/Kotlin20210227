package com.進階控制.合作例行Coroutines

import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

fun case3(){
    val startTime = System.currentTimeMillis()

    repeat(50000){
    Thread{

    }.start()
}
val endTime = System.currentTimeMillis()
print("case : ${endTime - startTime} ms")
}
fun  case4(){
    runBlocking {
        val startTime = System.currentTimeMillis()
        val job = launch {
            repeat(50000){
                launch {

                }
            }
        }
        job.invokeOnCompletion {
            val endTime = System.currentTimeMillis()
            println("case2 ${endTime - startTime} ms")
        }
    }
}

fun main() {
    case3()
    case4()
}