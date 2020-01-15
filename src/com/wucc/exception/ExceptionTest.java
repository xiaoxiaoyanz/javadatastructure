package com.wucc.exception;

public class ExceptionTest {
    public static void testInt(short j,int i){
        System.out.println(i+j);
    }

    public static void main(String[] args) {
        short a =9999;
        testInt(a,4);

    }
}
