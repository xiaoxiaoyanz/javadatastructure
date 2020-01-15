package com.wucc.jvm;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.List;

public class TestOutOfMemory {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();

        int i = 0;
        while (true){
            System.out.println("cc");
            list.add(new String(String.valueOf(i++)));
        }
    }
}
