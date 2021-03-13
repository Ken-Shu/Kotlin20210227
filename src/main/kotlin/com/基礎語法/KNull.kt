package com.基礎語法

class KNull {
}

fun main(args: Array<String>) {
    val chinese : Int? = 100
    val english : Int? = 90
    val math : Int? = 80
    //若沒考則放入 null 計算總分的時候以0分計算
    //請計算總分 = ?
    var sum =(chinese ?: 0)+(english ?: 0)+(math ?: 0)
    println(sum)
    //如果沒有 chinese 就不加上 english 會得到 0
    var sum2 = chinese?.plus(english ?: 0) ?: 0
    println(sum2)
}