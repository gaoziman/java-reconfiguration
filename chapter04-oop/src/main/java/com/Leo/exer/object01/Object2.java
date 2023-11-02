package com.Leo.exer.object01;


/**
 * @author : Leo
 * @version 1.0
 * @date 2023-10-26 22:44
 * @description :
 */
public class Object2 {

    private String name;

    private  int age;


    public Object2(){

    }

    public Object2(String name, int age) {
        this.name = name;
        this.age = age;
    }


    @Override
    public String toString() {
        return "Object2{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public static void main(String[] args) {
        Object2 object2 = new Object2("小三", 1);
        System.out.println("object2 = " + object2);



 }
}
