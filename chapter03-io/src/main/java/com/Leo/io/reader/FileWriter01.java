package com.Leo.io.reader;

import org.junit.jupiter.api.Test;

import java.io.FileWriter;
import java.io.IOException;
import java.io.StringWriter;

/**
 * @author : Leo
 * @version 1.0
 * @date 2023/9/25/025 10:33
 * @description : FileWriter 相关操作
 *--------------------------------------------------------
      1)new FileWriter(File/String):覆盖摸式，相当于流的指针在首端
      2)new FileWriter(File/String,true):追加模式，相当于流的指针在尾端
      3)write(int):写入单个字符
      4)write(char[I):写入指定数组
      5)write(char【】,off,Ien):写入指定数组的指定部分
      6)write(string):写入整个字符串
      7)write(string,off,len):写入字符串的指定部分
 * ----------------------------------------------------------
 */
public class FileWriter01 {
    public static void main(String[] args) {

    }



    /**
    * 用于测试: FileWriter读取文件
    */
    @Test
    public void testFileWriter01()
    {

        FileWriter fw  = null;

        try {
            // 创建 FileWriter 对象
            fw = new FileWriter("e:/note.txt");

            // 1. write(int):写入单个字符
            fw.write('L');

            // 2. write(char[I):写入指定数组
            char[] chars = {'L','e','o'};
            fw.write(chars);

            // 3. write(char【】,off,Ien):写入指定数组的指定部分
            fw.write(chars, 1, 2);

            // 4. write(string):写入整个字符串
            fw.write("你好世界");

            // 5. write(string,off,len):写入字符串的指定部分
            fw.write("你好世界", 2, 2);


        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                fw.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }


    }
}
