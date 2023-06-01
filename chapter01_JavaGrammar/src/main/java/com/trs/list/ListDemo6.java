package com.trs.list;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author : gaoziman
 * @description : List去重第；六种方式
 * @date 2023/6/1 9:20
 * Stream去重(有序)
 */
public class ListDemo6 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

            list.add(1);
            list.add(3);
            list.add(5);
            list.add(2);
            list.add(1);
            list.add(3);
            list.add(7);
            list.add(2);
        System.out.println("原集合:" + list);
        method(list);
    }

    /**
     * 使用 Stream 去重
     * @param list
     */
    public static void method(List<Integer> list) {
        list = list.stream().distinct().collect(Collectors.toList());
        System.out.println("去重集合:" + list);
    }

}
