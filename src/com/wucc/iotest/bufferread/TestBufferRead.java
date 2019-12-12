package com.wucc.iotest.bufferread;

import java.io.*;
import java.text.SimpleDateFormat;

public class TestBufferRead {

    //一个一个字符读取
    public static void printByFileReader(String filePath,String targetFilePath) throws IOException
    {
        BufferedReader reader=new BufferedReader(
                new FileReader(filePath)
        );
        BufferedWriter writer=new BufferedWriter(new FileWriter(targetFilePath));
        if(!reader.ready())
        {
            System.out.println("文件流暂时无法读取");
            return;
        }
        int result=0;
        while((result=reader.read())!=-1)
        {
            //因为读取到的是int类型的，所以要强制类型转换
            System.out.print((char)result);
            writer.write(result);
        }
        reader.close();
        writer.close();
    }

    //一个数组一个数组读取
    public static void printByFileReaderChars(String filePath,String targetFilePath) throws IOException
    {
        BufferedReader reader=new BufferedReader(
                new FileReader(filePath)
        );
        BufferedWriter writer=new BufferedWriter(new FileWriter(targetFilePath));
        if(!reader.ready())
        {
            System.out.println("文件流暂时无法读取");
            return;
        }
        int size=0;
        char[] cbuf=new char[20];
        while((size=reader.read(cbuf, 0, cbuf.length))!=-1)
        {
            System.out.print(new String(cbuf,0,size));
            writer.write(cbuf,0,size);
        }
        reader.close();
        writer.close();
    }
    //一行一行读取
    public static void printByFileReaderLine(String filePath,String targetFilePath) throws IOException
    {
        BufferedReader reader=new BufferedReader(
                new FileReader(filePath)
        );
        BufferedWriter writer=new BufferedWriter(new FileWriter(targetFilePath));
        if(!reader.ready())
        {
            System.out.println("文件流暂时无法读取");
            return;
        }
        int size=0;
        String line;
        while((line=reader.readLine())!=null)
        {
            System.out.print(line+"\n");
            writer.write(line);
            writer.newLine();
        }
        reader.close();
        writer.close();
    }

    public static void main(String[] args) throws IOException {
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
        long  start=System.currentTimeMillis();
        System.out.println("程序开始执行时间："+sdf.format(start));
        String filepath = "E:\\javadatastructure\\src\\com\\wucc\\iotest\\test.sql";
        String targetFilePath = "E:\\javadatastructure\\src\\com\\wucc\\iotest\\test02.sql";
        //printByFileReader(filepath,targetFilePath);//84236毫秒
        //printByFileReaderChars(filepath,targetFilePath); //5743毫秒
        printByFileReaderLine(filepath,targetFilePath);//592毫秒
        long  end=System.currentTimeMillis();
        System.out.println("程序结束执行时间："+sdf.format(end));
        long cha = end - start;
        System.out.println("时间差："+cha+"毫秒");
    }



}
