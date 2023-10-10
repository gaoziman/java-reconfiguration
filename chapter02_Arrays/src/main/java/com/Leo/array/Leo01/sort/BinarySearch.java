package com.Leo.array.Leo01.sort;

/**
 * @author : Leo
 * @version 1.0
 * @date 2023/10/9/009 15:02
 * @description : 二分法查找
 */
public class BinarySearch {
    public static void main(String[] args) {
        int[] data = {11,12,13,14,15,16,17,18,19,20};
        int index = binarySearch(data, 18);
        System.out.println(index);
    }

    //采用折半法查询，必须建立在排序的基础上
    private static int binarySearch(int[] data, int value) {
        //开始下标
        int beginPos = 0;
        //结束下标
        int endPos = data.length - 1;

        while (beginPos <=endPos) {
            int midPos = (beginPos + endPos)/2;
            if (value == data[midPos]) {
                return midPos;
            }else if (value > data[midPos]) {
                beginPos = midPos + 1;
            }else if (value < data[midPos]) {
                endPos = midPos - 1;
            }
        }
        return -1;
    }

}
