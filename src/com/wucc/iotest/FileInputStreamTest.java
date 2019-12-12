package com.wucc.iotest;
/*
结论   BufferedInputStream 380毫秒
       FileInputStream   886毫秒*/

import java.io.*;
import java.text.SimpleDateFormat;

public class FileInputStreamTest {

    public static void main(String[] args) throws IOException {
        /*FileInputStream in =new FileInputStream(new File("E:\\javadatastructure\\src\\com\\wucc\\iotest\\test.sql"));
        byte[] bt =new byte[1024];
        int bytesRead = 0;
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
        long  start=System.currentTimeMillis();
        System.out.println("程序开始执行时间："+sdf.format(start));
        while ((bytesRead = in.read(bt)) != -1) {

            //将读取的字节转为字符串对象
            String chunk = new String(bt, 0, bytesRead);
            System.out.print(chunk);
        }
        in.close();
        long  end=System.currentTimeMillis();
        System.out.println("程序开始执行时间："+sdf.format(end));
        long cha = end - start;
        System.out.println("时间差："+cha+"毫秒");*/
        testBufferedInputStream();
    }

    public static void testBufferedInputStream() throws IOException {
        FileInputStream in =new FileInputStream(new File("E:\\javadatastructure\\src\\com\\wucc\\iotest\\test.sql"));
        BufferedInputStream is =new BufferedInputStream(in);
        byte[] bt =new byte[1024];
        int bytesRead = 0;
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
        long  start=System.currentTimeMillis();
        System.out.println("程序开始执行时间："+sdf.format(start));
        while ((bytesRead = is.read(bt)) != -1) {

            //将读取的字节转为字符串对象
            String chunk = new String(bt, 0, bytesRead);
            System.out.print(chunk);
        }
        in.close();
        is.close();
        long  end=System.currentTimeMillis();
        System.out.println("程序结束执行时间："+sdf.format(end));
        long cha = end - start;
        System.out.println("时间差："+cha+"毫秒");
    }
}
