package com.Leo.io.print;

import cn.hutool.core.date.DateUtil;
import cn.hutool.core.io.FileUtil;
import cn.hutool.core.io.watch.SimpleWatcher;
import cn.hutool.core.io.watch.WatchMonitor;
import cn.hutool.core.io.watch.Watcher;
import cn.hutool.core.lang.Console;
import com.Leo.io.utils.TimeConsuming;
import org.apache.commons.lang3.time.StopWatch;
import org.junit.jupiter.api.Test;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.WatchEvent;
import java.util.concurrent.TimeUnit;

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
        StopWatch stopWatch = new StopWatch();
        // 开始时间
        stopWatch.start();
        // 执行时间
        PrintWriter pw1 = new PrintWriter(new FileOutputStream("e:/2023-io/pw.txt"));

        PrintWriter pw2 = new PrintWriter(Files.newOutputStream(Paths.get("e:/2023-io/pw.txt")));
        pw2.write("Leo 你好222");
        pw2.close();
        // 结束时间
        stopWatch.stop();

        // 统计执行时间（毫秒）
        System.out.println("执行时长:" + stopWatch.getTime(TimeUnit.MILLISECONDS) + " 毫秒.");

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

    public static void testPrintWriter03() throws IOException {
        PrintWriter pw = new PrintWriter(System.out);
        pw.write("Leo 你好");
        pw.close();

    }

    public static void main(String[] args) {
        long time = TimeConsuming.time(() -> {
            try {
                testPrintWriter03();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        });
        System.out.println("time = " + time);
    }


}
