package com.Leo.array.Leo01.exer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 * @author : Leo
 * @version 1.0
 * @date 2023/9/24/024 11:06
 * @description : 数组练习
 */
public class ArrayExer01 {

    public static void main(String[] args) {

        // 1. 动态创建一个结果的数组
        int[] array = new int[3];
        for (int i = 0; i < array.length; i++) {
            System.out.println("请输入第" + (i + 1) + "个元素：");
            array[i] = new Scanner(System.in).nextInt();
        }
        System.out.println(Arrays.toString(array));


        System.out.println("====================");

        //  2. 使用静态方式创建数组
        int[] arrayStatic = {1, 4, 65, 66, 89, 3, 31, 45};
        // 获取数组的长度
        System.out.println(arrayStatic.length);
        // 获取数组第0个元素
        System.out.println(arrayStatic[0]);
        System.out.println("===================");
        // 3. 遍历数组的元素：遍历打印
        for (int i = 0; i < arrayStatic.length; i++) {
            System.out.println(arrayStatic[i]);
        }

        System.out.println("===================");
        // 4.倒序打印数组
        for (int i = arrayStatic.length - 1; i >= 0; i--) {
            System.out.println(arrayStatic[i]);
        }

    }
}
