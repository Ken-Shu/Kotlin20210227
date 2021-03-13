package com.函式呼叫.繼承函式

//在 Kotlin 內 類別變數 不可以繼承
//除非在 class 前面加上 open

open class View {
    open fun clich()= println("View clicked")
    // 若此成員函式與繼承函式有相同的方法簽章 則該成員函式優先執行
    fun show() = println("空白")
}

class Button : View(){
    override fun clich()= println("Button clicked")
}
//繼承函式是靜態的(static)
//所以 繼承函式 是沒有覆寫的機制
fun View.show()=println("View") //屬於 View 的 show 方法
fun Button.show() = println("Button") //屬於 Button 的 show 方法

fun main() {
    val view : View = Button()
    view.clich()
    view.show() // 可以知道我按的元件是哪個型別
}