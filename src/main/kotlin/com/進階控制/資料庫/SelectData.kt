package com.進階控制.資料庫

import java.sql.DriverManager
/*
* 先在 Setting(Preferences) > plugins > 搜尋 Database Navigator 並安裝
*
* Gradle 設定
* https://mvnrepository.com/artifact/org.xerial/sqlite-jdbc/3.34.0
*
* 下載 sqlite for your os
* https://www.sqlite.org/download.html
* for Windows
* sqlite-tools-win32-x86-3350200.zip
* 解壓縮檔案後 改名成 sqlite 並直接放在 c:\
* 解壓縮(裡面有三個檔案)並複製到 c:\sqlite
*
* sqlite sql 指令教學
* http://tw.gitbook.net/sqlite/sqlite_using_autoincrement.html
*
* 啟動命令題是字元(cmd)
* cd c:\sqlite
* sqlite3 mydb.db
* create table user(id integer primary key autoincrement, name text, age integer);
* insert into user(name , age) values('vincent', 18);
* insert into user(name , age) values('anita', 19);
* .exit
*
* 把 mydb.db 複製到專案路徑下
* */

fun main() {
    //jdbc(java database) sqlite目錄內的 mydb檔
    val url = "jdbc:sqlite:mydb.db"
    val conn = DriverManager.getConnection(url)
    val stmt = conn.createStatement()
    val sql = "select id , name , age from user"
    val rs = stmt.executeQuery(sql)
    while (rs.next()){
        println("${rs.getInt("id")}\t${rs.getString("name")}\t ${rs.getInt("age")}")
    }
    rs.close()
    stmt.close()
    conn.close()
}