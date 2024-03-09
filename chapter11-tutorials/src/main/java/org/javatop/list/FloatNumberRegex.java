package org.javatop.list;

public class FloatNumberRegex {
    public static void main(String[] args) {
        // 正则表达式字符串
        String regex = "[-+]?[0-9]*\\.?[0-9]+([eE][-+]?[0-9]+)?";

        // 测试字符串数组
        String[] testStrings = {
            "123", "-123", "+123.45", ".45", "-.45",
            "1.", "-1.", "+0.123", "-.5E10", "+1.5e+3",
            "3E2"
        };

        for (String test : testStrings) {
            if (test.matches(regex)) {
                System.out.println(test + ": 匹配");
            } else {
                System.out.println(test + ": 不匹配");
            }
        }
    }
}