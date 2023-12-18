package com.Leo.io.file;

import org.junit.jupiter.api.Test;

import java.io.File;

/**
 * @author : Leo
 * @version 1.0
 * @date 2023/9/24/024 19:22
 * @description : 目录信息
 */
public class DirectoryInformation {

    public static void main(String[] args) {

    }


    /**
     * 用于测试: 文件小练习
     */
    @Test
    public void testFile() {
        File file = new File("e:/2023-File.txt");
        if (file.exists()) {
            if (file.delete()) {
                System.out.println("文件删除成功!");
            } else {
                System.out.println("文件删除失败!");
            }
        } else {
            System.out.println("该文件不存在!");
        }

    }


    /**
     * 用于测试: 目录练习测试 注意： 删除目录的时候，目录下的有文件的时候会删除失败
     */
    @Test
    public void testDirectory() {
        File file = new File("e:/2023");
        if (file.exists()) {
            if (file.delete()) {
                System.out.println("目录删除成功!");
            } else {
                System.out.println("目录删除失败!");
            }
        } else {
            System.out.println("该目录不存在!");
        }
    }


    /**
     * 用于测试: 判断 e:/Java-2023/Leo/test目录是否存在，如果存在就提示已经存在，否则就创建
     */
    @Test
    public void test() {
        File file = new File("e:/Java-2023/Leo/test");
        if (file.exists()) {
            System.out.println("目录已存在!");
        } else {
            if (file.mkdirs()) {
                System.out.println("目录创建成功!");
            } else {
                System.out.println("目录创建失败!");
            }
        }
    }

}
