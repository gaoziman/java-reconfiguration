package com.Leo.array.Leo01;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author : Leo
 * @version 1.0
 * @date 2023/9/25/025 22:33
 * @description : 用于测试: 使用简单循环缩减数组
 */
public class ArrayReduction01
{
    public static void main(String[] args)
    {

        int[] array = {1, 2, 3, 4, 5};

        Scanner scanner = new Scanner(System.in);
        int index = array.length - 1;

        while (index >= 0)
        {
            System.out.println("当前数组: " + Arrays.toString(array));
            System.out.print("是否继续缩减数组？(y/n): ");
            String input = scanner.nextLine();

            if (input.equalsIgnoreCase("y")) {
                if (index == 0)
                {
                    System.out.println("不能再继续缩减数组了！");
                    break;
                }
                int[] newArray = new int[index];
                System.arraycopy(array, 0, newArray, 0, index);
                array = newArray;
                index--;
            } else if (input.equalsIgnoreCase("n"))
            {
                break;
            } else
            {
                System.out.println("无效的输入，请输入 'y' 或 'n'.");
            }
        }
    }




}
