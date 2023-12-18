package com.Leo.io.file;

import org.junit.jupiter.api.Test;

import java.io.File;
import java.util.Date;

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
    public void testInfo01() {

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


    /**
     * 用于测试: 文件基本信息
     */
    @Test
    public void testInfo02() {

        File f = new File("E:/terrence/焊缝管口/焊缝管口数据表.txt");
        System.out.println("============================================");
        System.out.println("文件长度：" + f.length() + "字节");
        System.out.println("文件或者目录：" + (f.isFile() ? "是文件" : "不是文件"));
        System.out.println("文件或者目录：" + (f.isDirectory() ? "是目录" : "不是目录"));
        System.out.println("是否可读：" + (f.canRead() ? "可读取" : "不可读取"));
        System.out.println("是否可写：" + (f.canWrite() ? "可写入" : "不可写入"));
        System.out.println("是否隐藏：" + (f.isHidden() ? "是隐藏文件" : "不是隐藏文件"));
        System.out.println("最后修改日期：" + new Date(f.lastModified()));
        System.out.println("文件名称：" + f.getName());
        System.out.println("文件路径：" + f.getPath());
        System.out.println("绝对路径：" + f.getAbsolutePath());
    }


    /**
     * 用于测试: 遍历目录文件以及文件夹
     */
    @Test
    public void testErgodic() {
        // 建立File变量,并设定由f变量变数引用
        File file = new File("E:/");
        System.out.println("文件名称\t\t文件类型\t\t文件大小");
        System.out.println("===================================================");
        // 调用不带参数的list()方法
        String fileList[] = file.list();
        // 遍历返回的字符数组
        for (int i = 0; i < fileList.length; i++) {
            System.out.print(fileList[i] + "\t\t");
            System.out.print((new File("E:/", fileList[i])).isFile() ? "文件" + "\t\t" : "文件夹" + "\t\t");
            System.out.println((new File("E:/", fileList[i])).length() + "字节");
        }

    }

}
