
//Java code 的調用請參考 com.jtest.CallTopFun.java
@file:JvmName("Calc") //java 可以透過此類別名稱調用

package com.topfun

var count = 0 // 頂層屬性

@JvmName("myAdd") // java 可以透過此方法名稱調用
fun add (x : Int , y : Int): Int{ //頂層函式
    ++count
    return x+y
}