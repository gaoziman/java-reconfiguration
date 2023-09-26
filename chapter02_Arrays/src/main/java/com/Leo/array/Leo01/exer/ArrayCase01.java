package com.Leo.array.Leo01.exer;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author : Leo
 * @version 1.0
 * @date 2023/9/24/024 11:06
 * @description : 数组案例1
 *
 * 创建一个 char 类型的 26 个元素的数组，分别 放置'A'-'Z'。
 * 使用 for 循环访问所有元素并打印出来。
 * 提示：char 类型数据运算 'A'+1 -> 'B'
 */
public class ArrayCase01
{
    
    public static void main(String[] args)
    {

        char[] chars = new char[26];

        for (int i = 0; i <chars.length; i++) {
                chars[i]  = (char) ('A' + i);
                System.out.print(chars[i] + " ");
        }

        System.out.println("初始化的字符数组:  " + new String(chars));
    }
}
