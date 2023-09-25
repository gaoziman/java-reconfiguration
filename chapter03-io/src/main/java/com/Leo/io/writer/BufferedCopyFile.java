package com.Leo.io.writer;

import org.junit.jupiter.api.Test;

import java.io.*;

/**
 * @author : Leo
 * @version 1.0
 * @date 2023/9/25/025 11:32
 * @description : 使用Buffered进行文件拷贝
 */
public class BufferedCopyFile
{
    public static void main(String[] args)
    {


    }



    /**
    * 用于测试: Buffered字符流进行文件拷贝
    */
    @Test
    public void testBufferedCopy01()
    {
        BufferedReader br = null;
        BufferedWriter bw = null;

        try
        {
            br = new BufferedReader(new FileReader("e:/2023-io/sort.txt"));
            bw = new BufferedWriter(new FileWriter("e:/2023-io/bwCopy2.txt"));
            String length = "";
            // 边读边写
            while ((length = br.readLine()) != null)
            {
                bw.write(length);
                bw.newLine();
            }
            System.out.println("拷贝成功");
        } catch (IOException e)
        {
            e.printStackTrace();
        } finally {
            // 关闭资源
            if (br != null)
            {
                try
                {
                    br.close();
                } catch (IOException e)
                {
                    e.printStackTrace();
                }
            }
            if (bw != null)
            {
                try
                {
                    bw.close();
                } catch (IOException e)
                {
                    e.printStackTrace();
                }
            }

        }

    }


    /**
     * 用于测试: Buffered字节流进行文件拷贝
     */
    @Test
    public void testBufferedCopy02() {
        BufferedInputStream bis = null;
        BufferedOutputStream bos = null;

        try {
            bis = new BufferedInputStream(new FileInputStream("e:/2023-io/fosCopy.jpg"));
            bos = new BufferedOutputStream(new FileOutputStream("e:/2023-io/fosCopy2.jpg"));
            // 循环读取文件
            byte[] bytes = new byte[1024];
            int length = 0;
            // 边读边写 当返回-1的时候表示文件读取完毕
            while ((length = bis.read(bytes)) != -1) {
                bos.write(bytes, 0, length);
            }
            System.out.println("拷贝成功");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            // 关闭资源
            if (bis != null) {
                try {
                    bis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (bos != null) {
                try {
                    bos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

        }
    }

}
