package com.ktest

import com.jtest.JHello

class KHello {
    fun callMe() {
        print("pc@school.com")
    }
}
//Kotlin 也可以不用寫class

fun main(args: Array<String>) {
    println("Hello Kotlin")
    //呼叫 JHello 的 callMe
    val j = JHello()
    j.callMe()
    val k = KHello()
        k.callMe()
}