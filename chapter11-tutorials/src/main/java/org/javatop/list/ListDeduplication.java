package org.javatop.list;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.TreeSet;
import java.util.stream.Collectors;

/**
 * @author : Leo
 * @version 1.0
 * @date 2023-12-06 9:10
 * @description :
 */
public class ListDeduplication {



    /**
     *  用于测试: List集合去重
     */
    @Test
    public void test1() {
        List<Integer> listWithDuplicates = new ArrayList<>();
        listWithDuplicates.add(1);
        listWithDuplicates.add(2);
        listWithDuplicates.add(2);
        listWithDuplicates.add(3);

        List<Integer> listWithoutDuplicates = new ArrayList<>(new HashSet<>(listWithDuplicates));
        System.out.println(listWithoutDuplicates);
    }



    /**
     *  用于测试: List集合去重
     */
    @Test
    public void test2() {
        List<Integer> listWithDuplicates = new ArrayList<>();
        listWithDuplicates.add(1);
        listWithDuplicates.add(2);
        listWithDuplicates.add(2);
        listWithDuplicates.add(3);
        for (int i = 0; i < listWithDuplicates.size(); i++) {
            for (int j = i + 1; j < listWithDuplicates.size(); j++) {
                if (listWithDuplicates.get(i).equals(listWithDuplicates.get(j))) {
                    listWithDuplicates.remove(j);
                }
            }
        }
        System.out.println(listWithDuplicates);
    }


    /**
     *  用于测试: 使用TreeSet去重
     */
    @Test
    public void test3() {
        List<Integer> listWithDuplicates = new ArrayList<>();
        listWithDuplicates.add(1);
        listWithDuplicates.add(1);
        listWithDuplicates.add(1);
        listWithDuplicates.add(2);
        listWithDuplicates.add(3);
        listWithDuplicates.add(3);
        listWithDuplicates.add(3);
        TreeSet<Integer> set = new TreeSet<>(listWithDuplicates);
        //把List集合所有元素清空
        listWithDuplicates.clear();
        //把TreeSet集合所有元素添加到List集合中
        listWithDuplicates.addAll(set);
        System.out.println(listWithDuplicates);
    }
    
    
    /**
     *  用于测试: List集合去重
     */
    @Test
    public void test4() {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(1);
        list.add(2);
        list.add(2);
        list.add(3);
        list.add(3);

        List<Integer> listWithoutDuplicates = list.stream()
                .distinct()
                .collect(Collectors.toList());
        System.out.println(listWithoutDuplicates);
    }
}
