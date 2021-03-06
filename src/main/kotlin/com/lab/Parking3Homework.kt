package com.lab

import java.text.SimpleDateFormat
import kotlin.math.log2
import java.util.Date
import kotlin.math.pow


var num2 = 8 // 目前車位
var p2 = 0 // 目前停車狀態

val sample: SimpleDateFormat = SimpleDateFormat("yyyy-MM-dd hh:mm:ss")
var parkPosition = arrayOfNulls<String>(num2)//停車位置
fun main() {

    while (true) {
        var StarDate: Date = Date()
        var MoneyStar: String = sample.format(StarDate)
        //要把每個取得的時間 包進每個停車位置內
        println("目前停車狀況${p2.toBinary(num2)}")
        println("請選擇您要的服務: 1 停車 2 移車 3 離開系統")
        var sever = readLine()!!.toInt()
        when (sever) {

            1 -> {
                print("請選擇車位停放位置(0~7): ")
                var n = readLine()!!.toInt()
                var n1 = n // 把輸入的位置 給n1 然後用 n 做二進制計算
                n = Math.pow(2.toDouble(), n.toDouble()).toInt()
                //n = 2.toDouble().pow(n).toInt()
                //停車進去
                val isPass: Boolean = (p2.and(n) == 0)
                if (isPass) {
                    println("停入 ${n1} 號 停放時間:${MoneyStar}")
                    //把 MoneyStar(進場時間) 丟進 parkPosition (停車位置 的陣列內)
                    parkPosition[n1] = MoneyStar
                    p2 += n
                    println("最近車位狀態: ${p2.toBinary(num)} , p=${p2}")
                    println("")
                } else {
                    n = log2(n.toDouble()).toInt()
                    println("${n}號 無法停車")
                }
            }
            2 -> {
                print("請選擇預移出車輛之位置(0~7): ")
                var n = readLine()!!.toInt()
                //先確認有沒有車
                var n1 = 2.toDouble().pow(n).toInt()
                val outcar: Boolean = (p2.and(n1) != 0)
                if (outcar) {
                    p2 -= n1
                    println("移出${n}號 車輛")
                    println("最近車位狀態: ${p2.toBinary(num2)}, p =${p2}")
                } else {
                    n1 = log2(n.toDouble()).toInt()
                    println("${n}號 沒有車輛")
                    continue
                }
                println("${n}號車位 停放時間${parkPosition[n]}")
                //移車出來 並算錢
                var endDate: Date = Date()
                var moneyEnd: String = sample.format(endDate)
                var paytime: Long = (sample.parse(moneyEnd).time - sample.parse(parkPosition[n]).time)
                var second: Long = paytime / 1000 % 60// 秒
                var minute: Long = paytime / 1000 / 60 % 60 //分
                var time: Long = paytime / 1000 / 60 / 60 % 24 //時
                var day: Long = paytime / 1000 / 60 / 60 / 24 //日
                var oneHourMoney: Int = 200
                println("取車時間:${moneyEnd}")
                println("車輛停放時間 ${day} 日 ${time} 時 ${minute} 分 ${second} 秒")

                if (paytime <= 360_0000) { //小於一小時
                    println("未滿一小時 停車費用$20 ")

                    if (paytime <= 360_0000) { //小於半小時
                        println("未滿一小時 停車費用$200 ")

                        println("")
                    } else {
                        println("一個小時${oneHourMoney}元 總計:${oneHourMoney * time}")
                        println("")
                    }
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