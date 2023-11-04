package org.javatop.thread;

/**
 * @author : Leo
 * @version 1.0
 * @date 2023-11-03 15:03
 * @description : 创建线程的第一种方式
 */
public class MyThread01  extends Thread{

    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println( "子线程:" + i);
        }
    }
}
