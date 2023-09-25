package com.Leo.io.reader;

import org.junit.jupiter.api.Test;

import java.io.*;

/**
 * @author : Leo
 * @version 1.0
 * @date 2023/9/25/025 15:07
 * @description : InputStreamWriter 写入文件 解决乱码问题 转换流 可以把字节流转为字符流 并且设置编码
 */
public class OutputStreamWriter01
{

    /**
    * 用于测试: InputStreamReader 读取文件并设置 编码
    */
    @Test
    public void testInputStreamReader01() throws IOException
    {

        // 1. 把FileOutputStream转成OutputStreamWriter 并设置编码
        OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("e:/2023-io/osw.txt"), "gbk");
        //2. 把OutputStreamWriter传入BufferedWriter
        BufferedWriter bw = new BufferedWriter(osw);

        // 简写
        BufferedWriter bw2 = new BufferedWriter(
                new OutputStreamWriter(new FileOutputStream("e:/2023-io/osw2.txt"), "gbk"));

        bw2.write("你好 的咖啡机");
        // 3. 关闭流
        bw2.close();

    }
}
