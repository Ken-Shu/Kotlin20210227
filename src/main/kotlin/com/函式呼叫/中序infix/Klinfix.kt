package com.函式呼叫.中序infix

class Salary(var income : Int){
    // 加入 infix 中序調用修飾子
    infix fun add(bonus : Int){
        income += bonus
    }

    fun addTen(){
        //this 一定要加入 不加 會錯誤
        this add 10
    }
}

fun main() {
    val salary = Salary(70000)
    println(salary.income)
    val bonus = 90000
    //salary.add(bonus)
    //若要使用中序呼叫 則在function 前加上 infix 即可使用
    //中序呼叫 : 目標物件 方法名稱 參數
    salary add bonus
    println(salary.income)
    salary.addTen()
    println(salary.income)
}