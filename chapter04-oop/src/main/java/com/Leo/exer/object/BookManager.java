package com.Leo.exer.object;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author : Leo
 * @version 1.0
 * @date 2023-10-11 13:00
 * @description : 简易版图书管理系统
 */
class Book {
    private String title;
    private String author;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public String toString() {
        return "Book{" + "title='" + title + '\'' + ", author='" + author + '\'' + '}';
    }
}

public class BookManager {
    private static List<Book> books = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            System.out.println("-----------欢迎使用图书管理系统------------------");
            System.out.println("1.查看所有图书");
            System.out.println("2.图书入库");
            System.out.println("3.图书出库");
            System.out.println("4.修改图书信息");
            System.out.println("0.退出");
            System.out.println("-----------------------------------------------");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    showAllBooks();
                    break;
                case 2:
                    addBook();
                    break;
                case 3:
                    removeBook();
                    break;
                case 4:
                    modifyBook();
                    break;
                case 0:
                    System.out.println("退出系统");
                    return;
                default:
                    System.out.println("选择错误，请重新选择!");
                    break;
            }
        }
    }

    private static void showAllBooks() {
        if (books.isEmpty()){
            System.err.println("暂无图书,请添加图书!");
            return;
        }
        for (Book book : books) {
            System.out.println(book);
        }
    }

    private static void addBook() {
        System.out.print("输入图书名称: ");
        String title = scanner.next();
        System.out.print("输入作者名称: ");
        String author = scanner.next();
        books.add(new Book(title, author));
        System.out.println("图书入库成功!");
    }

    private static void removeBook() {
        System.out.print("输入要出库的图书名称: ");
        String title = scanner.next();
        Book foundBook = null;
        for (Book book : books) {
            if (book.getTitle().equals(title)) {
                foundBook = book;
                break;
            }
        }
        if (foundBook != null) {
            books.remove(foundBook);
            System.out.println("图书出库成功!");
        } else {
            System.out.println("没有找到该图书!");
        }
    }

    private static void modifyBook() {
        System.out.print("输入要修改的图书名称: ");
        String title = scanner.next();
        for (Book book : books) {
            if (book.getTitle().equals(title)) {
                System.out.print("输入新的图书名称: ");
                String newTitle = scanner.next();
                System.out.print("输入新的作者名称: ");
                String newAuthor = scanner.next();
                book.setTitle(newTitle);
                book.setAuthor(newAuthor);
                System.out.println("图书信息修改成功!");
                return;
            }
        }
        System.out.println("没有找到该图书!");
    }
}
