package com.Leo.io.output;

import org.junit.jupiter.api.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @author : Leo
 * @version 1.0
 * @date 2023/9/24/024 22:21
 * @description : 文件拷贝
 */
public class FileCopy {
    public static void main(String[] args) {

    }


    /**
     * 用于测试: 文件的拷贝
     */
    @Test
    public void testFileCopy() {

        // 创建一个文件输入流和一个文件输出流 先读后写

        FileInputStream fis = null;
        FileOutputStream fos = null;
        int len = 0;

        try {
            fis = new FileInputStream("D:/Leo Gallery/LeoSave/wallhaven-wexe9r.jpg");
            fos = new FileOutputStream("E:/ fosCopy.jpg");

            byte[] bytes = new byte[1024];
            // 边读边写
            while ((len = fis.read(bytes)) != -1) {
                fos.write(bytes, 0, len);
            }
            System.out.println("拷贝图片成功!");

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            // 关闭流
            try {
                fis.close();
                fos.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}
