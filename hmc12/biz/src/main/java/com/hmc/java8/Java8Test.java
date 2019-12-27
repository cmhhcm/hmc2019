package com.hmc.java8;

import com.hmc.command.ConditionGroup;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

/**
 * Author:meice Huang
 * Time: 2019-12-25 22:33
 */
public class Java8Test {

    @Test
    public void testStream() {
        List<Integer> numbers = Arrays.asList(3, 2, 2, 3, 7, 3, 5);
        List<Integer> newNumbers = new ArrayList<>();
        numbers.forEach(num -> {
            newNumbers.add(num * num);
        });
        System.out.println(newNumbers.toString());

        /**
         * 统计
         */
        IntSummaryStatistics statis = numbers.stream().mapToInt(x -> x).summaryStatistics();
        System.out.println("最大的数："+statis.getSum());
        System.out.println("最小的数:"+statis.getMin());
        System.out.println("之和:"+statis.getSum());
        System.out.println("平均数:"+statis.getAverage());

        List<String> strings = Arrays.asList("abc", "", "bc", "efg", "abcd", "", "jkl");

        /**
         * 过滤
         */
        List<String> filtered = strings.stream().filter(string -> !string.isEmpty()).collect(Collectors.toList());

        String mergedStr = strings.stream().filter(str -> !str.isEmpty()).collect(Collectors.joining(", "));
        long count = strings.stream().filter(str -> str.isEmpty()).count();

        System.out.println(filtered.toString());
        System.out.println(count);
        System.out.println(mergedStr);

        /**
         * map
         */
        List<Integer> squareList = numbers.stream().map(i -> i * i).distinct().collect(Collectors.toList());

        /**
         * forEach
         */
        System.out.println();

        /**
         * limit
         */
        Random random = new Random();
        random.ints().limit(10).forEach(System.out::println);

        /**
         * sorted
         */
        Random random1 = new Random();
        random1.ints().limit(10).sorted().forEach(System.out::println);

        /**
         * Collectors
         */




    }

    private void searchProductsByConditionGroup(ConditionGroup conditionGroup) {
        return;
    }

    public void testOffsetLimit(int offset, int limit) {
        /**
         * 对offset limit做限制，超过10000即按照10000返回。
         * 终版：
         */
        if (offset > 10000) {
            offset = 0;
            limit = 10000;
        }
        if ((offset + limit) > 10000) {
            limit = 10000 - offset;
        }
        searchProductsByConditionGroup(new ConditionGroup(offset,limit));
    }
}
