package com.hmc.domain.java8test;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * Author:meice Huang
 * Time: 2019-10-31 13:53
 */
public class SortCollection {

    public static void main(String[] args) {

    }

    @Test
    public void sortList() {

        /**
         * 一、基础类型List排序
         */

        List<Integer> nums = Arrays.asList(1, 2, 4, 9, 1, 23, 4, 5, 90, 10);
        List<String> numsStr = Arrays.asList("daf", "111", "fdkaf", "cdafd", "effdd", "wewewe", "zzz", "a", "A", "333");
        nums.sort(Comparator.naturalOrder());
        System.out.println("Integer：ASC:" + nums);
        nums.sort(Comparator.reverseOrder());
        System.out.println("Integer：DESC:" + nums);

        System.out.println();
        numsStr.sort(Comparator.naturalOrder());
        System.out.println("String:ASC" + numsStr);
        numsStr.sort(Comparator.reverseOrder());
        System.out.println("String:DESC" + numsStr);

        List<Apple> apples = new ArrayList<>();
        apples.add(new Apple("red", 10, 123));
        apples.add(new Apple("white", 8.5, 234));
        apples.add(new Apple("red", 3.4, 345));
        apples.add(new Apple("red", 5.6, 88));
        apples.add(new Apple("red", 5.6, 98));
        apples.add(new Apple("red", 7.6, 98));

        System.out.println();

        /**
         * 二、对象List单属性排序
         */

        /**
         * 法1：java8之前写法
         */
       /*
        Collections.sort(apples, new Comparator<Apple>() {
            @Override
            public int compare(Apple o1, Apple o2) {
                double weight1 = o1.getWeight();
                double weight2 = o2.getWeight();
                return weight2 > weight1 ? 1 : (weight1 == weight2) ? 0 : -1;//DESC ASC写法见下个例子
            }
        });*/

        /**
         * 法2：跟法1区别只是在升序、降序
         */
        /*apples.sort(new Comparator<Apple>() {
            @Override
            public int compare(Apple o1, Apple o2) {
                double weight1 = o1.getWeight();
                double weight2 = o2.getWeight();
                return weight1 < weight2 ? -1 : (weight1 == weight2) ? 0 : 1;//ASC
            }
        });*/

        /**
         * 法3：（推荐指数 ****）
         */
//        apples.sort((Apple a1,Apple a2)-> a2.getIntVar().compareTo(a1.getIntVar()));

        /**
         * 法4（推荐指数 *****）
         */

//        apples.sort(Comparator.comparing(Apple::getIntVar).reversed());//默认升序，降序:.reversed())即可

        /**
         * 法5(强烈不推荐，太啰嗦)
         */
/*
        Comparator<Apple> appleComparator = (Apple a1, Apple a2) -> a1.getIntVar().compareTo(a2.getIntVar());
        apples.sort(appleComparator);
        apples.sort(appleComparator.reversed());*/

        /**
         * 三、对象List多属性排序
         */

        /**
         * 多属性排序写法1：
         * 预期结果：intVal降序排
         * 如果intVal相同，weight降序排
         */
      /*  Comparator<Apple> comparator = (Apple a1, Apple a2) -> {
            if (a1.getIntVar()==a2.getIntVar()) {
                return a1.getWeight() > a2.getWeight() ? 1 : (a2.getWeight() == a1.getWeight() ? 0 : -1);
            }
            return a2.getIntVar().compareTo(a1.getIntVar());
        };*/

        /**
         * 多属性排序写法2：
         */

        apples.sort((Comparator.comparing(Apple::getWeight).reversed()).thenComparing(Apple::getIntVar));




        apples.forEach((apple -> System.out.println(apple)));



    }
}
