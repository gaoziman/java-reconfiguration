package com.Leo.array.Leo01.exer;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author : Leo
 * @version 1.0
 * @date 2023/9/24/024 11:06
 * @description : 数组练习2
 */
public class ArrayExer02 {

    public static void main(String[] args) {

        // 1. 基本数据类型值传递 / 值拷贝

        int a1 = 6;
        int a2 = a1;

        System.out.println(a1);
        System.out.println(a2);


        System.out.println("-------------------");

        //2. 引入数据类型 引用传递

        int[] array1 = {1, 2, 3, 5, 53};

        int[] array2 = array1;

        array2[0] = 100;

        for (int i = 0; i < array2.length; i++) {
            System.out.println(array2[i]);
        }

        // 此时数组1中的值也被修改 这就是数组的引用传递
        System.out.println(Arrays.toString(array1));


        System.out.println("============================");

        // 下面使用new 的方式创建一个跟array1数组相同长度的数组
        int[] array3 = new int[array1.length];

        for (int i = 0; i < array1.length; i++) {
            array3[i] = array1[i];
        }
        System.out.println(Arrays.toString(array3));

        array3[1] = 200;

        // 修改array3 不会对arr1 造成任何影响 因为array3 的引用指向的是一个新的数组 是我们新创建的数组 会在对内存中重新分配
        System.out.println("------------------");
        System.out.println(Arrays.toString(array3));
        System.out.println(Arrays.toString(array1));
    }
}
