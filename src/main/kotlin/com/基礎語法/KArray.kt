package com.基礎語法

import kotlin.random.Random as r

fun main() {
    //數組陣列
    val num1 = arrayOf(1,5,7,3) // 隱含式
    val num2 = arrayOf<Int>(1,5,7,3)  //顯示
    //for
    for ( i in 0..num1.size-1){
        println(num1[i])
    }
    println(num1.indices)

    //indices = index
    //另一種寫法 (i in 0..3)
    for ( i in num1.indices){ //0..3
        println(num1[i])
    }
    //lambda 創建
    //val num3 = Array(5),{ i -> i * 1 }
    val num3 = Array(5,{ i -> i * 1 })
    for (i in num3.indices){
        println("num3: "+num3[i])
    }
    //四星彩 電腦選號 (0~9)
    //Lambda 語法 i 如果再 -> 後方沒有使用 則可以使用 _ 代替掉
    val num4 = Array(4){ _ -> r.nextInt(10) }
    println(num4.contentToString()) // Arrays.toString(num4)

    // setter getter
    var n1 = num4.get(1) //num4[1]
    println(n1)
    num4.set(1,9) // num4 [1] =9
    println(num4.contentToString())

    // Lambda -> forEach(印出元素內容)
    num4.forEach { n -> print(n) }
}