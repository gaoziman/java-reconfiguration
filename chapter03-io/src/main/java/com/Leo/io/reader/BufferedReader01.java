package com.Leo.io.reader;

import org.junit.jupiter.api.Test;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * @author : Leo
 * @version 1.0
 * @date 2023/9/25/025 11:21
 * @description : BufferedReader 练习
 */
public class BufferedReader01
{
    public static void main(String[] args)
    {

    }


    /**
    * 用于测试: BufferedReader读取文件
    */
    @Test
    public void testBufferedReader01() throws FileNotFoundException {

        BufferedReader br = new BufferedReader(new FileReader("e:/2023-io/sort.txt"));
        try
        {
            // 一行一行的读取 当时line为null的时候说明文件已经读取完毕
            String line = null;
            while ((line = br.readLine()) != null)
            {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally
        {
            try
            {
                br.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

}
