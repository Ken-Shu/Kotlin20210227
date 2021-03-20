package com.進階控制.網路資源存取

import org.json.JSONObject
import java.net.URL

val jsonPath ="https://data.tycg.gov.tw/api/v1/rest/datastore/0daad6e6-0632-44f5-bd25-5e1de1e9146f?format=json&limit=200"


//大圓距離
fun distance(
    long1: Double, lat1: Double, long2: Double,
    lat2: Double
): Double {
    var lat1 = lat1
    var lat2 = lat2
    val a: Double
    val b: Double
    val R: Double
    R = 6378137.0 // 地球半径
    lat1 = lat1 * Math.PI / 180.0
    lat2 = lat2 * Math.PI / 180.0
    a = lat1 - lat2
    b = (long1 - long2) * Math.PI / 180.0
    val d: Double
    val sa2: Double
    val sb2: Double
    sa2 = Math.sin(a / 2.0)
    sb2 = Math.sin(b / 2.0)
    d = (2 * R * Math.asin(Math.sqrt(sa2 * sa2 + (Math.cos(lat1) * Math.cos(lat2) * sb2 * sb2))))
    return d
}


fun main() {
    val url = URL(jsonPath)
    //會的到一個json 的文字
    val jsonText = url.readText()
    println(jsonText)
    //將jsonText(json字串) 轉成 json 物件 , 以利日後分析 (結構化)
    val root = JSONObject(jsonText)
    //取的Json 內的 result 內容
    val result = root.getJSONObject("result")
    //取的result 內的 records 陣列內容
    val records = result.getJSONArray("records")
    for (jo in records) {
        //jo 是 JSONObject
        jo as JSONObject
        //將 jo 裡面的 surplusSpace 的內容 轉成 字串 再轉成數字 大於 0(有車位) 就印出
        if (jo.get("surplusSpace").toString().toInt() > 0) {
            println("${jo.get("parkName")} ${jo.get("surplusSpace")} / ${jo.get("totalSpace")}")
        }
    }
    println("-------------------------------------------------------------------")
    //巨匠桃任24.990056759076385 , 121.3120108551101
    //請求出最近 1 公里內的停場場資訊
    val endLat = 24.990056759076385
    val endLng = 121.3120108551101
    for (jo in records) {
        jo as JSONObject
        val lat = jo.getDouble("wgsY")
        val lng = jo.getDouble("wgsX")
        val d = distance(lng, lat, endLng, endLat)
        if (d < 1000) {
            println("${jo.get("parkName")} ${jo.get("surplusSpace")} / ${jo.get("totalSpace")} $d m")
        }
    }

}