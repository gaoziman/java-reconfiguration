package com.Leo.array.Leo01.sort;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

/**
 * @author : Leo
 * @version 1.0
 * @date 2023/9/26/026 11:34
 * @description : 冒泡排序
 */
public class ArrayBubbleSort {

    /**
     * 用于测试: 冒泡排序基本写法
     */
    @Test
    public void testBubbleSort01() {

        int[] arr = {73,88,41, 23, 93, 14, 25, 3, 1, 10, 4, 2 };

        int temp = 0;

        int len = arr.length - 1;


        // 外层循环负责总轮数
        for (int i = 0; i < len; i++) {
            // 内层循环负责每轮的第(i+1)次处理
            for (int j = 0; j < len - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }

            // 循环打印每一轮的数量
            System.out.println("\n第"+ (i+1)+"轮处理的数组: ");
            for (int j = 0; j <arr.length; j++) {
                System.out.print(arr[j] + "\t");
            }
        }

        System.out.println();
        System.out.println("新序列: " + Arrays.toString(arr));

    }


    /**
    * 用于测试: 冒泡排序第二种写法
     *
         原始数据：
         3,2,7,6,8

          第1次循环：(最大的跑到最右边)

          2,3,7,6,8 (3和2比较，2<3，所以2和3交换位置)
          2,3,7,6,8 (虽然不需要交换位匿：但是3和7还是需要比较一次。)
          2,3,6,7,8 (76交换位匿)
          2,3,6,7,8 (虽然不需要交换位置：但是3机还是需要比较-次。)

         经过第1次循环，此时菊剩下参与比较的数据：2,3,6,7进行第2次循环：
         2,3,6,7 (2和3比较，不需要交换位置)
         2,3,6,7 (36比较， 不需要交换位置)
         2,3,6,7 (67比较， 不需要交换位置)

         经过第2次循环，此时剩下参与比较的数据：2,3,6进行第3次循环：

         2,3,6(2和3比较，不需要交换位置)
         2,3,6(36比较，不需要交换位置)

         经过第3次循环，此时剩下参与比较的数据：2,3进行第4次循环：

        2,3(2和3比较，不需要交换位置)
    */
    @Test
    public void testBubbleSort02()
    {
        int[] arr = {6, 8,3,2,7, 23,  20};

        int temp = 0;

        int len = arr.length - 1;


        // 外层循环负责总轮数
        for (int i = len; i >0; i--) {
            // 内层循环负责每轮的第(i+1)次处理
            for (int j = 0; j < i; j++) {
                if (arr[j] > arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }

            // 循环打印每一轮的数量
            System.out.println("\n第"+ (i)+"轮处理的数组: ");
            for (int j = 0; j <arr.length; j++) {
                System.out.print(arr[j] + "\t");
            }
        }

        System.out.println();
        System.out.println("新序列: " + Arrays.toString(arr));
    }

}
