package com.函式呼叫.集合聚合的操作

fun main() {
    var numbers = listOf<Int>(5,42,10,4)
    println("Count: ${numbers.count()}")
    println("Sum :${numbers.sum()}")
    println("Avg :${numbers.average()}")
    println("Max :${numbers.max()}")
    println("Min :${numbers.min()}")
    println("Max :${numbers.maxByOrNull {it}}")
    println("Min :${numbers.minByOrNull {it}}")

    //numbers 中 %3 的最小值 利用 minBy
    println("%3 min${numbers.minByOrNull { it-> it%3 }}")

    val strings = listOf("one" , "two" , "three", "four")
    //利用 maxWith() compare比較{it.length} 這個字串
    val longestString = strings.maxWithOrNull(compareBy{it.length})
        println("longest string = ${longestString}")


}