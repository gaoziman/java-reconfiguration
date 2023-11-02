package com.Leo.exer.method;

/**
 * @author : Leo
 * @version 1.0
 * @date 2023/10/10/010 13:36
 * @description : 方法练习
 */
public class Method01 {


    public static void main(String[] args) {
        Method01 m1 = new Method01();
        m1.test();
        int sum = m1.accumulate();
        System.out.println("累加结果:" + sum);
        int add = m1.add(1000);
        System.out.println("累加结果:" + add);
    }


    /**
     * 写一个简单的方法
     */
    public  void test() {
        System.out.println("我是一个简单的方法");
    }


    /**
     * 写一个计算1-1000的计算方法
     * @return result
     */
    public int accumulate() {
        int result = 0;
        for (int i = 0; i <= 1000; i++) {
            result += i;
        }
        return  result;
    }


    /**
     * 接收一个数n，计算1+。。+n的数
     * @param n
     * @return result
     */

    public int add(int n) {
        int result = 0;
        for (int i = 1; i <= n; i++) {
            result += i;
        }
        return result;
    }
}
