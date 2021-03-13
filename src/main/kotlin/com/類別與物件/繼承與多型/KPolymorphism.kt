package com.類別與物件.繼承與多型

abstract class Human(val name : String ){
    abstract fun eat()
}
//若同為name 則 val 可以不用寫
class Man ( name : String ) :Human(name){
    override fun eat(){
        println("$name 大口吃飯")
    }
}

class Woman ( name : String ) :Human(name){
    override fun eat(){
        println("$name 小口吃飯")
    }
}

fun main() {
    val m = Man("男人")
    val f = Woman("女人")
    val list = listOf<Human>(m,f)
    list.forEach{it.eat()}
}