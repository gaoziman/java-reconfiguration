package com.Leo.exer.json;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;

/**
 * @author : Leo
 * @version 1.0
 * @date 2023-11-21 19:54
 * @description : FastJsonObject
 */
public class FastJsonObject {

    public static void main(String[] args) {
        Person person = new Person("Leo", 20);

        // 1.将对象转换为json字符串
        String jsonStr = JSON.toJSONString(person);
        System.out.println("jsonStr = " + jsonStr);

        //2.将json字符串转换为JSONObject对象
        JSONObject jsonObject = JSON.parseObject(jsonStr);
        System.out.println("jsonObject = " + jsonObject);

        //3.将JSONObject转换为Java对象
//        JSONObject person1 = new JSONObject();
//        person1.put("name", "Leo222");
//        person1.put("age", 22);
//        System.out.println("person1 = " + person1);
        Person person2 = JSON.toJavaObject(jsonObject, Person.class);
        System.out.println("person2 = " + person2);

        //4 .将JSONObject转换为JSON字符串
        String jsonString = JSON.toJSONString(JSON.toJavaObject(jsonObject, Person.class));
        System.out.println("jsonString = " + jsonString);
    }
}
