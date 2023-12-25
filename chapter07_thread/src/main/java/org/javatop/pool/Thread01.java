package org.javatop.pool;

import java.util.concurrent.*;

/**
 * @author : Leo
 * @version 1.0
 * @date 2023-12-25 10:42
 * @description : 线程池初始
 */
public class Thread01 {

    public static void main(String[] args) {
        //1.通过ThreadPoolExecutor创建一个线程对象
        ThreadPoolExecutor poolExecutor = new ThreadPoolExecutor(3, 5, 8,
                TimeUnit.SECONDS, new ArrayBlockingQueue<>(4), Executors.defaultThreadFactory(), new ThreadPoolExecutor.AbortPolicy());

        //2.线程池处理runnable任务
        MyRunnable target = new MyRunnable();
        poolExecutor.execute(target);//线程池会自动创建一个新的线程对象
        poolExecutor.execute(target);//线程池会自动创建一个新的线程对象
        poolExecutor.execute(target);//线程池会自动创建一个新的线程对象
        poolExecutor.execute(target);// 复用前面的线程池
        poolExecutor.execute(target);// 复用前面的线程池
        poolExecutor.execute(target);
        poolExecutor.execute(target);

        poolExecutor.execute(target);
        poolExecutor.execute(target);

        //拒绝新的线程
//        poolExecutor.execute(target);

        // 立即关掉线程池
//        poolExecutor.shutdownNow();

        //2.线程池处理collable任务


    }

}
