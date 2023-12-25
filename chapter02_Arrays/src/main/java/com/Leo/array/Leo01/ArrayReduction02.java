package com.Leo.array.Leo01;


import java.util.Arrays;
import java.util.Scanner;

/**
 * @author : Leo
 * @version 1.0
 * @date 2023/9/25/025 22:33
 * @description : 用于测试: 使用递归的方式缩减数组
 */
public class ArrayReduction02 {
    public static void main(String[] args) {

        int[] array = {1, 2, 3, 4, 5};

        Scanner scanner = new Scanner(System.in);
        int index = array.length - 1;

        reduceArray(array, index, scanner);

        if (index < 0) {
            System.out.println("不能再继续缩减数组了！");
        }
    }


    public static void reduceArray(int[] array, int index, Scanner scanner) {
        System.out.println("当前数组: " + Arrays.toString(array));

        if (index >= 0) {
            System.out.print("是否继续缩减数组？(y/n): ");
            String input = scanner.nextLine();

            if (input.equalsIgnoreCase("y")) {
                reduceArray(array, index - 1, scanner);
            } else if (!input.equalsIgnoreCase("n")) {
                System.out.println("无效的输入，请输入 'y' 或 'n'.");
                reduceArray(array, index, scanner);
            }
        }
    }
}
