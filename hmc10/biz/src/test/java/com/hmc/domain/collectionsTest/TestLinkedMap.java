package com.hmc.domain.collectionsTest;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;

/**
 * Author:meice Huang
 * Time: 2019-12-02 15:58
 */
public class TestLinkedMap {

    @Test
    public void testLinkedMap(){
        LinkedHashMap<Long,String> map = new LinkedHashMap<>();
        map.put(Long.valueOf(12),"1233");
        map.put(Long.valueOf(12),"1245");
        map.put(Long.valueOf(43),"3455");
        map.put(Long.valueOf(12),"1245");
        map.forEach((k,v)->{
            System.out.println("k "+k+"\t v"+v);
        });
    }

    @Test
    public void testSubList(){
        List<Integer> intList =  Arrays.asList(12,344,45,89,445);
        System.out.println(intList.subList(1,5));
    }

    @Test
    public  void testListSort(){
        List<String> list1 = new ArrayList<>();
        list1.add("111");
        list1.add("222");
        list1.add("333");
        list1.add("444");
        System.out.println(list1.toString());
    }

    /**
     * java.lang.Exception: Method testOffsetLimit should have no parameters
     * 	at org.junit.runners.model.FrameworkMethod.validatePublicVoidNoArg(FrameworkMethod.java:76)
     */
    @Test
    public void testOffsetLimit(){
        List<Integer> pageIds = Arrays.asList(12,23,34,45,89);
        int offset;
        int limit;
    }

    private static List<Integer> listCoveredResource(int offset, int limit) {
        List<Integer> pageIds = Arrays.asList(12, 23, 34, 45, 89);
        int size = pageIds.size();
        if (offset > size) {
            return Collections.emptyList();
        }
        if ((offset + limit) > size) {
            return pageIds.subList(offset, size);
        } else {
            return pageIds.subList(offset, offset + limit);
        }
    }
    public static void main(String[] args) {
        System.out.println(listCoveredResource(3,0));
    }

}
