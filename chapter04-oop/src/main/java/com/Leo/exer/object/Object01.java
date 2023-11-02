package com.Leo.exer.object;

import java.util.List;

/**
 * @author : Leo
 * @version 1.0
 * @date 2023/10/10/010 13:31
 * @description :
 */
public class Object01 {

    public static void main(String[] args) {
        Person p1 = new Person();
        p1.setName("Jim");
        p1.setAge(18);
        Person p2;
        p2 = p1;
        System.out.println(p2.getName());
        p2.setAge(20);
        p2 = null;
        System.out.println(p1.getAge());
        System.out.println(p2.getAge());
    }
}