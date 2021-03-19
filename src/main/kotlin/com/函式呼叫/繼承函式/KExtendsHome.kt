package com.函式呼叫.繼承函式

open class home{
    open fun father() {
        var x: Int = 50
        println("爸爸${x}歲")
    }
}
class sun : home(){
    override fun father(){
        var x : Int = 18
        println("兒子${x}歲")
    }
}

fun main() {
    val home : home = sun()
    home.father()

}