package com.cisyam.functioon;

import org.junit.jupiter.api.Test;

import java.util.Optional;

/**
 * @author : gaoziman
 * @description : 重点
 * @date 2023/8/6 13:48
 */
public class DemoTest02 {



    @Test
    public void test1() {
        //empty():创建的Optional对象内部的value = null
        Optional<Object> op1 = Optional.of("name");
        if (!op1.isPresent()){
            //Optional封装的数据是否包含数据
            System.out.println("数据为空");
        }
        System.out.println(op1);
        System.out.println(op1.isPresent());

        //如果Optional封装的数据value为空，则get()报错。否则，value不为空时，返回value.
        System.out.println(op1.get());
    }


    @Test
    public void test2(){
        String str = "hello";
        str = null;
        //of(T t):封装数据t生成Optional对象。要求t非空，否则报错。
        Optional<String> op1 = Optional.of(str);
        //get()通常与of()方法搭配使用。用于获取内部的封装的数据value
        String str1 = op1.get();
        System.out.println(str1);
    }

    @Test
    public void test3(){
        String str ="Beijing";
        str = null;
        //ofNullable(T t) ：封装数据t赋给Optional内部的value。不要求t非空
        Optional<String> op1 = Optional.ofNullable(str);
        System.out.println("op1 = " + op1);
        //orElse(T t1):如果Optional内部的value非空，则返回此value值。如果value为空，则返回t1.
        String str2 = op1.orElse("shanghai");
        System.out.println("str2 = " + str2);
    }


    @Test
    public void test4() {
        String str = "1212";
        String s = Optional.ofNullable(str).orElse("默认值");
        System.out.println(s);
    }

    class ThreadTestStringBuilder implements Runnable {
        public StringBuilder  stringBuilder;
        ThreadTestStringBuilder(StringBuilder stringBuilder) {
            this.stringBuilder = stringBuilder;
        }

        @Override
        public void run()
        {
            for (int j=0; j < 100; j++) {
                stringBuilder.append("a");
            }
        }
    }

    @Test
    public void test5() throws InterruptedException {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i=0; i<10; i++) {
            (new Thread(new ThreadTestStringBuilder(stringBuilder))).start();
        }
        Thread.sleep(100);
        System.out.println(stringBuilder.length());
    }
}
