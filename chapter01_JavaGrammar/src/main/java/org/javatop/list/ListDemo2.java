package org.javatop.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author : gaoziman
 * @description : List去重第二种方式
 * @date 2023/6/1 9:11
 * 迭代器去重(无序)
 * 自定义 List 去重，除了上面的新建集合之外，我们也可以使用迭代器循环判断每一项数据，
 * 如果当前循环的数据，在集合中存在两份或两份以上，
 * 就将当前的元素删除掉，这样循环完之后，也可以得到一个没有重复数据的集合，实现代码如下：
 */
public class ListDemo2 {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("aaa");
        list.add("bbb");
        list.add("aaa");
        list.add("abc");
        list.add("xyz");
        list.add("123");
        list.add("xyz");
        System.out.println("原来的集合 = " + list);

        method(list);
    }

    /**
     * 使用迭代器去重
     *
     * @param list
     */
    public static void method(List<String> list) {
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            // 获取循环的值
            Integer item = Integer.valueOf(iterator.next());
            // 如果存在两个相同的值
            if (list.indexOf(item) != list.lastIndexOf(item)) {
                // 移除最后那个相同的值
                iterator.remove();
            }
        }
        System.out.println("去重后的集合:" + list);
    }
}
