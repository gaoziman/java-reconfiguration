package com.cisyam.testStatic;

/**
 * @author : Leo
 * @version 1.0
 * @date 2023/8/18 11:19
 * @description :
 */
class Book2{

    // 设置一个默认的值
    static String pub = "清华大学出版社";

    // 用来和 static 作为对比
    String description = "描述";

    // Book 类正常的属性
    private String title;
    private double price;

    // Book 的构造类
    public Book2(String title, double price) {
        this.title = title;
        this.price = price;
    }

    // 获取 Book 的信息
    public void getInfo(){
        System.out.println("图书名称："+ this.title + "，价格为："+ this.price + "，出版社为："+ pub + "，描述 "+ this.description);
    }
}

public class Test3 {

    public static void main(String[] args) {
        // 在没有实例化对象时，就调用
        System.out.println(Book.pub);

        // 没事实例化对象的时候，去给static属性赋值上默认值
        Book2.pub = "北京大学出版社";
        System.out.println(Book.pub);

        // 新建一个类，输入 pub 属性
        Book2 book = new Book2("Java", 88);
        book.getInfo();
    }
}
