package com.Leo.array.Leo01;


/**
 * @author : Leo
 * @version 1.0
 * @date 2023/9/24/024 11:06
 * @description : 数组案例2
 *
 *
 * 请求出一个数组 int[]的最大值 {4,-1,9, 10,23}，并得到对应的下标。
 */
public class ArrayCase02
{

    // 1.假定 max = arr[0] 是最大值 , maxIndex=0;
    // 2.从下标 1 开始遍历 arr， 如果 max < 当前元素，说明 max 不是真正的
   //  最大值, 我们就 max=当前元素; maxIndex=当前元素下标
  //   3. 当我们遍历这个数组 arr 后 , max 就是真正的最大值，maxIndex 最大值
    
    public static void main(String[] args)
    {

        int[] array = {4,-1,9, 10,23};

        //假定第一个元素就是最大值
        int max = array[0];
        int maxIndex = 0;

        for (int i = 0; i < array.length; i++)
        {
            if (max < array[i])
            {
                max = array[i];
                maxIndex = i;
            }
        }
        System.out.println("数组最大值为: " + max + " , "+"最大值下标为:" + maxIndex);
    }
}
