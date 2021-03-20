package com.進階控制.內聯函式

val sum : (Int , Int ) -> Int = {x,y -> x+y}
val action : () -> Unit = { println("Kotlin")} // Unit 相當於 void

//內聯函式多用在高階函式中
// 高階函式 : 將函式作用於參數 或是 返回值的函式
//lambda會建立內部類別 同為內部類別 所以這樣會產生很多 Object 所以加上 inline
//會把 sum的函式 丟進去下方 cal 內 可以降低物件產生 並增加效能
inline fun doCal(a: Int , b:Int , cal : (a :Int , b : Int) -> Int) : Int{
    return cal ( a, b)
}

fun main() {
    val value = doCal(10,20 , sum) //將 sum(lambda) 丟進去 doCal 內的 cal運算式
    println(value)
    action()
}