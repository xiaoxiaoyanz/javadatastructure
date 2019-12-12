package com.wucc.iotest;
/*
结论   BufferedInputStream 380毫秒
       FileInputStream   886毫秒*/

import java.io.*;
import java.text.SimpleDateFormat;

public class FileInputStreamTest {

    public static void main(String[] args) throws IOException {
        FileInputStream in =new FileInputStream(new File("E:\\javadatastructure\\src\\com\\wucc\\iotest\\test.sql"));
        FileOutputStream out =new FileOutputStream(new File("E:\\javadatastructure\\src\\com\\wucc\\iotest\\testcopy02.sql"));
        byte[] bt =new byte[1024];
        int bytesRead = 0;
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
        long  start=System.currentTimeMillis();
        System.out.println("程序开始执行时间："+sdf.format(start));
        while ((bytesRead = in.read(bt)) != -1) {
            out.write(bt,0,bytesRead);
            //将读取的字节转为字符串对象
            String chunk = new String(bt, 0, bytesRead);
            System.out.print(chunk);
        }
        out.flush();
        in.close();
        out.close();
        long  end=System.currentTimeMillis();
        System.out.println("程序结束执行时间："+sdf.format(end));
        long cha = end - start;
        System.out.println("时间差："+cha+"毫秒");
        //testBufferedInputStream();
    }

    public static void testBufferedInputStream() throws IOException {
        FileInputStream in =new FileInputStream(new File("E:\\javadatastructure\\src\\com\\wucc\\iotest\\test.sql"));
        BufferedInputStream is =new BufferedInputStream(in);
        FileOutputStream out =new FileOutputStream(new File("E:\\javadatastructure\\src\\com\\wucc\\iotest\\testcopy.sql"));
        BufferedOutputStream outbf =new BufferedOutputStream(out);
        byte[] bt =new byte[1024];
        int bytesRead = 0;
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
        long  start=System.currentTimeMillis();
        System.out.println("程序开始执行时间："+sdf.format(start));
        while ((bytesRead = is.read(bt)) != -1) {
            outbf.write(bt,0,bytesRead);
            //将读取的字节转为字符串对象
            String chunk = new String(bt, 0, bytesRead);
            System.out.print(chunk);
        }
        outbf.flush();
        in.close();
        is.close();
        out.close();
        outbf.close();

        long  end=System.currentTimeMillis();
        System.out.println("程序结束执行时间："+sdf.format(end));
        long cha = end - start;
        System.out.println("时间差："+cha+"毫秒");
    }
}
