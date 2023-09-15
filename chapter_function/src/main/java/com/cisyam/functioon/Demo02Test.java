//package com.cisyam.functioon;
//
//
//import com.cisyam.pojo.Employee;
//import org.junit.jupiter.api.Test;
//
//import java.time.LocalDateTime;
//import java.util.*;
//import java.util.function.Consumer;
//import java.util.function.Supplier;
//import java.util.stream.IntStream;
//
///**
// * @author : gaoziman
// * @description : Stream 流
// * @date 2023/7/20 11:56
// */
//public class Demo02Test {
//
//    @Test
//    public void test01()
//    {
//        List<String> list = Arrays.asList("setUp ", "Hello", "5", "sleep", "test");
//        list.forEach(System.out::println);
//    }
//
//    @Test
//    public void test02()
//    {
//            String[] array = {"setUp", "Hello", "5", "sleep", "test"};
//            Arrays.stream(array).forEach(System.out::println);
//        }
//
//
//    @Test
//    public void test03()
//    {
//        //未使用Lambda表达式的写法
//        Comparator<Integer> com1 = new Comparator<Integer>() {
//            @Override
//            public int compare(Integer o1, Integer o2) {
//                return Integer.compare(o1,o2);
//            }
//        };
//
//        int compare1 = com1.compare(12, 32);
//        System.out.println("compare1 = " + compare1);
//        System.out.println("----------------------");
//        // 使用Lambda表达式的写法
//        Comparator<Integer> com2 = (o1, o2) -> Integer.compare(o1, o2);
//        int compare2 = com2.compare(12, 32);
//        System.out.println("compare2 = "+compare2);
//    }
//
//
//    @Test
//    public void test04()
//    {
//        //    无参有返回值
//        Runnable r1 = () -> System.out.println("Hello lambda");
//        r1.run();
//
//        System.out.println("-------------");
//
//        // Lamdba需要一个参数，但没有返回值
//        Consumer<String> con = (String str) -> System.out.println(str);
//        con.accept("test");
//        System.out.println("-------------");
//
//        // 数据类型可省略，因为可由编译器推断得出，称为类型推断
//        Consumer<String> cos = (str) -> System.out.println(str);
//        System.out.println("-------------");
//
//        //    Lamdba需要两个以上的参数，多条执行语句，并且可以有返回值
//        Comparator<Integer>com = Integer::compare;
//
//        int compare = com.compare(12, 27);
//        System.out.println("compare = " + compare);
//
//        System.out.println("-------------");
//
//        //  当Lamdba体只有一条语句时，return和大括号若有，都可以省略
//        Comparator<Integer>com2 = (o1,o2) ->	Integer.compare(o1,o2);
//
//
//    }
//
//    @Test
//    public void test05()
//    {
//        //使用Lambda表达
//        Employee emp = new Employee(1001, "Bruce", 34, 600);
//        Supplier<Integer> sup1 = () -> emp.getAge();
//        System.out.println(sup1.get());
//        System.out.println("====================");
//
//        Supplier<String> getName = emp::getName;
//        System.out.println("getName = " + getName.get());
//
////        Supplier<Employee> runnable = Employee::new;
////        System.out.println(runnable.get());
//
//
//    }
//
//
//    //创建 Stream方式二：通过数组
//
//    @Test
//    public void test06() {
//        int[] arrs = {1, 2, 3, 6, 2};
//        //调用Arrays类的static <T> Stream<T> stream(T[] array): 返回一个流
//        IntStream stream = Arrays.stream(arrs);
//
//        Employee e1 = new Employee(1001, "Tom");
//        Employee e2 = new Employee(1002, "Jerry");
//        Employee e3 = new Employee(1003, "Bruce");
//        Employee[] employees = {e1, e2,e3};
//        Arrays.stream(employees).filter(employee -> employee.getId() != 1001)
////                .sorted((o1,o2)-> Integer.compare(o2.getId(), o1.getId()))
//                .sorted((employee1,employee2)->{
//                    int ageValue = Integer.compare(employee1.getAge(), employee2.getAge());
//                    if (ageValue != 0){
//                        return ageValue;
//                    }else {
//                        return -Double.compare(employee1.getSalary(),employee2.getSalary());
//                    }
//
//                }).forEach(employee -> System.out.println("employee = " + employee));
//    }
//
//    @Test
//    public void test2()
//    {
//        String str = "hello";
//        str = null;
//        //of(T t):封装数据t生成Optional对象。要求t非空，否则报错。
//        Optional<String> op1 = Optional.of(str);
//        //get()通常与of()方法搭配使用。用于获取内部的封装的数据value
//        String str1 = op1.get();
//        System.out.println(str1);
//    }
//
//
//    @Test
//    public void test3()
//    {
//        String str ="Beijing";
////        str = null;
//        //ofNullable(T t) ：封装数据t赋给Optional内部的value。不要求t非空
//        Optional<String> op1 = Optional.ofNullable(str);
//        System.out.println(op1);
//        //orElse(T t1):如果Optional内部的value非空，则返回此value值。如果
//        //value为空，则返回t1.
//        String str2 = op1.orElse("shanghai");
//        System.out.println(str2);
//    }
//
//    @Test
//    public void test08()
//    {
////        getGirlName2(new Boy());
//    }
//
//    //使用Optional类的getGirlName()进行非空检验
//
//    /*public String getGirlName2(Boy boy)
//
//    {
//        Optional<Boy> boyOptional = Optional.ofNullable(boy);
//        //此时的boy1一定非空,boy为空是返回“迪丽热巴”
//        Boy boy1 = boyOptional.orElse(new Boy(new Girl("迪丽热巴")));
//
//        Girl girl = boy1.getGirl();
//        //girl1一定非空,girl为空时返回“古力娜扎”
//        Optional<Girl> girlOptional = Optional.ofNullable(girl);
//        Girl girl1 = girlOptional.orElse(new Girl("古力娜扎"));
//
//        return girl1.getName();
//    }*/
//
//
//    @Test
//    public void test11(){
////        Date date = "2023-07-27T16:00:00.000Z";
////        Date date = DateUtil.date();
////        System.out.println("date = " + date);
//
//        String format = DateUtil.format(LocalDateTime.parse("2023-07-27T16:00:00.000Z"), "yyyy-MM-dd HH:mm:ss");
//        System.out.println("format = " + format);
//    }
//}
