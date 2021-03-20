package com.基礎語法

//錢包
data class Wallet(val name:String, var money:Int) {
    //如何檢查傳進來的參數是否正確?
    /*
    init執行的優先等級設計為與屬性同級
    就是為了讓一個類別在初始化時，不僅能宣告屬性，同時賦予它可以進行運算的能力。
     */
    init {
        //case 1
        money = if(money>0)money else 0
        //case 2
        //require 檢驗函式 失敗會拋出例外
        money = try {
           require(money >=0)
            money
        }catch (e:Exception){
            0
        }
    }
}




fun main(args: Array<String>) {
    val w1 = Wallet("John",100)
    println(w1)
    val w2 = Wallet("Mary",-100)
    println(w2)
}