package com.Leo.array.Leo01.homework;

import cn.hutool.core.date.StopWatch;
import org.junit.jupiter.api.Test;

import java.util.Random;

/**
 * @author : Leo
 * @version 1.0
 * @date 2023/9/26/026 18:56
 * @description :
 */
public class Homework05 {


    public static void main(String[] args) {
        char[] arr1 = {'a', 'z', 'b', 'c'};
        char[] arr2 = arr1;
        arr1[2] = '高';


        for (int i = 0; i < arr2.length; i++) {
            System.out.println(arr1[i] + "," + arr2[i]);
        }

    }


    /**
     * 用于测试:测试随机数
     */
    @Test
    public void testRandom() {
        Random random = new Random();
        for (int i = 0; i < 100; i++) {
            int b = random.nextInt(100) + 1;
            System.out.println("b = " + b);
        }
    }


    /**
     * 用于测试: 随机数测试
     */
    @Test
    public void testRandom02() {
        // 创建一个 StopWatch 实例
        StopWatch sw = new StopWatch();

        // 开始计时
        sw.start();

        for (int i = 0; i < 1000; i++) {
            int j = (int) (Math.random() * 100 + 1);
            System.out.println("j = " + j);
        }

        // 停止计时
        sw.stop();

        // 1002ms
        System.out.println(sw.getTotalTimeSeconds());


    }

}
