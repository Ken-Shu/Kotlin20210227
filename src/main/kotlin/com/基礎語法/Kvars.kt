package com.基礎語法

fun getPrice(): Int{
    return 100;
}

//在Kotlin 中 可否有class 也可跟檔名不同
class Kvars {
}
//宣告變數
fun main(args: Array<String>) {
    var x =10; // 可再指派變數 var
    x+=1       // 再指派仍必需 fallow 當初的型別
    x = 11
    println(x)
    val y = 20 // 不可再指派的變數 val
    println(y)

    //var or val 變數名稱 : 變數型態 = 初始值
    val pi : Double = 3.14 // val pi =3.14


    println(1/2) // 0
    println(0.1+0.1+0.1 == 0.3)

    // 如何印出資料
    //BMI 練習
    val h = 170.0;
    val w = 60.0;
    val bmi = w / Math.pow(h/100,2.0)
    println(bmi)
    println("bmi: %2f".format(bmi))
    println("bmi: ${bmi}")
    println("bmi: ${bmi*2}") //EL 語言 在大括號內可以運算
    var price = 100
    println("cost = ${price*0.4}")
    println("cost = ${getPrice()*0.4}")

    //簡單的轉型
    var a:Int = 10
    var b: Short = a.toShort()
    val a1:Int = 10
    val b1: Short = a1.toShort()
    println("$a $b")
    var e : Float = 1.23f
    var intMax = Int.MAX_VALUE // int 相當於Integer

    //動動腦
    var chinese : String = "100";
    var english  = "90";
    var math : String? = "80" // 加問號 代表 math 可能有null 的情況發生
    //math = null
    //請算出總分?
    //var sum = chinese.toInt()+english.toInt()
    //代表math 可能會有 null 的情況發生 !! 代表由程式自行處理
    var sum = chinese.toInt() +english.toInt() + math?.toIntOrNull()!!
    println("sum = ${sum}")

    //動動腦2
    val c : Int = "100".toInt()
    println(c)
    val d : Int? = "abc".toIntOrNull() ?: 0 //如果得到 null 就產生0的數字給 d 值
    println(d)
    val f : Int? = null?.toIntOrNull() ?: -1
    println(f)
}