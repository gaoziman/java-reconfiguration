package com.Leo.io.input;

import org.junit.jupiter.api.Test;

import java.io.FileInputStream;
import java.io.IOException;

/**
 * @author : Leo
 * @version 1.0
 * @date 2023/9/24/024 21:49
 * @description :
 */
public class FileInputStream01 {

    public static void main(String[] args) throws IOException {

    }

    /**
     * 用于测试: 字节输入流去读取
     */
    @Test
    public void testFileInputStream01() throws IOException {
        FileInputStream fis = null;

        int readData = 0;


        // 创建FileInputStream 对象， 用于文件的读取
        try {
            fis = new FileInputStream("E:/test.txt");
            while ((readData = fis.read()) != -1) {
                System.out.print((char) readData);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            // 关闭流
            fis.close();
        }
    }


    /**
     * 用于测试: 使用字节数组输入流去读取
     */
    @Test
    public void testFileInputStream02() {
        FileInputStream fis = null;

        int readData = 0;
        int len = 0;

        // 使用字节数组
        byte[] bytes = new byte[1024];

        // 创建FileInputStream 对象， 用于文件的读取
        try {
            // len如果返回-1, 代表文件读取完毕, 否则循环读取 如果读取正常, 则返回实际读取的字节
            fis = new FileInputStream("E:/test.txt");
            while ((len = fis.read(bytes)) != -1) {
                System.out.print(new String(bytes, 0, len));
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            // 关闭流
            try {
                fis.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
