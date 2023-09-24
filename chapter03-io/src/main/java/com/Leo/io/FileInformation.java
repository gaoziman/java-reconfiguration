package com.Leo.io;

import org.junit.jupiter.api.Test;

import java.io.File;

/**
 * @author : Leo
 * @version 1.0
 * @date 2023/9/24/024 19:22
 * @description : 文件详细信息
 */
public class FileInformation {

    public static void main(String[] args) {

    }



    /**
    * 用于测试: 文件基本信息
    */
    @Test
    public void testInfo01()
    {

        File file = new File("E:/terrence/焊缝管口/焊缝管口数据表.txt");
        System.out.println("文件的名称: " + file.getName());
        System.out.println("文件绝对路径: " + file.getAbsolutePath());
        System.out.println("文件的父路径: " + file.getParentFile());
        System.out.println("文件父级目录: " + file.getParent());
        System.out.println("文件大小(字节):" + file.length());
        System.out.println("文件是否存在 :" + file.exists());
        System.out.println("是不是一个文件 :" + file.isFile());
        System.out.println("是不是一个目录 :" + file.isDirectory());
    }




}
