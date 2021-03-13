package com.股票獲利計算

/*
 *資本利得=(賣價-買價)X股數=(40-30)X1000=10000元
 *股利=股利X股數=1X1000=1000元
 *買進時交易成本(買進手續費)=買進成交金額X0.1425% (假設沒有折扣)=30元X1000股X0.1425%=43元
 *賣出時交易成本(賣出手續費與證交稅)=賣出成交金額X0.1425%+賣出成交金額X0.3%=40X1000X0.1425%+40X1000X0.3%=177元
 *股票投資損益=資本利得+股利-交易手續費-證券交易稅=10000+1000-43-177=10780元(賺)
 *
 * 舉個例子，當你要交易一張20元的股票：

 *買進手續費為 20（股價）*1000（股）*0.1425%=28.5元

 *賣出手續費為 20（股價）*1000（股）*（0.1425%+0.3%）=88.5元

 *也就是說，交易股票（買+賣一次）的總成本為0.1425%*2+0.3%=0.585%，
*/

fun buystock (buyprice : Double , count : Int) : Double{
    var buystock = (buyprice*count)+(buyprice*count)*0.01425
    println("買進股價:${buyprice} 買進數量(股):${count} 買進成本:${buystock}")
    return buystock
}

fun sellstock(sellprice : Double , count : Int) : Double{
    var sellstock = (sellprice*count)*(0.01425)+(sellprice*count)*(0.03)
    println("賣出股價:${sellprice} 賣出數量(股):${count} 賣出金額:${sellstock}")
    return sellstock
}

fun myMoneyToEarn(sell : Int , buy : Int){
    var myEarn = (buy - sell)*1000
}

fun main() {

    print("目前持股:")
    print("請輸入股票買進價格: ")
    var n = readLine()!!.toDouble()
    print("請輸入股票買進數量(股):")
    var c = readLine()!!.toInt()
    buystock(n,c)
}