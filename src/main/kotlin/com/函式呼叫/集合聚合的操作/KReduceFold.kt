package com.函式呼叫.集合聚合的操作

import com.lab.num

//數據歸納
fun main() {
    val numbers = listOf(5,2,10,4)
    //Fold 與 reduce
    /*
    * 對於更特定的情況，有函數reduce()和fold()，它們依次將所提供的操作應用於集合元素並返回累積的結果。
    * 操作有兩個參數：先前的累積值和集合元素。
    * 這兩個函數的區別在於：fold()接受一個初始值並將其用作第一步的累積值，
    * 而reduce()的第一步則將第一個和第二個元素作為第一步的操作參數。
    * */
    //歸納
    //前一次的總和(sum) 和 這一次的元素(element) 兩個相加 變成 這一次的總和(新的sum)
    val sum = numbers.reduce{sum , element -> sum + element}
    println(sum)  //21
    //拆解
    numbers.reduce{sum , element ->
        println("sum: ${sum},element: ${element}")
        sum + element
    }
    // 每個元素 *2 加總
    //如這樣寫 會變成37 因為第一位的5先進去 無法*2
    val sum2 = numbers.reduce{sum , element -> sum + element *2}
    println(sum2)
    //fold(initial:初始值)
    var sum3 = numbers.fold(0 ){
            sum,element -> println("sum: ${sum},element: ${element*2}")
     sum+ element*2
    }
}
