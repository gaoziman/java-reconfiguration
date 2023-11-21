package com.Leo.exer.string;

import java.util.ArrayList;
import java.util.List;

/**
 * @author : Leo
 * @version 1.0
 * @date 2023-11-21 9:38
 * @description : String 测试用例
 */
public class Test {


    /**
     *  用于测试: String 不可变性
     */
    @org.junit.jupiter.api.Test
    public void test01() {
        String s = new String("ABC");
        s = s+"abc";
        System.out.println("s = " + s);
    }


        //不可变的String
        public static String appendStr(String s){
            s+="bbb";
            return s;
        }

        //可变的StringBuilder
        public static StringBuilder appendSb(StringBuilder sb){
            return sb.append("bbb");
        }

        public static void main(String[] args){
            //String做参数
            String s = new String("aaa");
            String ns=Test.appendStr(s);
            System.out.println("String s >>> "+s);

            //StringBuilder做参数
            StringBuilder sb=new StringBuilder("aaa");
            StringBuilder sbn=Test.appendSb(sb);
            System.out.println("StringBuilder sbn >>> "+sb);
        }


        /**
         *  用于测试:
         */
        @org.junit.jupiter.api.Test
        public void test02() {
            String s1 = "Hollis";
            String s2 = "Chuang";
            String s3 = s1 + s2;
            String s4 = "Hollis" + "Chuang";
            System.out.println(s3 == s4);
        }



        /**
         *  用于测试:
         */
        @org.junit.jupiter.api.Test
        public void test03() {

            List<Integer> li = new ArrayList<>();
            for (int i = 1; i < 50; i ++){
                li.add(Integer.valueOf(i));
            }
            System.out.println("li = " + li);
        }
}
