package com.Leo.io.reader;

import org.junit.jupiter.api.Test;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * @author : Leo
 * @version 1.0
 * @date 2023/9/24/024 22:30
 * @description : FileReader相关操作
 * <p>
 * 1)new FileReader(File/String)
 * 2)read每次读取单个字符，返回该字符，如果到文件末尾返回-1
 * 3)read(char[):批量读取多个字符到数组，返回读取到的字符数，如果到文件末尾返回-1
 * 相关API:
 * 1)new String(char[):将char【】转换成String
 * 2)new String(char[l,off,Ien):将char[I的指定部分转换成String
 */
public class FileReader01 {
    public static void main(String[] args) {

    }

    /**
     * 用于测试: FileReader测试 一个一个读取
     */
    @Test
    public void testFileReader01() {
        // 使用FileReader的方式读取文件

        FileReader frd = null;

        int readData = 0;

        try {
            frd = new FileReader("e:/sort.txt");
            while ((readData = frd.read()) != -1) {
                System.out.print((char) readData);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                frd.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }


    /**
     * 用于测试: FileReader测试 使用char数组方式读取
     */
    @Test
    public void testFileReader02() {
        // 使用FileReader的方式读取文件

        FileReader frd = null;

        int readData = 0;

        int len = 0;

        try {
            char[] chars = new char[1024];

            frd = new FileReader("e:/sort.txt");
            while ((len = frd.read(chars)) != -1) {
                // 使用char数组进行读取文件
                System.out.print(new String(chars, 0, len));
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                frd.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}
