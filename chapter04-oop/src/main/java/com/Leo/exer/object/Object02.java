package com.Leo.exer.object;

/**
 * @author : Leo
 * @version 1.0
 * @date 2023/10/10/010 13:31
 * @description :
 */
public class Object02 {

    public static void main(String[] args) {
        Object02 obj = new Object02();
        Person p3 = new Person("Johnny", 20);
        Person p4 = obj.getObject1(p3);
        Person p5 = obj.getObject2(p3);
        System.out.println("getObject1==" + (p3 == p4));
        System.out.println("getObject2==" + (p3 == p5));
    }


    public Person getObject1(Person p1) {
        Person p2;
        p2 = p1;
        return p2;
    }
    public Person getObject2(Person p1) {
        Person p2 = new Person();
        p2.setName(p1.getName());
        p2.setAge(p1.getAge());
        return p2;
    }
}
