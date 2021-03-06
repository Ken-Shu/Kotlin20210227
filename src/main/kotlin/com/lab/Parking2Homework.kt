package com.lab

import kotlin.math.log2


fun main() {
    while (true) {
        println("目前停車狀況${p.toBinary(num)}")
        println("請選擇您要的服務: 1 停車 2 移車 3 離開系統")
        var sever = readLine()!!.toInt()
        when (sever) {
            1 -> {
                print("請選擇車位停放位置(0~7): ")
                var n = readLine()!!.toInt()
                n = Math.pow(2.toDouble(), n.toDouble()).toInt()
                //n = 2.toDouble().pow(n).toInt()
                //停車進去
                val isPass: Boolean = (p.and(n) == 0)
                if (isPass) {
                    p += n
                    println("最近車位狀態: ${p.toBinary(num)} , p=${p}")
                } else {
                    n = log2(n.toDouble()).toInt()
                    println("${n}無法停車")
                }
            }
            2 -> {
                //移車出來
                print("請選擇預移出車輛之位置(0~7)")
                var n = readLine()!!.toInt()
                val outcar: Boolean = (p.and(n) != 0)
                if (outcar) {
                    p -= n
                    println("最近車位狀態: ${p.toBinary(num)}, p =${p}")
                } else {
                    n = log2(n.toDouble()).toInt()
                    println("${n}沒有車輛")
                }
            }
            3 -> {
                println("系統離開")
                break
            }
            else -> println("輸入錯誤 請重新輸入: ")
        }
    }
}