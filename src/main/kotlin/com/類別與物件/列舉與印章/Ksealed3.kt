package com.類別與物件.列舉與印章

sealed class Operation{
    class Add(val x : Int , val y : Int) : Operation()
    class Sub(val x : Int , val y : Int) : Operation()
}

fun exec(op : Operation) = when(op){
    is Operation.Add -> op.x + op.y
    is Operation.Sub -> op.x - op.y
}
//私自建立 Mull
//class Mul (val x : Int, val y : Int) :Operation()

fun main() {
    val add = Operation.Add(20,10)
    val sub = Operation.Sub(20,10)
    println(exec((add)))
    println(exec((sub)))

//    val mul = Mul(20,10)
//    print(exec(mul))
}