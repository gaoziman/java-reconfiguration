package com.Leo.io.print;

import org.junit.jupiter.api.Test;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Paths;

/**
 * @author : Leo
 * @version 1.0
 * @date 2023/9/25/025 15:26
 * @description : PrintWriter 打印流的基本操作
 */
public class PrintWriter01 {


    /**
    * 用于测试:PrintWriter 打印流的基本操作
    */
    @Test
    public void testPrintWriter01() throws IOException {
        PrintWriter pw1  = new PrintWriter(new FileOutputStream("e:/2023-io/pw.txt"));

        PrintWriter pw2  = new PrintWriter(Files.newOutputStream(Paths.get("e:/2023-io/pw.txt")));
        pw2.write("Leo 你好");
        pw2.close();

    }


    /**
    * 用于测试: PrintWriter
    */
    @Test
    public void testPrintWriter02() throws IOException {
        PrintWriter pw = new PrintWriter(System.out);
        pw.write("Leo 你好");
        pw.close();

    }
}
