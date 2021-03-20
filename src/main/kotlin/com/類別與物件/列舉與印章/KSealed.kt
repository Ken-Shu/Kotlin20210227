package com.類別與物件.列舉與印章

/*
 *enum 在意的是數據資料
 * sealed(印章/密封) 在意的是類型
 */

sealed class Employee{ // sealed(印章) 表示只有 Developer() 和 Manager() 來建立
    abstract fun job()
    class Developer():Employee(){
        override fun job() {
            println("寫程式")
        }
    }
    class Manager():Employee(){
        override fun job() {
            println("管人事")
        }
    }
}
//Employee 類 透過 sealed 告知 Employee 物件的建立只能透過Developer() 和 Manager() 來建立
fun main() {
    val emp1 =Employee.Developer()
    emp1.job()
    val emp2 =Employee.Manager()
    emp2.job()
}
