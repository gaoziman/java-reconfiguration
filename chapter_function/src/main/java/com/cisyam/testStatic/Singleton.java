package com.cisyam.testStatic;

public class Singleton {
    private static class SingletonHolder {
	    private static final Singleton INSTANCE = new Singleton();
    }
 
    private Singleton (){}
 
    public static final Singleton getInstance() {
	    return SingletonHolder.INSTANCE;
    }
}
 
class Demo3 {

    public static void main(String[] args) {
        Singleton singleton = Singleton.getInstance();
        System.out.println(singleton);
    }

}
 
