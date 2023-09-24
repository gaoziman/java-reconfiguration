package com.Leo.io.output;

import org.junit.jupiter.api.Test;

import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @author : Leo
 * @version 1.0
 * @date 2023/9/24/024 22:07
 * @description :
 */
public class FileOutputStream01 {

    public static void main(String[] args) {

    }


    /**
    * 用于测试: FileOutStream基本练习
    */
    @Test
    public void testFileOutStream01()
    {

        FileOutputStream fos = null;


        try {
            // 创建字节输出流对象 用于写入数据到磁盘  true 就是往文件后面进行追加的方式而不是覆盖
            fos =  new FileOutputStream("e:/fos.txt",true);
            // 写入一个字节
//            fos.write('L');

            // 写入一个字符串 把字符串转为字符数组
            String str = "Hello Leo 666";
//            fos.write(str.getBytes());
            fos.write(str.getBytes(),0, str.length());


        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                fos.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }


    }
}
