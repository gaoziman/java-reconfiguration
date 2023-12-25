package com.Leo.io.utils;

import cn.hutool.core.date.DateUtil;
import cn.hutool.core.io.FileTypeUtil;
import cn.hutool.core.io.FileUtil;
import cn.hutool.core.io.file.FileReader;
import cn.hutool.core.io.file.FileWriter;
import cn.hutool.core.io.watch.SimpleWatcher;
import cn.hutool.core.io.watch.WatchMonitor;
import cn.hutool.core.lang.Console;
import cn.hutool.core.util.ZipUtil;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.nio.file.Path;
import java.nio.file.WatchEvent;

/**
 * @author : Leo
 * @version 1.0
 * @date 2023/10/9/009 11:38
 * @description :
 */
public class HutoolTest {


    /**
     * 用于测试: hutool工具包
     */
    @Test
    public void testHutool() {

        String now = DateUtil.now();
        System.out.println("now = " + now);


    }


    /**
     * 用于测试: hutool工具包
     */
    @Test
    public void testHutool02() {
        File file = FileUtil.file("E:/2023-IO/bw.txt");
        WatchMonitor.createAll(file, new SimpleWatcher() {
            @Override
            public void onModify(WatchEvent<?> event, Path currentPath) {
                System.out.println("EVENT modify");
                Console.log("EVENT modify");
            }
        }).start();

    }


    /**
     * 用于测试: hutool工具包
     */
    @Test
    public void testHutool03() {
        File file = FileUtil.file("E:/2023-IO/fosCopy2.jpg");
        String type = FileTypeUtil.getType(file);
        //输出 jpg则说明确实为jpg文件
        Console.log(type);

        //默认UTF-8编码，可以在构造中传入第二个参数做为编码
        FileReader fileReader = new FileReader("E:/2023-IO/bw.txt");
        String result = fileReader.readString();
        System.out.println("result = " + result);
        FileWriter writer = new FileWriter("E:/2023-IO/bw666.txt");
        writer.write("test");
        ZipUtil.zip("E:/2023-IO/bw666.txt", "E:/2023-IO/bw666.zip");
    }


}
