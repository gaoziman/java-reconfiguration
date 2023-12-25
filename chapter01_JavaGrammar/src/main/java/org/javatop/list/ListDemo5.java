package org.javatop.list;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

/**
 * @author : gaoziman
 * @description : List去重第五种方式
 * @date 2023/6/1 9:18
 * TreeSet去重(无序)
 */
public class ListDemo5 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>() {{
            add(1);
            add(3);
            add(5);
            add(2);
            add(1);
            add(3);
            add(7);
            add(2);
        }};
        System.out.println("原集合:" + list);
        method(list);
    }

    /**
     * 使用 TreeSet 去重(无序)
     *
     * @param list
     */
    public static void method(List<Integer> list) {
        TreeSet<Integer> set = new TreeSet<>(list);
        System.out.println("去重集合:" + set);
    }

}
