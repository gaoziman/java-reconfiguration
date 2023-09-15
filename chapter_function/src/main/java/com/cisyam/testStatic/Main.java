package com.cisyam.testStatic;

/**
 * @author : Leo
 * @version 1.0
 * @date 2023/8/18 11:38
 * @description :
 */
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 创建一个3x3的二维数组
        int[][] array = new int[3][3];

        // 使用Scanner为二维数组赋值
        for (int i = 0; i < array.length; ++i) {
            for (int j = 0; j < array[i].length; ++j) {
                System.out.println("请输入第 " + (i+1) + " 行，第 " + (j+1) + " 列的值：");
                array[i][j] = scanner.nextInt();
            }
        }

        scanner.close();

        // 输出二维数组的每一个值
        for (int i = 0; i < array.length; ++i) {
            for (int j = 0; j < array[i].length; ++j) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println(); // 换行
        }
    }
}

