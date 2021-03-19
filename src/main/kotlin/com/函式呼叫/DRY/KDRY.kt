package com.函式呼叫.DRY

//DRY (Don't Repeat Youself)
//減少重複的程式碼

//data class 裡面同時有 getter and setter
data class User(val id : Int ,val name : String , val address : String)

//撰寫一個可以驗證 User 的繼承函式
fun User.validateBerofeSave(){
    //println("${id},${name},${address}")
    //驗證
   fun valid (value : String , fieldName : String){
        //isEmpty 判斷是否為空值
       if (value.isEmpty()){
           throw Exception("Can't save user $id empty $fieldName")
       }
   }
    valid(name , "Name")
    valid(address , "address")
}

fun saveUser(user :User){
    println("Save $user")
}

fun main() {
    val user = User(1,"Mary","Taoyuan")
    //驗證 是否每個欄位都有資料 ?
    user.validateBerofeSave()
    saveUser(user)
    val user2 = User(0,"Ken","Tapia")
    user2.validateBerofeSave()
    saveUser(user2)

}