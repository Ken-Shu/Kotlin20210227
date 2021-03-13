package com.jtest;

import com.topfun.Calc;

public class CallTopFun {
    public static void main(String[] args) {
        System.out.println(Calc.myAdd(10,20));
        System.out.println(Calc.myAdd(20,30));
        System.out.println(Calc.getCount()); // 取得呼叫次數
    }
}
