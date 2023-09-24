package com.Leo.array.Leo01;


import java.util.Arrays;

/**
 * @author : Leo
 * @version 1.0
 * @date 2023/9/24/024 11:06
 * @description : 数组案例2  数组反转
 *
 *
 * 要求: 把数组的元素内容反转。
 * arr {11,22,33,44,55,66} {66, 55,44,33,22,11}
 */
public class ArrayReverse01
{

    public static void main(String[] args)
    {
        // 把数组的元素内容反转

        // 使用交换的方式
        int[] arr1 = {11, 22, 33, 44, 55, 66};
        int temp;
        int len = arr1.length;
        // 先遍历所有的元素
        for (int i = 0; i < len/2; i++)
        {
            // 模拟交换数组中的两个元素
            temp = arr1[i];
            arr1[i] = arr1[len-1-i];
            arr1[len - i -1] = temp;
        }
        // 打印新数组
        System.out.println("反转后的数组: "+Arrays.toString(arr1));




        // 第一种方式:
        int[] arr = {11, 22, 33, 44, 55, 66};
        int[] arrReverse = new int[arr.length];
        for (int i = arr.length -1, j = 0; i >= 0; i--, j++)
        {
            arrReverse[j] = arr[i];
        }

        // 对arrReverse进行销毁
        // arr = arrReverse;
        System.out.println("反转之后的数组2:" + Arrays.toString(arrReverse));
        System.out.println("===========================================");

        // 第二种方式: 创建一个新的数组并上移
        int[] arrReverseNew = new int[arr.length];
        for (int i = 0, j = arr.length -1; i < arr.length; i++, j--)
        {
            arrReverseNew[j] = arr[i];
        }
        System.out.println("反转之后的数组: "+Arrays.toString(arrReverseNew));


        System.out.println("=============================================");

        // 第三种方式 - 创建一个新的数组并下移
        int[] arrReverseNew2 = new int[arr.length];
        for (int i = arr.length -1, j = 0; i >= 0; i--, j++)
        {
            arrReverseNew2[j] = arr[i];
        }
        System.out.println("反转之后的数组: "+Arrays.toString(arrReverseNew2));


        // 第四种方式: 要求在下移之后还原数组元素的相对顺序
        int[] arrReverseNew3 = new int[arr.length];
        int left = 0;
        int right = arr.length -1;
        while (left < right)
        {

            arrReverseNew3[left] = arr[right];
            left++;
            right--;
        }


        System.out.println("=============================================");



        // 第五种方式: 使用Apache的包组件
        System.out.println(Arrays.toString(Arrays.copyOfRange(arrReverseNew3, 0, arr.length)));
        System.out.println("======================");

    }
}
