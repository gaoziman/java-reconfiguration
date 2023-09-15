package com.cisyam.functioon;

import cn.hutool.core.util.RandomUtil;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author : gaoziman
 * @description :
 * @date 2023/8/2 21:08
 */
public class Demo04Test {

    @Test
    public void test01()
    {
        String str = "熟练Java、Spring、SpringMCV、MyBatis 等Java基础。熟悉使用Vue框架、vue-router、vue-cli脚手架、Element-UI进行MVVM模式下的项目搭建与前后端交互。";
//        List<String> list = new ArrayList<>(Arrays.asList(str.split("。")));
//        System.out.println("list = " + list);


        List<String> skillList = new ArrayList<>();
        String[] split = str.split("。");
        for (String s : split) {

            skillList.add(s);
        }
        System.out.println("skillList = " + skillList);

    }


    @Test
    void test02() {
        for (int i = 0; i < 50; i++) {
            System.out.println("randomInt = " +  RandomUtil.randomString(4));
        }

    }
}
