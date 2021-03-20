package com.進階控制.內聯函式

/*
 *內聯函式 : inline / noinline
 */

fun test(){
    var x = 1
    hello()
    print(x)
}
inline fun hello(){ //inline(程式碼搬移) 內聯函式 將 inline 方法內的物件 一起丟進 呼叫的方法內
    var a = 1
    var b = 2
    var c = a+b
    println(c)
}
/*
*實際在編譯之後程式碼會長成:
* fun test(){
    var x = 1
    var a = 1
    var b = 2
    var c = a+b
    println(c)
    print(x)
}
 */
fun main() {
    test()
}