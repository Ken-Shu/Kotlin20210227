package com.lab

import java.util.*
import kotlin.collections.LinkedHashSet

private var ans:String =""

fun main() {
    var r: Random = Random()
    var nums : LinkedHashSet<String> = LinkedHashSet()
    var num_size = 4
    var count = 0
    while (nums.size<num_size){
        var r_num = r.nextInt(9)
        var n = r_num
        nums.add(n.toString())
        count++
    }

    ans += nums.toString()
    var one = ans[1]
    var two = ans[4]
    var three = ans[7]
    var four = ans[10]
    print(ans)
    print(one)
    print(two)
    print(three)
    print(four)
    //val nums = "5842"


}