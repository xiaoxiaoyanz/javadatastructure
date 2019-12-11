package com.wucc.iotest;

import org.omg.CORBA.Any;
import org.omg.CORBA.Object;
import org.omg.CORBA.TypeCode;
import org.omg.CORBA.portable.InputStream;

import java.io.*;

public class BufferedInputStreamTest {

    public  static  final  String  FILENAME = "E:\\javadatastructure\\src\\com\\wucc\\iotest\\TestBufferedInputStream.html";

    public static void  readFromFile(String filename){
        BufferedInputStream bufferedInput = null;
        byte[] buffer = new byte[1024];

        try {

            //创建BufferedInputStream 对象
            bufferedInput = new BufferedInputStream(new FileInputStream(filename));

            int bytesRead = 0;

            //从文件中按字节读取内容，到文件尾部时read方法将返回-1
            while ((bytesRead = bufferedInput.read(buffer)) != -1) {

                //将读取的字节转为字符串对象
                String chunk = new String(buffer, 0, bytesRead);
                System.out.print(chunk);
            }

        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        } catch (IOException ex) {
            ex.printStackTrace();
        } finally {
            //关闭 BufferedInputStream
            try {
                if (bufferedInput != null)
                    bufferedInput.close();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
    }

    public static void testBufferedInput(String filename) {
        try {
            /**
             * 建立输入流 BufferedInputStream, 缓冲区大小为8
             * buffer.txt内容为
             * abcdefghij
             */
            BufferedInputStream in = new BufferedInputStream(new FileInputStream(new File(filename)), 8);
            /*从字节流中读取5个字节*/
            byte [] tmp = new byte[5];
            in.read(tmp, 0, 5);
            System.out.println("字节流的前5个字节为: " + new String(tmp));
            /*标记测试*/
            in.mark(6);
            /*读取5个字节*/
            in.read(tmp, 0, 5);
            System.out.println("字节流中第6到10个字节为: " +  new String(tmp));
            /*reset*/
            in.reset();
            System.out.printf("reset后读取的第一个字节为: %c" , in.read());
            in.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
       readFromFile("TestBufferedInputStreamPath.html");
       //testBufferedInput(FILENAME);
       //System.out.println(new File(".").getAbsolutePath());

    }


}
