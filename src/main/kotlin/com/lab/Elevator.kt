package com.lab

import java.lang.Exception
import java.util.*


//實作一個電梯程式
//B1 Lobby 1,2,3,4,5,6,7,空中花園
//-1,0,1,2,3,4,5,6,7,8
fun main(args: Array<String>) {
    //電梯位置
    var ePos = 0
    do {
        print("電梯在${ePos}樓 ， 請輸入樓層(B1-8):")

        //將 try 作為一個表達示
        //表示所輸入的不是數值
        //kotlin try表達示 java 沒有
        var floor = try {
            readLine()!!.toInt()
        } catch (e: java.lang.Exception) {
            //若使用者輸入 B1 則回傳 -1
            if (e.message!!.contains("B1")) {
                -1
            } else {
                -999
            }
        }

        println("floor: ${floor}")

        //if(floor > 8 || floor < -1)continue
        //處理樓層範圍錯誤
        try {
            floor = if (floor in -1..8) floor else throw Exception("樓層錯誤")
        } catch (e: java.lang.Exception) {
            println(e.message)
            continue
        }
        if (floor > ePos) {
            println("電梯上樓")
            for (i in ePos..floor) {
                Thread.sleep(1000)
                println(i)
            }
        } else if (floor < ePos) {
            println("電梯下樓")
            for (i in ePos downTo floor) {
                for (i in ePos..floor) {
                    Thread.sleep(1000)
                    println(i)
                }
            }
            ePos = floor
        }
        //電梯到達指定樓層
    } while (true)

}