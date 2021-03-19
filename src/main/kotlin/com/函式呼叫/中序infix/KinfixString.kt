package com.函式呼叫.中序infix

class Input(var income : String){

    infix fun add (put : String ){
         income += put
    }
    fun addTen(){
    this add "JAVA"
    }

}

fun main() {
    var input = Input("Hi")
    println(input.income)
    val kotlin = "Kotlin"
    input add kotlin
    input.addTen()
    println(input.income)
}