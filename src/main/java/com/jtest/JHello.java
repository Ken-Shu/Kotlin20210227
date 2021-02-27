package com.jtest;

import com.ktest.KHello;

public class JHello {
    public void callMe(){
        System.out.println("0921443123");
    }
    public static void main(String[] args) {
        System.out.println("Hello Java");
        JHello j = new JHello();
        j.callMe();
        //排版程式碼Ctrl+Alt+L
        //呼叫Kotlin的物件
        KHello k = new KHello();
        k.callMe();
    }
}
