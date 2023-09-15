package com.cisyam.testStatic;

/**
 * @author : Leo
 * @version 1.0
 * @date 2023/8/18 11:29
 * @description :
 */
class Test4{
    static {
        System.out.println("静态代码块执行");
    }

    {
        System.out.println("普通代码块执行");
    }

    public Test4(){
        System.out.println("This is Test()");
    }

    public Test4(String string){
        System.out.println("This is Test(String string)");
    }
}

public class Demo2 {
    public static void main(String[] args) {
        System.out.println("------------------------");
        Test4 test1 = new Test4();
        System.out.println("------------------------");
        Test4 test2 = new Test4("Hello");
    }
}
