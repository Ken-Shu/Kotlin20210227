package com.進階控制.檔案存取

import java.io.File

//讀取檔案資料
fun read(){
    //bufered 一次讀一行
    File("data.txt").bufferedReader().lines().forEach{println(it)}
}

//寫入資料
fun write(data : String ){
    File("data.txt").appendText("${data}\n")
}

//寫入資料 writeText (取代原檔案內容) 注意:之前的檔案內容會被全取代掉
fun replace(data : String ){
    File("data.txt").writeText("${data}\n")
}

//批次寫入
fun batchWrite(){
    //bufferedWriter (批次寫入) .use
    File("data.txt").bufferedWriter().use {
        it.write("Java")
        it.newLine() //換行
        it.write("Python")
        it.newLine()
        it.write("C#")
        it.newLine()
        it.write("VB")
    }
}
fun main() {
//    read()
//    write("VB")
//    read()
//    replace("Cobol")
//    read()
    batchWrite()
    read()
}