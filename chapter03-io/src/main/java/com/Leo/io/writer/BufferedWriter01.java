package com.Leo.io.writer;

import org.junit.jupiter.api.Test;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/**
 * @author : Leo
 * @version 1.0
 * @date 2023/9/25/025 11:26
 * @description : BufferedWriter 相关操作
 */
public class BufferedWriter01 {
    public static void main(String[] args) {

    }


    /**
     * 用于测试: BufferedWriter 写入文件
     */
    @Test
    public void testBufferWriter01() throws IOException {

        BufferedWriter bw = new BufferedWriter(new FileWriter("e:/2023-io/bw.txt"));
        try {
            bw.write("第一行");
            bw.newLine();
            bw.write("第二行");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (bw != null) {
                bw.close();
            }
        }

    }
}
