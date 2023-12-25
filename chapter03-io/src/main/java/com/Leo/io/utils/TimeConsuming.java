package com.Leo.io.utils;

import org.apache.commons.lang3.time.StopWatch;

import java.util.concurrent.TimeUnit;

/**
 * @author : Leo
 * @version 1.0
 * @date 2023/10/9/009 11:08
 * @description : 方法执行时长工具类
 */
public class TimeConsuming {

    public static long time(Runnable method) {
        StopWatch stopWatch = new StopWatch();
        // 开始时间
        stopWatch.start();
        // 执行方法
        method.run();
        // 结束时间
        stopWatch.stop();

        // 统计执行时间（毫秒）
        System.out.println("执行时长:" + stopWatch.getTime(TimeUnit.MILLISECONDS) + " 毫秒.");
        return stopWatch.getTime(TimeUnit.MILLISECONDS);
    }
}
