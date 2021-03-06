package com.ktest

fun main() {
    //集合 Set , List , Map
    val set = hashSetOf<Int>( 1 , 5 , 2 , 7 , 6 , 3 )
    val list = arrayListOf<Int>( 1 , 5 , 7 , 3 )
    val map = hashMapOf<Int,String>(1 to "One", 5 to "Five" , 7 to "Seven" , 3 to "Three")
    println(set)
    println(list)
    println(map)

    println(set.max())
    println(set.maxOrNull())

    val nums = hashSetOf<Int>(10,42,5,18)

    //nums 中 除3的最大值 = ?
    println(nums.maxByOrNull { n -> n % 3})

    //nums 中 除3的最小值 = ?
    println(nums.minByOrNull { it % 3})

    //set 中 n/2 的最大值
    println(set.maxByOrNull { n -> n / 2 })

    val set2 =hashSetOf<Int>( 1 , 5 , 2 , 9 , 6 , 3 )
    //set2 中的 偶數最大值
    //println(set2.filter{it % 2==0}.maxByOrNull())
    println(set2.filter{n -> n/2!=0 }.maxByOrNull { it /2 })

    // 動動腦 請問誰的名字最長 ?
    val names = hashSetOf<String>("Helen", "John", "Jackson", "Anita")
    println(names.maxByOrNull { it.length })
    // 使用 maxWithOrNull
    println(names.maxWithOrNull(compareBy { it.length }))
}