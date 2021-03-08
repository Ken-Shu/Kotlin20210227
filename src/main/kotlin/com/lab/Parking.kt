package com.lab

import kotlin.math.log2
import kotlin.math.pow

//自訂函式
fun Int.toBinary(len: Int): String {
    //this = 上放的 Int = p =8
    //replace 把 " " 置換成 0
    return String.format("%"+ len + "s", this.toString(2)).replace(" ", "0")
}

var num = 8 //目前車位
var p = 18 //停車狀態
fun main() {
    while (true) {
        println("目前停車狀態:${p.toBinary(num)}")
        print("請選擇車位停車(0~7):")
        var n = readLine()!!.toInt();
        // n =  Math.pow(2.toDouble(),n.toDouble()).toInt()
        n = 2.toDouble().pow(n).toInt()
        val isPass: Boolean = (p.and(n) == 0) // p & n 位元運算
        if (isPass) {
            p += n
            println("最近車位狀態 :${p.toBinary(num)} , p=${p}")
        } else {
            //log2 表示 n.toDouble 是 2的 幾次方
                // 假設 log2(4) 答案出來就是2 因為 4 是2的2次方 可以用於二進制運算
            n = log2(n.toDouble()).toInt()
            //n = (Math.log(n.toDouble())/Math.log(2.0)).toInt()
            println("${n}無法停車")
        }

    }
}