package org.javatop.thread;

import org.junit.jupiter.api.Test;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/**
 * @author : Leo
 * @version 1.0
 * @date 2023-11-03 15:03
 * @description :
 */
public class MyThreadTest {


    /**
     * 用于测试:测试1
     */
    @Test
    public void test01() {

        Thread t1 = new MyThread01();

        t1.start();


        for (int i = 1; i <= 5; i++) {
            System.err.println("主线程:" + i);
        }
    }


    /**
     * 用于测试: 测试2
     */
    @Test
    public void test02() {
        // 创建线程对象
        Runnable runnable = new MyThread02();

        // 通过start方法启动
        new Thread(runnable).start();

        for (int i = 1; i <= 5; i++) {
            System.err.println("主线程:" + i);
        }
    }

    /**
     * 用于测试:  测试3匿名内部类形式创建
     */
    @Test
    public void test03() {

        // 匿名内部类写法
        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 1; i <= 5; i++) {
                    System.err.println("子线程1:" + i);
                }
            }
        }).start();

        // 简化形式 lambda
        new Thread(()->{
            for (int i = 1; i <= 5; i++) {
                System.err.println("子线程2:" + i);
            }
        }).start();

        for (int i = 1; i <= 5; i++) {
            System.out.println("主线程:" + i);
        }


    }



    /**
     *  用于测试:collable接口
     */
    @Test
    public void test04() throws ExecutionException, InterruptedException {

      Callable<String> callable = new  MyThread03(100);

        //创建未来任务对象 FutureTask实现类Runnable接口
        FutureTask<String> f1 =  new FutureTask<>(callable);
        new Thread(f1).start();


        //获取线程执行完毕之后的结果
        String sum = f1.get();
        System.out.println("sum = " + sum);

    }



    /**
     *  用于测试:
     */
    @Test
    public void test05() {


        Thread t1 = new MyThread04("第一个子线程");

        t1.start();

        Thread t2 = new MyThread04("第二个子线程");

        t2.start();



        // 获得主线程名称
        String name = Thread.currentThread().getName();
        for (int i = 1; i <= 5; i++) {
            System.err.println( name + "输出:" + i);
        }
    }
}
