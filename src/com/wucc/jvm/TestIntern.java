package com.wucc.jvm;

public class TestIntern {
    public static void main(String[] args) {
        String str1 = new StringBuffer("ha").append("cc").toString();
        System.out.println(str1.intern() == str1);
       /* String str2 = new StringBuffer("ja").append("va").toString();
        System.out.println(str2.intern() == str2);*/

        String str3 = new String("jr") + new String("va");
        String str4 = str3.intern();

        System.out.println(str4 == str3);
    }
}
