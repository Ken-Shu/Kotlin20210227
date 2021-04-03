package com.lab

import java.util.*
import kotlin.collections.LinkedHashSet

fun main() {
    var set:LinkedHashSet<String> = LinkedHashSet()
    var num =5
    var range = 10
    var r : Random =Random()

    var count = 0
    while (count < num){
        var p =r.nextInt(9)
        val tmp = p
        set.add(tmp.toString())
        print(set)
        count++
    }

}