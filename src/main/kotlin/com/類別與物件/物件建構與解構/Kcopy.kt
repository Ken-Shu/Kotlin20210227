package com.類別與物件.物件建構與解構

class Num (var value : Int){
    fun copy() = Num(value)
}

fun main() {
    val x = Num(10)
    val y = x.copy()
    println(x.value)
    println(y.value)
    x.value=100
    println(x.value)
    println(y.value)
}