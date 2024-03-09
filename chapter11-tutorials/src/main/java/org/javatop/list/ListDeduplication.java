package org.javatop.list;

import org.junit.jupiter.api.Test;

import java.util.*;
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


    /**
     * 测试5
     */
    @Test
    public void test5() {
        // 写一个Java冒泡排序
        int[] array = {  5, 6, 7, 2, 9,1, 2, 3, 4,
                };
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - 1 - i; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(array));
        System.out.println("------------------------------------------------------");
        // 写一个选择排序并从大到小进行排序
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] < array[j]) {
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(array));
    }

    /**
     * 测试6
     */
    @Test
    public void test6() {
        // 写一个图片上传的功能
        for (int i = 0; i < 100; i++) {
            System.out.println(i);
            try {
                Thread.sleep(1000);
            }
            catch (InterruptedException e) {
                e.printStackTrace();
                return;
            }
            if (i == 50) {
                System.out.println("上传成功");
                return;
            }
        }
    }
}
