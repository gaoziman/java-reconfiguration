package org.javatop.thread;

/**
 * @author : Leo
 * @version 1.0
 * @date 2023-11-03 15:03
 * @description : 创建线程的第一种方式
 */
public class MyThread04 extends Thread{


    public MyThread04(String name) {
        super(name);
    }

    @Override
    public void run() {
        // 哪个线程执行它 他就是哪个线程
        Thread t = Thread.currentThread();
        for (int i = 1; i <= 5; i++) {
            System.out.println( t.getName() + "输出:" + i);
        }
    }
}
