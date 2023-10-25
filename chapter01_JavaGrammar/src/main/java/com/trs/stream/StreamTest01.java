package com.trs.stream;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.junit.jupiter.api.Test;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static java.util.Comparator.comparing;
import static java.util.stream.Collectors.toList;

/**
 * @author : Leo
 * @version 1.0
 * @date 2023-10-24 9:42
 * @description : 示例
 */

public class StreamTest01 {

    public static final List<Actor> actorList =
            Arrays.asList( new Actor(1001, "张三", 30, "演员"),
                    new Actor(1002, "李四", 70, "演员"),
                    new Actor(1003, "王五", 40, "演员"),
                    new Actor(1004, "赵六", 53, "演员"),
                    new Actor(1005, "莉莉", 35, "演员"),
                    new Actor(1006, "杨晓雪", 12, "演员"),
                    new Actor(1007, "李师傅", 55, "演员"),
                    new Actor(1008, "王胖子", 40, "演员"),
                    new Actor(1009, "齐肩发", 45, "演员"));

   /**
    *  用于测试: 使用Java8之前的做法
    */
   @Test
   public void test1() {


       List<Actor> ageList = new ArrayList<>();

       //筛选演员年龄小于40岁的
       for (Actor actor : actorList) {
           if (actor.getAge() <40){
               ageList.add(actor);
           }
       }

       //按照升序进行排序
       List<String> lowActoresName = new ArrayList<>();
       Collections.sort(ageList, new Comparator<Actor>() {
           public int compare(Actor c1, Actor c2) {
               return Integer.compare(c1.getId(), c2.getId());
           }
       });

       //存入string列表
       for (Actor d : ageList) {
           lowActoresName.add(d.getName());
       }

       //输出
       for (Actor lowCaloricActor : ageList) {
           System.out.println(lowCaloricActor);
       }

   }



   /**
    *  用于测试: 流式编程
    */
   @Test
   public void test2() {
       actorList.stream()
               // 过滤演员年龄小于40的
               .filter(c -> c.getAge() <40)
               // 用id进行排序
               .sorted(comparing(Actor::getId))
               // 合并map,拿到名字相同的去作用于各个演员
               .map(Actor::getName)
               // 转为list
               .collect(toList())
               // 输入
               .forEach(System.out::println);

   }


   /**
    *  用于测试:
    */
   @Test
   public void test3() {
       // findAny():返回流中任意一个元素,
       List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6);
       Optional<Integer> any = list.stream().findAny();
    // 并行流下每次返回的结果会不同
    // Optional<Integer> any = list.stream().parallel().findAny();
       System.out.println(any);
       System.out.println(any.isPresent());
       System.out.println(any.get());
    // findAny():返回流中任意一个元素,如果流为空，返回一个空的Optional
       List<Integer> list1 = Arrays.asList();
       Optional<Integer> any1 = list1.stream().findAny();
       System.out.println(any1);
       System.out.println(any1.isPresent());
   }


   /**
    *  用于测试:
    */
   @Test
   public void test5() {
       // findFirst()：返回流中的第一个元素
       List<Integer> integers = Arrays.asList(1, 2, 3);
       Optional<Integer> first = integers.stream().findFirst();
       System.out.println(first);
       System.out.println(first.isPresent()); // 判断是否不等于null,isPresent()相当于!=null的判断
       System.out.println(first.get());
//findFirst()：返回流中的第一个元素，如果流为空，返回一个空的Optional
       List<Integer> lls = Collections.EMPTY_LIST;
       Optional<Integer> first1 = lls.stream().findFirst();
       System.out.println(first1);
       System.out.println(first1.isPresent());
   }



   /**
    *  用于测试:
    */
   @Test
   public void test6() {

       // noneMatch()：判断流中元素是否都不符合传入的断言条件
       List<Integer> numList = Arrays.asList(1,2,3,4,5);
       boolean d = numList.stream().noneMatch(l -> l > 6);
       boolean d1 = numList.stream().noneMatch(l -> l > 1);
       System.out.println(d);
       System.out.println(d1);
// noneMatch()：判断流中元素是否都不符合传入的断言条件,流为空时永远返回true
       List<Integer> numist = Arrays.asList();
       boolean d2 = numist.stream().noneMatch(l -> l > 6);
       System.out.println(d2);
   }


   /**
    *  用于测试:
    */
   @Test
   public void test7() {
       // allMatch()：判断流中元素是否都符合断言条件
       List<Integer> ints = Arrays.asList(1,2,3,4,5);
       boolean c = ints.stream().allMatch(l -> l > 0);
       boolean c1 = ints.stream().allMatch(l -> l > 1);
       System.out.println(c);
       System.out.println(c1);
// allMatch()：判断流中元素是否都符合断言条件,如果流为空，永远返回true
       List<Integer> emptyList = new ArrayList<>();
       boolean c2 = emptyList.stream().allMatch(e -> e > 1);
       System.out.println(c2);
   }



   /**
    *  用于测试:
    */
   @Test
   public void test8() {
       // anyMatch()：判断流中数据是否有一个复合断言
       List<Integer> ins = Arrays.asList(1,2,3,4,5);
       boolean b = ins.stream().anyMatch(l -> l > 2);
       boolean b1 = ins.stream().anyMatch(l -> l > 5);
       System.out.println(b);
       System.out.println(b1);
// anyMatch()：判断流中数据是否有一个复合断言,如果流为空，永远返回false
       List<Integer> inss = Arrays.asList();
       boolean b2 = inss.stream().anyMatch(l -> l > 2);
       System.out.println(b2);
   }
   
   
   /**
    *  用于测试:
    */
   @Test
   public void test9() {
       // anyMatch()：判断流中数据是否有一个复合断言
       List<Integer> ins = Arrays.asList(1,2,3,4,5);
       boolean b = ins.stream().anyMatch(l -> l > 2);
       boolean b1 = ins.stream().anyMatch(l -> l > 5);
       System.out.println(b);
       System.out.println(b1);
// anyMatch()：判断流中数据是否有一个复合断言,如果流为空，永远返回false
       List<Integer> inss = Arrays.asList();
       boolean b2 = inss.stream().anyMatch(l -> l > 2);
       System.out.println(b2);
   }


   /**
    *  用于测试:
    */
   @Test
   public void test10() {
       // count()：返回流中元素的数量
       List<Integer> ls = Arrays.asList(1,2,3,4,5);
       long count = ls.stream().count();
       long count1 = ls.stream().filter(l -> l > 2).count();
       System.out.println(count);
       System.out.println(count1);
   }



   /**
    *  用于测试:
    */
   @Test
   public void test11() {
       // max()：返回流中的最大值
       List<Integer> num = Arrays.asList(1, 2, 3, 4, 5, 6);
       Integer maxNum = num.stream().max(Integer::compareTo).get();
       Integer max = num.stream().max(comparing(Function.identity())).get();
       System.out.println(maxNum);
       System.out.println(max);
   }


   /**
    *  用于测试:
    */
   @Test
   public void test12() {
       // min()：返回流中的最小值
       List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5, 6);
       Integer minNum = nums.stream().min(Integer::compareTo).get();
       Integer min = nums.stream().min((x,y) -> x.compareTo(y)).get();
       System.out.println(minNum);
       System.out.println(min);
   }


   /**
    *  用于测试:
    */
   @Test
   public void test13() {
       // collect()：负责收集流，将结果汇总,比如将下面的流中的结果汇总到一个集合中去
       List<Integer> skipNum = IntStream.range(1,100).skip(90)
               .boxed()
               .collect(Collectors.toList());
       System.out.println(skipNum);
   }


   /**
    *  用于测试:
    */
   @Test
   public void test14() {
       // reduce()：字符串拼接
       String reduceStr1 = Stream.of("ma", "zhi", "chu").reduce("", String::concat);
       String reduceStr2 = Stream.of("ma", "zhi", "chu").reduce("", (x,y)->x+y);
       System.out.println(reduceStr1);
       System.out.println(reduceStr2);
// reduce()：求和，identity(起始值)为0
       Integer total1 = Stream.of(1,2,3,4).reduce(0, Integer::sum);
       Integer total2 = Stream.of(1,2,3,4).reduce(0, (x, y) -> x +y);
       System.out.println(total1);
       System.out.println(total2);
// 求和，sumValue = 10, 无起始值
       Integer total3 = Stream.of(  1, 2, 3, 4).reduce(Integer::sum).get();
       System.out.println(total3);
// reduce()：求最小值
       double minValue = Stream.of(-1.1, 8.8, -2.2, -6.6).reduce(Double.MAX_VALUE, Double::min);
       System.out.println(minValue);
   }

   /**
    *  用于测试:
    */
   @Test
   public void test15() {
       // toArray()：将流中的元素放入到一个数组中
       String[] strings = Stream.of("ma", "zhi", "chu").toArray(String[]::new);
       System.out.println(Arrays.toString(strings));
   }


   /**
    *  用于测试:
    */
   @Test
   public void test16() {

       // forEachOrdered()：遍历流中每一个元素,执行顺序按照流的顺序
       Stream.of(1,2,3,4,5,6).forEachOrdered(System.out::println);
// forEachOrdered:遍历流中每一个元素,执行顺序按照流的顺序，.parallel()表示创建一个并行流
       Stream.of(1,2,3,4,5,6).parallel().forEachOrdered(System.out::println);
   }

   /**
    *  用于测试:
    */
   @Test
   public void test17() {
       // foreach:遍历流中每一个元素,执行顺序按照流的顺序
       Stream.of(1,2,3,4,5,6).forEach(System.out::println);
// foreach:遍历流中每一个元素,执行顺序不一定按照流的顺序，.parallel()表示创建一个并行流
       Stream.of(1,2,3,4,5,6).parallel().forEach(System.out::println);
   }
}
