package com.Leo.io.file;

import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.IOException;

/**
 * @author : Leo
 * @version 1.0
 * @date 2023/9/24/024 18:32
 * @description :
 */
public class FileCreate {
    public static void main(String[] args) {

    }


    /**
     * 用于测试: 创建一个文件
     */
    @Test
    public void test01() {
        File file = new File("e://2023-File.txt");
        try {
            file.createNewFile();
            System.out.println("创建成功!");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
