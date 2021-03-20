package com.類別與物件.巢狀語內部類別

/*
 *巢狀類別
 * Java : static class A (位於某個類別內的定義)
 * Kotlin : class A (位於某個類別內的定義)
 *
 * 內部類別 :
 * Java class B (位於某個類別內的定義)
 * Kotlin : inner class B (位於某個類別內的定義)
 */


class Outer { //一般類別 / 外部類別
    companion object{ //類別成員宣告區 相當於 java 的 static{...}
        val sx = 200 //類別成員變數
    }

    val x = 100 // 物件成員變數

    class A { //巢狀類別
        fun println() {
            println("A ${this}")
            println("A -> Outer'sx ${Outer.sx}") //同為類別物件 (Outer可不寫)
        }
    }

    inner class B { //內部類別
        fun println() {
            println("B ${this}")
            println("B->Outer'x${this@Outer.x}") //由內部類別 呼叫 外部類別的物件
        }
    }
}

fun main() {
    val a = Outer.A() //呼叫巢狀類別
    a.println()
    val b = Outer().B() //呼叫內部類別
    b.println()
}

