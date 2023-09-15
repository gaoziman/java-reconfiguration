package com.cisyam.functioon;

import java.util.function.IntPredicate;

/**
 * @author : gaoziman
 * @description : 函数式编程
 * @date 2023/7/19 22:02
 */
public class DemoTest01
{
    public static void main(String[] args)
    {
/*        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("新线程中的run方法开始执行");
            }
        }).start()Integer[] {1, 2, 3, 4, 5}       */

//        printNum(new IntPredicate()
//        {
//            @Override
//            public boolean test(int value)
//            {
//                return value%2 == 0;
//            }
//        });

        printNum(value -> value % 2 == 0);

    }

    public static void printNum(IntPredicate intPredicate)
    {
        int[] arr = {1,2,3,4,5,6,7,8};
        for (int i = 0; i <arr.length ; i++)
        {
            if (intPredicate.test(arr[i]))
            {
                System.out.println(arr[i]);
            }
        }
    }
}
