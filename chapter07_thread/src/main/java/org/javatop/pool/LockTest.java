package org.javatop.pool;

/**
 * @author : Leo
 * @version 1.0
 * @date 2023-12-25 15:18
 * @description : 乐观锁和悲观锁
 */
public class LockTest {

    public static void main(String[] args) {
        MyRunnable2 target = new MyRunnable2();

        for (int i = 1; i <= 100; i++) {
           new Thread(target).start();
        }

    }
}
