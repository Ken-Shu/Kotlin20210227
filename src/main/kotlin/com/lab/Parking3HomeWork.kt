package com.lab


import java.text.SimpleDateFormat
import kotlin.math.log2
import java.util.Date





//fun Int.toPayMoneyStar(): String {
//    var StarDate : Date = Date()
//    var Star: String = simple.format(StarDate)
//    return Star
//}
//
//fun Int.toPayMoneyEnd(): String {
//    var EndDate : Date = Date()
//    var End: String = simple.format(EndDate)
//    return End
//}
//
//fun Int.PayMoney(d1: String, d2: String): Long {
//    var diff : Long= simple.parse(d1).time - simple.parse(d2).time
//
//    return diff
//}

val simple: SimpleDateFormat = SimpleDateFormat("yyyy-MM-dd hh:mm:ss")

fun main() {
    var StarDate : Date = Date()
    var MoneyStar: String = simple.format(StarDate)
    while (true) {
        val FixedStarTime : String = MoneyStar //固定停車時間
        println("目前停車狀況${p.toBinary(num)}")
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
                var EndDate : Date = Date()
                var MoneyEnd: String = simple.format(EndDate)
                var PayTime : Long = (simple.parse(MoneyEnd).time - simple.parse(MoneyStar).time)
                var second : Long = PayTime/1000 // 秒
                var minute : Long = PayTime/1000/60 //分
                var time : Long = PayTime/1000/60/60 //時
                var day : Long = PayTime/1000/60/60/24 //日
                var oneHourMoney : Int = 200
                print("請選擇預移出車輛之位置(0~7): ")
                var n = readLine()!!.toInt()
                println("取車時間:${MoneyEnd}")
                println("車輛停放時間 ${day} 日 ${time} 時 ${minute} 分 ${second} 秒")
                if (PayTime <=360_0000 ){ //小於半小時
                    println("未滿一小時 停車費用$20 ")
                }else {println("一個小時${oneHourMoney}元 總計:${oneHourMoney*time}")}
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
                return
            }
            else -> println("輸入錯誤 請重新輸入: ")
        }

    }
}
