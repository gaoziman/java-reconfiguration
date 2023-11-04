package org.javatop.thread;

import sun.print.SunMinMaxPage;

import java.util.concurrent.Callable;

/**
 * @author : Leo
 * @version 1.0
 * @date 2023-11-03 15:03
 * @description : 创建线程的第三种方式 实现 Callable接口
 */
public class MyThread03 implements Callable<String> {

    private int n;

    public MyThread03(int n) {
        this.n = n;
    }

    @Override
    public String call() throws Exception {
        int sum = 0;
        // 描述这个线程的任务和这个线程返回的结果
        for (int i = 0; i <= n; i++) {
            // 求1-n 的和
            sum += i;
        }

        return "线程求出来1-" + n + "的和为" + sum;
    }
}
