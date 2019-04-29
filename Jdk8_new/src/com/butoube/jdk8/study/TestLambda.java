package com.butoube.jdk8.study;


import org.junit.Test;

import java.util.*;

/**
 * jdk8
 * lambda studay
 * @author binguo
 * @date 2019/4/29
 */
public class TestLambda {

    //原来的匿名内部类
    @Test
    public void test1(){
        Comparator<Integer> comparator=new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return Integer.compare(o2,o1);
            }
        };
        TreeSet<Integer> treeSet=new TreeSet<>(comparator);
        treeSet.add(1);
        treeSet.add(10);
        treeSet.add(3);
        treeSet.add(2);
        treeSet.add(8);

        Integer[] array=treeSet.toArray(new Integer[5]);
        System.out.println(Arrays.toString(array));

    }

    //Lambda表达shi式
    @Test
    public void test2(){
        //使用lambda表达式
        Comparator<Integer> comparator=(x,y) -> Integer.compare(x,y);
        TreeSet<Integer> treeSet=new TreeSet<>(comparator);
        treeSet.add(1);
        treeSet.add(10);
        treeSet.add(3);
        treeSet.add(2);
        treeSet.add(8);

        Integer[] array=treeSet.toArray(new Integer[5]);
        System.out.println(Arrays.toString(array));
    }

    List<Employee> employees=Arrays.asList(
            new Employee("张三",12,334.555),
            new Employee("李四",38,9999.555),
            new Employee("王五",24,6666.555),
            new Employee("张三",40,7777.555)
    );
}
