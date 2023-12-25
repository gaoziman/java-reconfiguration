package org.javatop.pool;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author : Leo
 * @version 1.0
 * @date 2023-12-25 15:19
 * @description :
 */
public class MyRunnable2 implements Runnable {
    private int count2;
    private AtomicInteger count = new AtomicInteger();

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
//            System.out.println(Thread.currentThread().getName() + ":" + count.incrementAndGet());
            synchronized (this) {
                System.out.println(Thread.currentThread().getName() + ":" + (++count2));
            }
        }
    }
}
