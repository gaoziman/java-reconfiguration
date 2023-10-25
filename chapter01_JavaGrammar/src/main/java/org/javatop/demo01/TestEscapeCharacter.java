package org.javatop.demo01;

/**
 * @author gaoziman
 */
public class TestEscapeCharacter {
    public static void main(String[] args){
        System.out.println("hello\t\tjava");
        System.out.println("hello\rjava");
        System.out.println("hello\njava");
        System.out.println("hello\\world");
        System.out.println("\"hello\"");
        char shuang = '"';
        System.out.println(shuang + "hello" + shuang);
        System.out.println("'hello'");
        char dan ='\'';
        System.out.println(dan + "hello" + dan);

        System.out.println(" ================= ");
        System.out.println("hello\tworld\tjava.");
        System.out.println("lisi\tis\tbeautiful.");
        System.out.println("姓名\t基本工资\t年龄");
        System.out.println("张三\t10000.0\t23");
    }
}
