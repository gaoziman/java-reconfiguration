package com.cisyam.testStatic;

/**
 * @author : Leo
 * @version 1.0
 * @date 2023/8/18 11:19
 * @description :
 */
class Test2{
    public static void sayHello(String name) {
        System.out.println("Hello," + name);
    }
}
 
public class Demo {
    public static void main(String[] args) {
        Test2.sayHello("Leo");
    }
}