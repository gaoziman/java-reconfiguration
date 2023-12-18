package com.Leo.io.reader;

import org.junit.jupiter.api.Test;

import java.io.*;

/**
 * @author : Leo
 * @version 1.0
 * @date 2023/9/25/025 15:07
 * @description : InputStreamReader 读取文件 解决乱码问题 转换流 可以把字节流转为字符流 并且设置编码
 */
public class InputStreamReader01 {

    /**
     * 用于测试: InputStreamReader 读取文件并设置 编码
     */
    @Test
    public void testInputStreamReader01() throws IOException {

        // 1. 把FileInputStream转成InputStreamReader 并设置编码
        InputStreamReader isr = new InputStreamReader(new FileInputStream("e:/2023-io/note.txt"), "gbk");
        //2. 把InputStreamReader传入BufferedReader
        BufferedReader br = new BufferedReader(isr);

        // 简写
        BufferedReader br2 = new BufferedReader(
                new InputStreamReader(new FileInputStream("e:/2023-io/note.txt"), "gbk"));
        String len = "";

        while ((len = br2.readLine()) != null) {
            System.out.println(len);
        }

        // 3. 关闭流
        br.close();

    }
}
