package org.javatop.pool;


/**
 * @author : Leo
 * @version 1.0
 * @date 2023-12-25 11:08
 * @description : Runnable任务处理
 */
public class MyRunnable implements Runnable{
    @Override
    public void run(){
        // 具体做什么任务
        System.out.println(Thread.currentThread().getName() + "==>99999 ");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
