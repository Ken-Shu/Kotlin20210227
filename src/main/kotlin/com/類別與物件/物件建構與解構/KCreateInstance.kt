package com.類別與物件.物件建構與解構

data class User(val name :String , val age :Int)

fun main() {
    //物件建構
    val user = User("Jane",18)
    println(user)
    //物件解構
    val (name, age) = user
    println("$name, $age")
}