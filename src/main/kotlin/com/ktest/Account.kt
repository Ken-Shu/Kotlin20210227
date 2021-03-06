package com.ktest


//若下方println(act)內要顯示的話
//則可在方法前加上data 但是僅限制於 後方有物件時 ex:(val name:String)
data class Account(val name : String )  {
    var balance : Int = 0
        //field 指的就是 自己 balance
    get() = field
//    set(value) = if(value >= 0) field =value else field = field
    set(value){
        if(value >=0){
            field = value
        }
    }
}

fun main() {
    val act = Account("John")
    println(act.balance)
    act.balance = 100
    println(act.balance)
    println(act)
}