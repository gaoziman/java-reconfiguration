package com.cisyam.testStatic;

/**
 * @author : Leo
 * @version 1.0
 * @date 2023/8/18 11:38
 * @description :
 */
public class User {

    private static String name;

    public void setName(String name) {
        this.name = name;
    }

    public static String getName() {
        return User.name;
    }
}
