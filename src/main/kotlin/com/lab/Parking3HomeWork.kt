package com.lab


import java.text.SimpleDateFormat
import kotlin.math.log2
import java.util.Date

var Endtime: SimpleDateFormat = SimpleDateFormat("yyyy-MM-dd hh:mm:ss")
var Startime: SimpleDateFormat = SimpleDateFormat("yyyy-MM-dd hh:mm:ss")
fun Int.toPayMoneyStar(): String {
    var Star: String = Startime.format(Date())
    return Star
}

fun Int.toPayMoneyEnd(): String {
    var End: String = Endtime.format(Date())
    return End
}

fun Int.PayMoney(d11: String, d22: String): Long {
    var d1: Date = Startime.parse(d11)
    var d2: Date = Endtime.parse(d22)
    val day: Long =
        if ((d1.getTime() - d2.getTime()) / (24 * 60 * 60 * 1000) > 0) (d1.getTime() - d2.getTime()) / (24 * 60 * 60 * 1000) else (d2.getTime() - d1.getTime()) / (24 * 60 * 60 * 1000)
    return day
}

fun main() {

    while (true) {
        println("目前停車狀況${p.toBinary(num)}")
        var MoneyStar: String = p.toPayMoneyStar()
        var MoneyEnd: String = p.toPayMoneyEnd()
        println("請選擇您要的服務: 1 停車 2 移車 3 離開系統")
        var sever = readLine()!!.toInt()
        when (sever) {

            1 -> {
                print("請選擇車位停放位置(0~7): ")
                var n = readLine()!!.toInt()

                println("停放時間:${MoneyStar}")
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
                print("請選擇預移出車輛之位置(0~7): ")
                var n = readLine()!!.toInt()

                println("取車時間:${MoneyEnd}")
                println("車輛停放時間${p.PayMoney(MoneyStar, MoneyEnd)}")
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
