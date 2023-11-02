package com.Leo.exer.object01;

import java.util.*;

/**
 * @author : Leo
 * @version 1.0
 * @date 2023-10-26 16:09
 * @description : Dog 测试类
 */
class Dog {
    String name;
    int age;
    String color;

    Dog(String name, int age, String color) {
        this.name = name;
        this.age = age;
        this.color = color;
    }
}

class DogsKeeper {
    Map<String, Dog> dogsMap;

    DogsKeeper() {
        dogsMap = new HashMap<>();
    }

    void addDog(Dog dog) {
        dogsMap.put(dog.name, dog);
    }

    String findDog(String name) {
        Dog dog = dogsMap.get(name);
        if (dog == null) {
            return "小明没有这只小狗";
        } else {
            return "名字：" + dog.name + "，年龄：" + dog.age + "，颜色：" + dog.color;
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Dog dog1 = new Dog("小白", 3, "白色");
        Dog dog2 = new Dog("小花", 100, "花色");

        DogsKeeper keeper = new DogsKeeper();
        keeper.addDog(dog1);
        keeper.addDog(dog2);

        // 假设用户输入的是"小白"
        System.out.println(keeper.findDog("小白"));

        // 假设用户输入的是"小花"
        System.out.println(keeper.findDog("小花"));

        // 假设用户输入的是"小黄"
        System.out.println(keeper.findDog("小黄"));
    }
}