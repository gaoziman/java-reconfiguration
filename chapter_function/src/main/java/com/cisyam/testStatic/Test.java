package com.cisyam.testStatic;

/**
 * @author : Leo
 * @version 1.0
 * @date 2023/8/18 11:06
 * @description :
 */
class Book{

    // 设置一个默认的值

    static String pub = "清华大学出版社";

    // 用来和 static 作为对比

    String description = "描述";

    // Book 类正常的属性

    private String title;
    private double price;

    // Book 的构造类

    public Book(String title, double price) {
        this.title = title;
        this.price = price;
    }

    // 获取 Book 的信息

    public void getInfo(){
        System.out.println("图书名称："+ this.title + "，价格为："+ this.price + "，出版社为："+ pub + "，描述 "+ this.description);
    }
}

public class Test {

    public static void main(String[] args) {
        // 实例化三个Book类
        Book book1 = new Book("Android开发实战", 69.8);
        Book book2 = new Book("Java EE开发实战", 49.8);
        Book book3 = new Book("Java 开发教程", 79.8);

        // 在没有设置 pub 属性的情况下输出
        book1.getInfo();
        book2.getInfo();
        book3.getInfo();

        System.out.println("————————————————————无敌分割线————————————————————");

        // 我们使用 Book 类直接调用pub
        Book.pub = "中信出版社";

        book1.description = "这本书很牛逼，看了你就知道";

        book1.getInfo();
        book2.getInfo();
        book3.getInfo();
    }
}
