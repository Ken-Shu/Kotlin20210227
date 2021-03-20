package com.類別與物件.列舉與印章

enum class Coin(val value : Int){
    PENNY(1),
    NICKLE(5),
    DIME(10),
    QUARTER(25)
}

fun main() {
    val coin = Coin.NICKLE
    print(coin.value)
}