package com.Leo.exer.object;

/**
 * @author : Leo
 * @version 1.0
 * @date 2023/10/10/010 13:31
 * @description :
 */
public class Person {


    private String name;
    private Integer age;


    public Person() {
    }

    public Person(String name, Integer age) {
        this.name = name;
        this.age = age;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }


    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
