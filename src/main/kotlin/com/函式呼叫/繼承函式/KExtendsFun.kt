package com.函式呼叫.繼承函式

import com.函式呼叫.繼承函式.endChar as end

//繼承函式
fun String.endChar():Char{
    //return this.get(this.length-1)
    return get(length-1)
}

fun main() {
    val s = "abc"
    println(s.javaClass)
    //想要得到最後一個字
    println(s.end())
}
