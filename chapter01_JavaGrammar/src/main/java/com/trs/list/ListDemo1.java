package com.trs.list;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author : gaoziman
 * @description : List去重第一种方式
 * @date 2023/6/1 9:05
 * contains判断去重(有序)
 * 要进行数据去重，我们首先想到的是新建一个集合，然后循环原来的集合，每次循环判断原集合中的循环项，
 * 如果当前循环的数据，没有在新集合中存在就插入，
 * 已经存在了就舍弃，这样当循环执行完，我们就得到了一个没有重复元素的集合了，实现代码如下：
 */
public class ListDemo1 {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("aaa");
        list.add("bbb");
        list.add("aaa");
        list.add("abc");
        list.add("xyz");
        list.add("1234");
        list.add("xyz");
//        System.out.println("原来的集合 = " + list);
//        new HashSet<>(list).forEach(s-> System.out.print(s));

        list.stream().filter(s -> s.length() >3)
                .forEach(System.out::println);

//        method(list);
    }


    /**
     * 自定义去重
     * @param list  1
     */
    public static void method(List<String> list) {
        // 新集合
        List<String> newList = new ArrayList<>(list.size());
        list.forEach(i -> {
            if (!newList.contains(i)) {
                // 如果新集合中不存在则插入
                newList.add(i);
            }
        });
        System.out.println("去重后的集合:" + newList);

    }
}
