package org.javatop.list;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;

/**
 * @author : gaoziman
 * @description :  List去重第四种方式
 * @date 2023/6/1 9:17
 * LinkedHashSet去重(有序)
 */
public class ListDemo4 {
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
     * 使用 LinkedHashSet 去重
     */
    public static void method(List<Integer> list) {
        LinkedHashSet<Integer> set = new LinkedHashSet<>(list);
        System.out.println("去重集合:" + set);
    }

}
