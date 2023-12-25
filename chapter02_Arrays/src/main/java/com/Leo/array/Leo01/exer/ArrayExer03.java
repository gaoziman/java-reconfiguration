package com.Leo.array.Leo01.exer;


/**
 * @author : Leo
 * @version 1.0
 * @date 2023/9/24/024 11:06
 * @description : 数组练习3
 * <p>
 * 一个养鸡场有 6 只鸡，它们的体重分别是 3kg,5kg,1kg,3.4kg,2kg,50kg 。
 * 请问这六只鸡的总体重是多少?平均体重是多少? 请你编一个程序。
 */
public class ArrayExer03 {

    public static void main(String[] args) {
        // 1. 使用for循环来计算以下的平均体重/ double hen1 = 3;
        // double hen2 = 5;
        // double hen3 = 1;
        // double hen4 = 3.4;
        // double hen5 = 2;
        // double hen6 = 50;
        // double totalWeight = hen1 + hen2 + hen3 + hen4 + hen5 + hen6;
        // double avgWeight = totalWeight / 6;
        // System.out.println("总体重=" + totalWeight
        // + "平均体重=" + avgWeight);
        //比如，我们可以用数组来解决上一个问题 => 体验


        //1. double[] 表示 是 double 类型的数组， 数组名 hens
        //2. {3, 5, 1, 3.4, 2, 50} 表示数组的值/元素,依次表示数组的

        double[] hens = {3, 5, 1, 3.4, 2, 50, 7.8, 88.8, 1.1, 5.6, 100};
        //遍历数组得到数组的所有元素的和， 使用 for循环来得到

        //1. 我们可以通过 hens[下标] 来访问数组的元素

        // 下标是从 0 开始编号的比如第一个元素就是 hens[0]
        // 第 2 个元素就是 hens[1] , 依次类推

        //2. 通过 for 就可以循环的访问 数组的元素/值

        //3. 使用一个变量 totalWeight 将各个元素累积

        System.out.println("===使用数组解决===");
        double totalWeight = 0;
        for (int i = 0; i < hens.length; i++) {
            totalWeight += hens[i];
        }
        System.out.println("总体重=" + totalWeight + "平均体重=" + (totalWeight / hens.length));

    }
}
