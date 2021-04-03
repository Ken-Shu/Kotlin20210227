package com.類別與物件.巢狀語內部類別

class Outer2 {
    companion object {
        val x = 10000
        val s = "Hello Kotlin for Lambda"
        val yearFunction3: () -> String = { // lambda expression
            val year = 2020
            "it's $year "

        }

    }

    val s: () -> String = { "Hi Ken" }

    class A1 {
        fun println() {
            println("我有${Outer2.x}元")

            println(s)
        }
    }

    inner class B1 {
        fun println() {
            println(s())
        }
    }


}
//lambda 出來為方法 所以在print內 後方要加上()
fun main() {
    val a1 = Outer2.A1()
    a1.println()
    val b1 = Outer2().B1()
    b1.println()
    val y = "Hello Java"
    println(y)
    val pri : () -> String = { "HI" }
    println(pri())
    println(Outer2.yearFunction3())
    var prin : () -> Int = {500}
    println(prin()+50)
}