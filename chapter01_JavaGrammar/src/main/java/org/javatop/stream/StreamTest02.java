package org.javatop.stream;

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

public class StreamTest02 {

   /**
    *  用于测试:
    */
   @Test
   public void test1() {

    // skip():跳过前面三个单词再返回
       List<String> words = Arrays.asList("mg", "chi", "cldfkju", "wait", "you", "follow");
       List<String> skipWord = words.stream().limit(4).collect(Collectors.toList());
       System.out.println(skipWord);

       // skip():跳过全部单词再返回
       List<String> emptyWord = words.stream().skip(6).collect(Collectors.toList());
       System.out.println(emptyWord);

       // skip():跳过超过单词长度的数目再返回
       List<String> emptyWord2 = words.stream().skip(10).collect(Collectors.toList());
       System.out.println(emptyWord);


   }

   /**
    *  用于测试:
    */
   @Test
   public void test2() {
       // limit()：取出100中的前十个
       List<Integer> limitNum = IntStream.range(1,100).limit(10)
               .boxed()
               .collect(toList());
       System.out.println(limitNum);

       // limit():取出前4个单词
       List<String> words = Arrays.asList("L", "e", "o", "wait", "you", "follow");
       List<String> limitWord = words.stream().limit(4).collect(toList());
       System.out.println(limitWord);
   }


   /**
    *  用于测试:
    */
   @Test
   public void test3() {
       // peek()：
       String[] arr = new String[]{"a","b","c","d"};
       Arrays.stream(arr)
               .peek(System.out::println)
               //a,b,c,d
               .count();

       // peek()+filter()
       Stream.of("L", "e", "o")
               .filter(e -> e.length() > 2)
               .peek(e -> System.out.println(e))
               .collect(Collectors.toList());
   }


   /**
    *  用于测试:
    */
   @Test
   public void test4() {
       // sorted:自然顺序排序
       List<Integer> nums = Arrays.asList(1, 3, 5, 6, 8, 2);
       List<Integer> sortedNum = nums.stream().sorted().collect(toList());
       System.out.println(sortedNum);

       // sorted:降序排序
       List<Integer> sortedNum2 = nums.stream().sorted(Comparator.reverseOrder()).collect(toList());
       System.out.println(sortedNum2);

       // sorted:使用Comparator
       List<Integer> sortedNums3 = nums.stream().sorted(comparing(n -> n)).collect(toList());
       System.out.println(sortedNums3);

       // 不用stream直接顺序排序
       nums.sort(comparing(Integer::intValue));
       System.out.println(nums);

       //不用stream直接降序排序
       nums.sort(comparing(Integer::intValue).reversed());
       System.out.println(nums);
   }


   /**
    *  用于测试:
    */
   @Test
   public void test5() {
       List<String> mzc = Stream.of("L","e","o","shi","shuo","ma")
                   .distinct()
               .collect(toList());
       System.out.println(mzc);
   }

   /**
    *  用于测试:
    */
   @Test
   public void test6() {
       // flatMap:将多层集合中的元素取出来，放到一个新的集合中去
       List<Integer> num1 = Arrays.asList(1, 2, 3);
       List<Integer> num2 = Arrays.asList(4, 5, 6);
       List<Integer> num3 = Arrays.asList(7, 8, 9);
       List<List<Integer>> lists = Arrays.asList(num1, num2, num3);
       Stream<Integer> outputStream = lists.stream().flatMap(l -> l.stream());
       List<Integer> flatMapResult = outputStream.sorted().collect(toList());
       System.out.println(flatMapResult);
   }



   /**
    *  用于测试:
    */
   @Test
   public void test7() {
       // 2、map：返回元素的大写类型和哈希值
       List<String> mzc = Arrays.asList("L", "e", "o");
       List<String> mzcUpperCase = mzc.stream().
               map(n -> n.toUpperCase()).
               collect(toList());
       List<Integer> mzcHashCode = mzc.stream().map(n -> n.hashCode()).collect(toList());
       System.out.println("mzcUpperCase:"+mzcUpperCase+" ----- mzcHashCode:"+mzcHashCode);
   }

   /**
    *  用于测试:
    */
   @Test
   public void test8() {
       // 1、filter,返回大于2的元素集合
       List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5);
           List<Integer> result = nums.stream().filter(n -> n > 2).collect(toList());
       System.out.println(result);
   }
}
