package com.Leo.array.Leo01.sort;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

/**
 * @author : Leo
 * @version 1.0
 * @date 2023/9/26/026 11:34
 * @description : 选择排序
 * <p>
 * 选择排序比目泡排序的效率高。高在交换位置的次数上。
 * 选择排序的交换位置是有意义的。
 * 循环一次，然后找出参加比较的这堆数据中最小的，拿着这个最小的值和最前面的数据交换位置。
 */
public class ArraySelectSort {

    /**
     * 用于测试: 选择排序基本写法
     */
    @Test
    public void testSelectSort01() {

        int[] arr = {73, 88, 41, 23, 93, 14, 25, 3, 10, 4, 2, 1};

        int temp = 0;


        for (int i = 0; i < arr.length - 1; i++) {
            // 假设i是最小的
            int min = i;
            // i正好是参加比较的这堆数据中”最左边那个元奉的下标。
            // 第二层循环指的是除了第一层的所有元素，最后剩下的元素中 最小的那个元素
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[min]) {
                    // 最小的是J ，并将其与后面所有元素进行交换
                    min = j;
                }
                if (min != i) {
                    temp = arr[min];
                    arr[min] = arr[i];
                    arr[i] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }

}
