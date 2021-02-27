package com.ktest

import java.util.*
import kotlin.random.Random as r

class KFlowControl {
}
//也可以寫成fum getLevel(score : Int) : String(回傳一個 String) = when(score)
fun getLevel(score: Int) = when(score){
    in 90..100 ->"A"
        in 80..89 -> "B"
        in 70..79 -> "C"
        in 60..69 -> "D"
        else -> "E"
}

// if ,when ,for , while , do while
fun main(args: Array<String>) {

    //if
    var score = r.nextInt(101)
    val pass = if (score >= 60) "Pass" else "Fail"
    println("$score $pass")

    //when
    // 100~90 "A" , 89~80 "B" , 79~70 "C" , 69~60 " D " ,59~0"E"
    when (score) {
        in 90..100 -> println("A")
        in 80..89 -> println("B")
        in 70..79 -> println("C")
        in 60..69 -> println("D")
        else -> println("E")
    }
    var level = when (score / 10) {
//        in 90..100 ->"A"
//        in 80..89 -> "B"
//        in 70..79 -> "C"
//        in 60..69 -> "D"
//        else -> "E"
        10, 9 -> "A"
        8 -> "B"
        7 -> "C"
        6 -> "D"
        else -> "E"
    }
    println(level)

    println(getLevel(score))

    //for 迴圈  ..(區間的意思)
    for (i in 1..10) {
        print("$i ")
    }
    println()
//step 每次跳圈 +2 變成 1 3 5 7 9
    for (i in 1..10 step 2) {
        print("$i ")
    }
    println()
//印出 10 到 1
    for (i in 10 downTo 1) {
        print("$i ")
    }
    println()
//印出 1 到 9 (until)不包含10
    for (i in 1 until 10) {
        print("$i ")
    }
    println()

    //動動腦
    //有一個 1~10 的亂數 ans , 給使用者來猜 , 猜對Bingo 有五次機會
    //加入請猜小一點 或大一點的提示
    val ans = r.nextInt(10) + 1
    val max = 5
    for (i in 1..max) {
        print("第 ${i}/${max}次 : 請輸入數字:")
        //var guess = Scanner(System.`in`).nextInt()
        //Kotlin 語法的 Scanner 要加!! 是因為 很有可能輸入的是空值
        // !! 由系統自己去解決問題
        var guess = readLine()!!.toInt()
        if (guess > ans) {
            println("請猜小一點")
        } else if (guess < ans) {
            println("請猜大一點")
        } else if (guess == ans) {
            println("Bingo")
            break
        }
    }
}